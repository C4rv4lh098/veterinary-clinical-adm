// package com.veterinary_clinic_adm.register.controller;
// import com.veterinary_clinic_adm.register.controller.dto.CityRq;
// import com.veterinary_clinic_adm.register.controller.dto.CityRs;
// import com.veterinary_clinic_adm.register.model.City;
// // import com.veterinary_clinic_adm.register.repository.CityCustomRepository;
// import com.veterinary_clinic_adm.register.repository.CityRepository;


package com.controller;
import com.controller.dto.CityRq;
import com.controller.dto.CityRs;
import com.model.City;
import com.repository.CityRepository;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.stream.Collectors;

// import com.veterinary_clinic_adm.register.repository.CityCustomRepository;

 @RestController
 @RequestMapping("/city")
 public class CityController {

     private final CityRepository cityRepository;
     // private final CityCustomRepository cityCustomRepository;

     public CityController(CityRepository cityRepository) {
         this.cityRepository = cityRepository;
         // this.cityCustomRepository = cityCustomRepository;
     }

     @GetMapping("/")
     public List<CityRs> findAll() {
         var cities = cityRepository.findAll();
         return cities
                 .stream()
                 .map(CityRs::converter)
                 .collect(Collectors.toList());
     }

     @GetMapping("/{id}")
     public CityRs findById(@PathVariable("id") Long id) {
         var city = cityRepository.getOne(id);
         return CityRs.converter(city);
     }

     @PostMapping("/")
     public void savePerson(@RequestBody CityRq city) {
         var c = new City();
         c.setCity_id(city.getCity_id());
//         c.setName(city.getName());
         c.setCounty(city.getCounty());
         c.setState(city.getState());
         cityRepository.save(c);
     }

     @PutMapping("/{id}")
     public void updatePerson(@PathVariable("id") Long id, @RequestBody CityRq city) throws Exception {
         var a = cityRepository.findById(id);

         if (a.isPresent()) {
             var citySave = a.get();
//             citySave.setName(city.getName());
             citySave.setCounty(city.getCounty());
             citySave.setState(city.getState());
             cityRepository.save(citySave);
         } else {
             throw new Exception("Cidade Não encontrada");
         }
     }

     @GetMapping("/filter")
     public List<CityRs> findCityByName(@RequestParam("name") String name) {
         return this.cityRepository.findByNameContains(name)
                 .stream()
                 .map(CityRs::converter)
                 .collect(Collectors.toList());
     }

 }