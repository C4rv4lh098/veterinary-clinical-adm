package com.veterinary_clinic_adm.schedulingservice.controller;

import com.veterinary_clinic_adm.schedulingservice.controller.dto.AgendaRq;
import com.veterinary_clinic_adm.schedulingservice.model.Agenda;
import com.veterinary_clinic_adm.schedulingservice.expection.ResourceNotFoundException;
import com.veterinary_clinic_adm.schedulingservice.repository.AgendaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.Map;
import javax.validation.Valid;

@RestController @CrossOrigin(origins = "http://localhost:4200")
@RequestMapping("/api")
public class AgendaController {

    @Autowired
    private AgendaRepository agendaRepository;

    /*@GetMapping("/consultas")
    public Iterable<Agenda> getAllAgendas(){
        return agendaRepository.findAll();
    }*/

    @GetMapping("/consultas")
    private Iterable<Agenda> getAllAgendas(){
        return agendaRepository.findAll();
    }

    @GetMapping("/consultas/{id}")
    public ResponseEntity<Agenda> getAgendabyId(@PathVariable(value = "id") Long agendaId)
        throws ResourceNotFoundException{
        Agenda agenda = agendaRepository.findById(agendaId)
                .orElseThrow(()-> new ResourceNotFoundException("Consulta not Found::" + agendaId));
        return ResponseEntity.ok().body(agenda);
    }

    @PostMapping("/consultas")
    public void saveAgenda(@RequestBody AgendaRq agenda){
        Agenda a = new Agenda();
        a.setTutor_id(agenda.getTutor_id());
        a.setAnimal_id(agenda.getAnimal_id());
        a.setDate(agenda.getDate());
        a.setHorain(agenda.getHorain());
        a.setHoraout(agenda.getHoraout());
        agendaRepository.save(a);
    }

    /*@PostMapping("/consultas")
    public Agenda createAgenda(@Valid @RequestBody Agenda agenda){
        Agenda n = new Agenda();
        n.setTutor_id(tutor_id);
        n.setAnimal_id(animal_id);
        n.setDate(date);
        n.setHorain(horain);
        n.setHoraout(horaout);

        return agendaRepository.save(agenda);
    }*/

    @PutMapping("/consultas/{id}")
    public ResponseEntity<Agenda> updateAgenda(@PathVariable (value = "id") Long agendaId,
                                               @Valid @RequestBody Agenda agendaDetails) throws ResourceNotFoundException{
        Agenda agenda = agendaRepository.findById(agendaId)
                .orElseThrow(()-> new ResourceNotFoundException("Consulta não encontrada com esse Id::" + agendaId));
        agenda.setTutor_id(agendaDetails.getTutor_id());
        agenda.setAnimal_id(agendaDetails.getAnimal_id());
        agenda.setDate(agendaDetails.getDate());
        agenda.setHorain(agendaDetails.getHorain());
        agenda.setHoraout(agendaDetails.getHoraout());
        final Agenda updateAgenda = agendaRepository.save(agenda);
        return ResponseEntity.ok(updateAgenda);
    }

    @DeleteMapping("/consulta/{id}")
    public Map<String, Boolean> deleteAgenda(@PathVariable(value = "id") Long agendaId)
        throws ResourceNotFoundException{
        Agenda agenda = agendaRepository.findById(agendaId)
                .orElseThrow(()-> new ResourceNotFoundException("Consulta não encontrada com esse Id::" + agendaId));
        agendaRepository.delete(agenda);
        Map<String, Boolean> response = new HashMap< >();
        response.put("deleted", Boolean.TRUE);
        return response;
    }
}
