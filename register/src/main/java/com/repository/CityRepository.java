// package com.veterinary_clinic_adm.register.repository;
// import com.veterinary_clinic_adm.register.model.City;
// import org.springframework.data.jpa.repository.JpaRepository;
// import org.springframework.data.jpa.repository.Query;
// import org.springframework.stereotype.Repository;


package com.repository;
import com.model.City;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

 @Repository
 public interface CityRepository extends JpaRepository<City, Long> {
     List<City> findByNameContains(String name);
 }