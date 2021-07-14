// package com.veterinary_clinic_adm.register.controller;
// import com.veterinary_clinic_adm.register.controller.dto.AddressRq;
// import com.veterinary_clinic_adm.register.controller.dto.AddressRs;
// import com.veterinary_clinic_adm.register.model.Address;
// // import com.veterinary_clinic_adm.register.repository.AddressCustomRepository;
// import com.veterinary_clinic_adm.register.repository.AddressRepository;


package com.controller;
import com.controller.dto.AddressRq;
import com.controller.dto.AddressRs;
import com.model.Address;
import com.repository.AddressRepository;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.stream.Collectors;

// import com.veterinary_clinic_adm.register.repository.AddressCustomRepository;


 @RestController
 @RequestMapping("/api/address")
 public class AddressController {

     private final AddressRepository addressRepository;
     // private final AddressCustomRepository addressCustomRepository;

     public AddressController(AddressRepository addressRepository) {
         this.addressRepository = addressRepository;
         // this.addressCustomRepository = addressCustomRepository;
     }

     @GetMapping("/")
     public List<AddressRs> findAll() {
         var addresses = addressRepository.findAll();
         return addresses
                 .stream()
                 .map(AddressRs::converter)
                 .collect(Collectors.toList());
     }

     @GetMapping("/{id}")
     public AddressRs findById(@PathVariable("id") Long id) {
         var address = addressRepository.getOne(id);
         return AddressRs.converter(address);
     }

     @PostMapping("/")
     public void savePerson(@RequestBody AddressRq address) {
         var a = new Address();
         a.setAddress_id(address.getAddress_id());
         a.setCep(address.getCep());
         a.setStreet(address.getStreet());
         a.setDistrict(address.getDistrict());
         a.setNumber(address.getNumber());
//         a.setTutorId(address.getTutorId());
         addressRepository.save(a);
     }

     @PutMapping("/{id}")
     public void updatePerson(@PathVariable("id") Long id, @RequestBody AddressRq address) throws Exception {
         var a = addressRepository.findById(id);

         if (a.isPresent()) {
             var addressSave = a.get();
             addressSave.setCep(address.getCep());
             addressSave.setStreet(address.getStreet());
             addressSave.setDistrict(address.getDistrict());
             addressSave.setNumber(address.getNumber());
//             addressSave.setTutorId(address.getTutorId());
             addressRepository.save(addressSave);
         } else {
             throw new Exception("Endereço Não encontrado");
         }
     }

     @GetMapping("/filter")
     public List<AddressRs> findAddressByCep(@RequestParam("cep") String cep) {
         return this.addressRepository.findByCepContains(cep)
                 .stream()
                 .map(AddressRs::converter)
                 .collect(Collectors.toList());
     }

 }