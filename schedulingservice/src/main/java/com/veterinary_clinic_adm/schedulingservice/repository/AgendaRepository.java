package com.veterinary_clinic_adm.schedulingservice.repository;

import com.veterinary_clinic_adm.schedulingservice.model.Agenda;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AgendaRepository extends JpaRepository<Agenda,Long>{

}
