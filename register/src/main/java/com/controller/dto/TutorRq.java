//package com.veterinary_clinic_adm.register.controller.dto;
//import com.veterinary_clinic_adm.register.model.Animal;

package com.controller.dto;
//import com.model.Address;


public class TutorRq {

   private Long tutor_id;
   private String cpf;
   private String name;
   private String age;
   private String rg;
   private String email;
   private String nationality;
   private String phone;

   private String county;
   private String state;


   private String cep;
   private String district;
   private String street;
   private String number;




//   public List<Animal> getAnimals() { return animals; }
//
//   public void setAnimals(List<Animal> animals) { this.animals = animals; }


//
//   public Address getAddress_id() { return address_id; }
//
//   public void setAddress_id(Address address_id) { this.address_id = address_id; }


   public Long getTutor_id() { return tutor_id; }

   public void setTutor_id(Long tutor_id) { this.tutor_id = tutor_id; }


   public String getCpf() { return cpf; }

   public void setCpf(String cpf) { this.cpf = cpf; }


   public String getName() { return name; }

   public void setName(String name) { this.name = name; }


   public String getAge() { return age; }

   public void setAge(String age) { this.age = age; }


   public String getRg() { return rg; }

   public void setRg(String rg) { this.rg = rg; }


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


   public String getNumber() { return number; }

   public void setNumber(String number) { this.number = number; }


   public String getDistrict() { return district; }

   public void setDistrict(String district) { this.district = district; }
   
}