package com.veterinary_clinic_adm.register.controller;

import com.veterinary_clinic_adm.register.controller.dto.AddressRq;
import com.veterinary_clinic_adm.register.controller.dto.AddressRs;
import com.veterinary_clinic_adm.register.model.Address;
// import com.veterinary_clinic_adm.register.repository.AddressCustomRepository;
import com.veterinary_clinic_adm.register.repository.AddressRepository;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.web.ServerProperties;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import javax.validation.Valid;


@RestController
@RequestMapping("/address")
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
        a.setId(address.getId());
        a.setCep(address.getCep());
        a.setStreet(address.getStreet());
        a.setDistrict(address.getDistrict());
        a.setNumber(address.getNumber());
        a.setTutorId(address.getTutorId());
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
            addressSave.setTutorId(address.getTutorId());
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