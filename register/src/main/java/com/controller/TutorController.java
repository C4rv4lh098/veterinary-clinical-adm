// package com.veterinary_clinic_adm.register.controller;

// import com.veterinary_clinic_adm.register.controller.dto.TutorRs;
// import com.veterinary_clinic_adm.register.TutorRepository;
// import org.springframework.web.bind.annotation.RequestMapping;
// import org.springframework.web.bind.annotation.RestController;

// import com.veterinary_clinic_adm.schedulingservice.model.Agenda;
// import com.veterinary_clinic_adm.schedulingservice.expection.ResourceNotFoundException;
// import com.veterinary_clinic_adm.schedulingservice.repository.AgendaRepository;
// import org.springframework.beans.factory.annotation.Autowired;
// import org.springframework.boot.autoconfigure.web.ServerProperties;
// import org.springframework.http.ResponseEntity;
// import org.springframework.web.bind.annotation.CrossOrigin;
// import org.springframework.web.bind.annotation.DeleteMapping;
// import org.springframework.web.bind.annotation.GetMapping;
// import org.springframework.web.bind.annotation.PathVariable;
// import org.springframework.web.bind.annotation.PostMapping;
// import org.springframework.web.bind.annotation.PutMapping;
// import org.springframework.web.bind.annotation.RequestBody;
// import org.springframework.web.bind.annotation.RequestMapping;
// import org.springframework.web.bind.annotation.RestController;
// import java.util.HashMap;
// import java.util.List;
// import java.util.Map;
// import javax.validation.Valid;

// @RestController
// @RequestMapping("/tutor")
// public class TutorController {

//    private final TutorRepository tutorRepository;

//    public TutorController(TutorRepository tutorRepository) {
//        this.tutorRepository = tutorRepository;
//    }

//    @GetMapping("/")
//    public List<TutorRs> findAll(){
//        var tutor = pessoaRepository.findAll();
//        return tutor
//                .stream()
//                .map(TutorRs::converter)
//                .collect(Collectors.toList());
//    }
// }

package com.veterinary_clinic_adm.register.controller;

import com.veterinary_clinic_adm.register.controller.dto.TutorRq;
import com.veterinary_clinic_adm.register.controller.dto.TutorRs;
import com.veterinary_clinic_adm.register.model.Tutor;
import com.veterinary_clinic_adm.register.repository.TutorCustomRepository;
import com.veterinary_clinic_adm.register.repository.TutorRepository;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.stream.Collectors;

@RestController
@RequestMapping("/tutor")
public class TutorController {

    private final TutorRepository tutorRepository;
    private final TutorCustomRepository tutorCustomRepository;

    public TutorController(TutorRepository tutorRepository, TutorCustomRepository tutorCustomRepository) {
        this.tutorRepository = tutorRepository;
        this.tutorCustomRepository = tutorCustomRepository;
    }

    @GetMapping("/")
    public List<TutorRs> findAll() {
        var tutores = tutorRepository.findAll();
        return tutores
                .stream()
                .map(TutorRs::converter)
                .collect(Collectors.toList());
    }

    @GetMapping("/{id}")
    public TutorRs findById(@PathVariable("id") Long id) {
        var tutor = tutorRepository.getOne(id);
        return TutorRs.converter(tutor);
    }

    @PostMapping("/")
    public void savePerson(@RequestBody TutorRq tutor) {
        var t = new Tutor();
        t.setName(tutor.getName());
        t.setCpf(tutor.getCpf());
        t.setRg(tutor.getRg());
        t.setAge(tutor.getAge());
        t.setEmail(tutor.getEmail());
        t.setNationality(tutor.getNationality());
        t.setPhone(tutor.getPhone());
        tutorRepository.save(t);
    }

    @PutMapping("/{id}")
    public void updatePerson(@PathVariable("id") Long id, @RequestBody TutorRq tutor) throws Exception {
        var t = tutorRepository.findById(id);

        if (t.isPresent()) {
            var tutorSave = t.get();
            tutorSave.setName(tutor.getName());
            tutorSave.setCpf(tutor.getCpf());
            tutorSave.setRg(tutor.getRg());
            tutorSave.setAge(tutor.getAge());
            tutorSave.setEmail(tutor.getEmail());
            tutorSave.setNationality(tutor.getNationality());
            tutorRepository.save(tutorSave);
        } else {
            throw new Exception("Pessoa Não encontrada");
        }
    }

    @GetMapping("/filter")
    public List<TutorRs> findPersonByCpf(@RequestParam("cpf") String cpf) {
        return this.tutorRepository.findByNomeContains(cpf)
                .stream()
                .map(TutorRs::converter)
                .collect(Collectors.toList());
    }

    @GetMapping("/filter/custom")
    public List<TutorRs> findPersonByCustom(
            @RequestParam(value = "cpf", required = false) Long cpf,
            @RequestParam(value = "name", required = false) String name,
    ) {
        return this.tutorCustomRepository.find(cpf, name)
                .stream()
                .map(TutorRs::converter)
                .collect(Collectors.toList());
    }

}