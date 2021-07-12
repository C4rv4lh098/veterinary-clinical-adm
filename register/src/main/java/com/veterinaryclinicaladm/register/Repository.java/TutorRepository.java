package com.veterinaryclinicaladm.register.repository;

import com.veterinaryclinicaladm.register.model.Tutor;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TutorRepository extends JpaRepository<Tutor, Long>{


}