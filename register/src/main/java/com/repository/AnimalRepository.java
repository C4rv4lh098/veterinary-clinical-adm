//package com.veterinary_clinic_adm.register.repository;
package com.repository;

//import com.veterinary_clinic_adm.register.model.Animal;
import com.model.Animal;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface AnimalRepository extends JpaRepository<Animal, String> {
    List<Animal> findByNameContains(String name);
}