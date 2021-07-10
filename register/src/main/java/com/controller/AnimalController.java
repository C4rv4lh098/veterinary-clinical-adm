package com.veterinary_clinic_adm.register.controller;

import com.veterinary_clinic_adm.register.controller.dto.AnimalRq;
import com.veterinary_clinic_adm.register.controller.dto.AnimalRs;
import com.veterinary_clinic_adm.register.model.Animal;
import com.veterinary_clinic_adm.register.repository.AnimalCustomRepository;
import com.veterinary_clinic_adm.register.repository.AnimalRepository;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.stream.Collectors;

@RestController
@RequestMapping("/animal")
public class AnimalController {

    private final AnimalRepository animalRepository;
    private final AnimalCustomRepository animalCustomRepository;

    public AnimalController(AnimalRepository animalRepository, AnimalCustomRepository animalCustomRepository) {
        this.animalRepository = animalRepository;
        this.animalCustomRepository = animalCustomRepository;
    }

    @GetMapping("/")
    public List<AnimalRs> findAll() {
        var animals = animalRepository.findAll();
        return animals
                .stream()
                .map(AnimalRs::converter)
                .collect(Collectors.toList());
    }

    @GetMapping("/{id}")
    public AnimalRs findById(@PathVariable("id") Long id) {
        var animal = animalRepository.getOne(id);
        return AnimalRs.converter(animal);
    }

    @PostMapping("/")
    public void savePerson(@RequestBody AnimalRq animal) {
        var a = new Animal();
        a.setId(animal.getId());
        a.setName(animal.getName());
        a.setAge(animal.getAge());
        a.setBreed(animal.getBreed());
        a.setSpecies(animal.getSpecies());
        a.setSex(animal.getSex());
        a.setTutorId(animal.getTutorId());
        animalRepository.save(a);
    }

    @PutMapping("/{id}")
    public void updatePerson(@PathVariable("id") Long id, @RequestBody AnimalRq animal) throws Exception {
        var a = animalRepository.findById(id);

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

    @GetMapping("/filter")
    public List<AnimalRs> findAnimalByName(@RequestParam("name") String name) {
        return this.animalRepository.findByNomeContains(name)
                .stream()
                .map(AnimalRs::converter)
                .collect(Collectors.toList());
    }

    @GetMapping("/filter/custom")
    public List<AnimalRs> findAnimalByCustom(
            @RequestParam(value = "age", required = false) Int age,
            @RequestParam(value = "name", required = false) String name,
    ) {
        return this.animalCustomRepository.find(age, name)
                .stream()
                .map(AnimalRs::converter)
                .collect(Collectors.toList());
    }

}