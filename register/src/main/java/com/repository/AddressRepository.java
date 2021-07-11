// package com.veterinary_clinic_adm.register.repository;

// import com.veterinary_clinic_adm.register.model.Address;
// import org.springframework.data.jpa.repository.JpaRepository;
// import org.springframework.data.jpa.repository.Query;
// import org.springframework.stereotype.Repository;

// import javax.persistence.NamedNativeQuery;
// import java.util.List;

// @Repository
// public interface AddressRepository extends JpaRepository<Address, Long> {
//     List<Address> findByCepContains(String cep);
// }