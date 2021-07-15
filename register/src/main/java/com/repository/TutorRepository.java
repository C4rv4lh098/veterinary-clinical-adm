//package com.veterinary_clinic_adm.register.repository;
package com.repository;

//import com.veterinary_clinic_adm.register.model.Tutor;
import com.model.Tutor;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface TutorRepository extends JpaRepository<Tutor, String> {
//    List<Tutor> findByCpfContains(String cpf);
}