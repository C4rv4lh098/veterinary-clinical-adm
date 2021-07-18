//package com.veterinary_clinic_adm.register.controller;
package com.controller;


import com.controller.dto.AnimalRq;
import com.controller.dto.AnimalRs;

import com.model.Animal;

import com.repository.AnimalCustomRepository;
import com.repository.AnimalRepository;

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
@RequestMapping("/api/animal") @CrossOrigin(origins = "http://localhost:4200")
public class AnimalController {

    private final AnimalRepository animalRepository;
    private final AnimalCustomRepository animalCustomRepository;

    public AnimalController(AnimalRepository animalRepository, AnimalCustomRepository animalCustomRepository) {
        this.animalRepository = animalRepository;
        this.animalCustomRepository = animalCustomRepository;
    }

    @CrossOrigin(origins = "http://localhost:4200")
    @GetMapping("/") 
    public List<AnimalRs> findAll() {
        var animals = animalRepository.findAll();
        return animals
                .stream()
                .map(AnimalRs::converter)
                .collect(Collectors.toList());
    }

    @CrossOrigin(origins = "http://localhost:4200")
    @GetMapping("/{animal_id}") 
    public AnimalRs findByAnimalId(@PathVariable("animal_id") Long animal_id) {
        var animal = animalRepository.getOne(animal_id);
        return AnimalRs.converter(animal);
    }

    @CrossOrigin(origins = "http://localhost:4200")
    @PostMapping("/animal") 
    public ResponseEntity<?> savePerson(@RequestBody AnimalRq animal) {
        var a = new Animal();
        a.setId(animal.getId());
        a.setName(animal.getName());
        a.setAge(animal.getAge());
        a.setBreed(animal.getBreed());
        a.setSpecies(animal.getSpecies());
        a.setSex(animal.getSex());
        a.setTutorId(animal.getTutorId());
        
        animalRepository.save(a);
        return ResponseEntity.ok("Sucesso!");

    }

    @CrossOrigin(origins = "http://localhost:4200")
    @PutMapping("/{animal_id}") 
    public void updatePerson(@PathVariable("animal_id") Long animal_id, @RequestBody AnimalRq animal) throws Exception {
        var a = animalRepository.findById(animal_id);

        if (a.isPresent()) {
            var animalSave = a.get();
            animalSave.setName(animal.getName());
            animalSave.setAge(animal.getAge());
            animalSave.setBreed(animal.getBreed());
            animalSave.setSpecies(animal.getSpecies());
            animalSave.setSex(animal.getSex());
            animalSave.setTutorId(animal.getTutorId());
            animalRepository.save(animalSave);
        } else {
            throw new Exception("Animal Não encontrado");
        }
    }

    @CrossOrigin(origins = "http://localhost:4200")
    @GetMapping("/filter") 
    public List<AnimalRs> findAnimalByName(@RequestParam("name") String name) {
        return this.animalRepository.findByNameContains(name)
                .stream()
                .map(AnimalRs::converter)
                .collect(Collectors.toList());
    }

    @CrossOrigin(origins = "http://localhost:4200")
    @GetMapping("/filter/custom") 
    public List<AnimalRs> findAnimalByCustom(
            @RequestParam(value = "age", required = false) String age,
            @RequestParam(value = "name", required = false) String name
    ) {
        return this.animalCustomRepository.find(age, name)
                .stream()
                .map(AnimalRs::converter)
                .collect(Collectors.toList());
    }

}