package com.veterinaryclinicaladm.register.controller;

import com.veterinaryclinicaladm.register.exception.ResourceNotFoundException;
import com.veterinaryclinicaladm.register.model.Tutor;
import com.veterinaryclinicaladm.register.repository.TutorRepository;
import org.springframework.beans.factory.annotation.Autowired;
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

@RestController @CrossOrigin(origins = "http://localhost:4200")
@RequestMapping("/api/tutor")
public class TutorController {
  @Autowired
  private TutorRepository tutorRepository;


  @GetMapping("/tutores")
  public List<Tutor> getAllTutores() {
    return tutorRepository.findAll();
  }


  @GetMapping("/tutores/{id}")
  public ResponseEntity < Tutor > getTutorById(@PathVariable(value = "id") Long tutorId)
    throws ResourceNotFoundException {
    Tutor tutor = tutorRepository.findById(tutorId)
      .orElseThrow(() -> new ResourceNotFoundException("Tutor not found :: " + tutorId));
    return ResponseEntity.ok().body(tutor);
  }


  @PostMapping("/tutores")
  public Tutor createRoom(@Valid @RequestBody Tutor tutor) {
    return tutorRepository.save(tutor);
  }


  @PutMapping("/tutors/{id}")
  public ResponseEntity < Tutor > updateTutor(@PathVariable(value = "id") Long tutorId,
                                                    @Valid @RequestBody Tutor tutorDetails) throws ResourceNotFoundException {
    Tutor tutor = tutorRepository.findById(tutorId)
      .orElseThrow(() -> new ResourceNotFoundException("Tutor not found for this id :: " + tutorId));

    tutor.setName(tutorDetails.getName());
    tutor.setCpf(tutorDetails.getCpf());
    tutor.setAge(tutorDetails.getAge());
    tutor.setRg(tutorDetails.getRg());
    tutor.setEmail(tutorDetails.getEmail());
    tutor.setNationality(tutorDetails.getNationality());
    tutor.setPhone(tutorDetails.getPhone());
    tutor.setCountry(tutorDetails.getCountry());
    tutor.setState(tutorDetails.getState());
    tutor.setCity(tutorDetails.getCity());
    tutor.setCep(tutorDetails.getCep());
    tutor.setDistrict(tutorDetails.getDistrict());
    tutor.setStreet(tutorDetails.getStreet());
    tutor.setNumber(tutorDetails.getNumber());
    final Tutor updateTutor = tutorRepository.save(tutor);
    return ResponseEntity.ok(updateTutor);
  }


  @DeleteMapping("/tutores/{id}")
  public Map < String, Boolean > deleteTutor(@PathVariable(value = "id") Long tutorId)
    throws ResourceNotFoundException {
    Tutor tutor = tutorRepository.findById(tutorId)
      .orElseThrow(() -> new ResourceNotFoundException("Tutor not found for this id :: " + tutorId));

    tutorRepository.delete(tutor);
    Map< String, Boolean > response = new HashMap< >();
    response.put("deleted", Boolean.TRUE);
    return response;
  }

}

