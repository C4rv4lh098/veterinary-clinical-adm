package com.veterinary_clinic_adm.schedulingservice.controller;

import com.veterinary_clinic_adm.schedulingservice.model.Agenda;
import com.veterinary_clinic_adm.schedulingservice.expection.ResourceNotFoundException;
import com.veterinary_clinic_adm.schedulingservice.repository.AgendaRepository;
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

@RestController @CrossOrigin(origins = "http://localhost:4200")
@RequestMapping("/api")
public class AgendaController {

    @Autowired
    private AgendaRepository agendaRepository;

    @GetMapping("/consultas")
    public List<Agenda> getAllAgendas(){
        return agendaRepository.findAll();
    }

    @GetMapping("/consultas/{id}")
    public ResponseEntity<Agenda> getAgendabyId(@PathVariable(value = "id") Long agendaId)
        throws ResourceNotFoundException{
        Agenda agenda = agendaRepository.findById(agendaId)
                .orElseThrow(()-> new ResourceNotFoundException("Consulta not Found::" + agendaId));
        return ResponseEntity.ok().body(agenda);
    }

    @PostMapping("consultas")
    public Agenda createAgenda(@Valid @RequestBody Agenda agenda){
        return agendaRepository.save(agenda);
    }

    @PutMapping("/consultas/{id}")
    public ResponseEntity<Agenda> updateAgenda(@PathVariable (value = "id") Long agendaId,
                                               @Valid @RequestBody Agenda agendaDetails) throws ResourceNotFoundException{
        Agenda agenda = agendaRepository.findById(agendaId)
                .orElseThrow(()-> new ResourceNotFoundException("Consulta não encontrada com esse Id::" + agendaId));
        agenda.setTutorName(agendaDetails.getTutorName());
        agenda.setAnimalName(agendaDetails.getAnimalName());
        agenda.setDatee(agendaDetails.getDatee());
        agenda.setStartHour(agendaDetails.getStartHour());
        agenda.setEndHour(agendaDetails.getEndHour());
        final Agenda updateAgenda = agendaRepository.save(agenda);
        return ResponseEntity.ok(updateAgenda);
    }

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
