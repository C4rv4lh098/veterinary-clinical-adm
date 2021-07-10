package com.veterinary_clinic_adm.register.controller;

import com.veterinary_clinic_adm.register.controller.dto.CityRq;
import com.veterinary_clinic_adm.register.controller.dto.CityRs;
import com.veterinary_clinic_adm.register.model.City;
import com.veterinary_clinic_adm.register.repository.CityCustomRepository;
import com.veterinary_clinic_adm.register.repository.CityRepository;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.stream.Collectors;

@RestController
@RequestMapping("/city")
public class CityController {

    private final CityRepository cityRepository;
    private final CityCustomRepository cityCustomRepository;

    public CityController(CityRepository cityRepository, CityCustomRepository cityCustomRepository) {
        this.cityRepository = cityRepository;
        this.cityCustomRepository = cityCustomRepository;
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
        c.setId(city.getId());
        c.setName(city.getName());
        c.setCountry(city.getCountry());
        c.setState(city.getState());
        cityRepository.save(c);
    }

    @PutMapping("/{id}")
    public void updatePerson(@PathVariable("id") Long id, @RequestBody CityRq city) throws Exception {
        var c = cityRepository.findById(id);

        if (a.isPresent()) {
            var citySave = a.get();
            citySave.setName(cit.getName());
            citySave.setCountry(city.getCountry());
            citySave.setState(city.getState());
            cityRepository.save(citySave);
        } else {
            throw new Exception("Cidade Não encontrada");
        }
    }

    @GetMapping("/filter")
    public List<CityRs> findCityByName(@RequestParam("name") String name) {
        return this.cityRepository.findByNomeContains(name)
                .stream()
                .map(CityRs::converter)
                .collect(Collectors.toList());
    }

}