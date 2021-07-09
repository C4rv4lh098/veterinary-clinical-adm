package com.veterinary_clinic_adm.register.controller;

import com.veterinary_clinic_adm.register.controller.dto.TutorRs;
import com.veterinary_clinic_adm.register.TutorRepository;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/tutor")
public class TutorController {

    private final TutorRepository tutorRepository;

    public TutorController(TutorRepository tutorRepository) {
        this.tutorRepository = tutorRepository;
    }

    public List<TutorRs> findAll(){
        var tutor = pessoaRepository.findAll();
        return null;
    }
}