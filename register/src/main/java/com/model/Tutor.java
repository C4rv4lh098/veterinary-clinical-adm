//package com.veterinary_clinic_adm.register.model;
package com.model;


import javax.persistence.*;
import com.model.Animal;
import java.util.List;

@Entity
@Table(name = "tutor")

public class Tutor{
   @Id
   @GeneratedValue(strategy = GenerationType.IDENTITY)

   @Column(name = "tutor_id")
   private Long tutor_id;

   @Column(name = "cpf")
   private String cpf;

   @Column(name = "name")
   private String name;

   @Column(name = "rg")
   private String rg;

   @Column(name = "age")
   private String age;

   @Column(name = "email")
   private String email;

   @Column(name = "nationality")
   private String nationality;

   @Column(name = "phone")
   private String phone;


   @Column(name = "county")
   private String county;

   @Column(name = "state")
   private String state;


   @Column(name = "cep")
   private String cep;

   @Column(name = "street")
   private String street;

   @Column(name = "district")
   private String district;

   @Column(name = "number")
   private String number;

   // private List<Animal> animals;



//chaves
   public Long getTutor_id() { return tutor_id; }

   public void setTutor_id(Long tutor_id) { this.tutor_id = tutor_id; }



//
//
//    public Address getAddress_id() { return address_id; }
//
//    public void setAddress_id(Address address_id) { this.address_id = address_id; }

//   @OneToMany(mappedBy = "tutor_id", cascade = CascadeType.ALL)
//   public List<Animal> getAnimals() { return animals; }

//   public void setAnimals(List<Animal> animals) { this.animals = animals; }



   public String getCpf() { return cpf; }

   public void setCpf(String cpf) { this.cpf = cpf; }


   public String getName() { return name; }

   public void setName(String name) { this.name = name; }


   public String getRg() { return rg; }

   public void setRg(String rg) { this.rg = rg; }


   public String getAge() { return age; }

   public void setAge(String age) { this.age = age; }


   public String getEmail() { return email; }

   public void setEmail(String email) { this.email = email; }


   public String getNationality() { return nationality; }

   public void setNationality(String nationality) { this.nationality = nationality; }


   public String getPhone() { return phone; }

   public void setPhone(String phone) { this.phone = phone; }




   public String getCounty() { return county; }

   public void setCounty(String county) { this.county = county; }


   public String getState() { return state; }

   public void setState(String state) { this.state = state; }

   public String getCep() { return cep; }

   public void setCep(String cep) { this.cep = cep; }


   public String getStreet() { return street; }

   public void setStreet(String street) { this.street = street; }


   public String getDistrict() { return district; }

   public void setDistrict(String district) { this.district = district; }


   public String getNumber() { return number; }

   public void setNumber(String number) { this.number = number; }

}


