package com.veterinary_clinic_adm.schedulingservice.repository;

//chamando a classe agenda
import com.veterinary_clinic_adm.schedulingservice.model.Agenda;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import org.springframework.data.repository.CrudRepository;

@Repository
public interface AgendaRepository extends CrudRepository<Agenda,Long>{

}
