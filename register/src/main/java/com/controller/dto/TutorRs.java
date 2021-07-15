//package com.veterinary_clinic_adm.register.controller.dto;
//import com.veterinary_clinic_adm.register.model.Tutor;
//import com.veterinary_clinic_adm.register.model.Animal;

package com.controller.dto;
//import com.model.Address;

import com.model.Tutor;

public class TutorRs {

   private Long tutor_id;
   private String cpf;
   private String name;
   private String rg;
   private String age;
   private String email;
   private String nationality;
   private String phone;

   private String county;
   private String state;

   private String cep;
   private String district;
   private String street;
   private String number;



   public static TutorRs converter(Tutor t) {

       var tutor = new TutorRs();

       tutor.setTutor_id(t.getTutor_id());
       tutor.setCpf(t.getCpf());
       tutor.setName(t.getName());
       tutor.setRg(t.getRg());
       tutor.setEmail(t.getEmail());
       tutor.setNationality(t.getNationality());
       tutor.setAge(t.getAge());

       tutor.setCounty(t.getCounty());
       tutor.setState(t.getState());

       tutor.setCep(t.getCep());
       tutor.setStreet(t.getStreet());
       tutor.setNumber(t.getNumber());
       tutor.setDistrict(t.getDistrict());


    
       return tutor;
   }


//   public List<Animal> getAnimals() { return animal_id; }
//
//   public void setAnimals(List<Animal> animal_id) { this.animal_id = animal_id; }

//chaves
//
//
//    public Address getAddress_id() { return address_id; }
//
//    public void setAddress_id(Address address_id) { this.address_id = address_id; }


    public Long getTutor_id() { return tutor_id; }

    public void setTutor_id(Long tutor_id) { this.tutor_id = tutor_id; }





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


   public String getNumber() { return number; }

   public void setNumber(String number) { this.number = number; }


    public String getDistrict() { return district; }

    public void setDistrict(String district) { this.district = district; }

}