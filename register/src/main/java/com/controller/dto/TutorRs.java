package com.veterinary_clinic_adm.register.controller.dto;

import com.veterinary_clinic_adm.register.model.Tutor;
import com.veterinary_clinic_adm.register.model.Animal;

import java.util.List;

public class TutorRs {

   private Long id;
   private String cpf;
   private String name;
   private String rg;
   private String email;
   private String nationality;
   private String phone;

   private String country;
   private String state;
   private String city;

   private String cep;
   private String district;
   private String street;
   private String number;

   private List<Animal> animals;


   public static TutorRs converter(Tutor t) {

       var tutor = new TutorRs();

       tutor.setId(t.getId());
       tutor.setCpf(t.getCpf());
       tutor.setName(t.getName());
       tutor.setRg(t.getRg());
       tutor.setEmail(t.getEmail());
       tutor.setNationality(t.getNationality());
       tutor.setRg(t.getRg());

       tutor.setCity(t.getCity());
       tutor.setCountry(t.getCountry());
       tutor.setState(t.getState());

       tutor.setCep(t.getCep());
       tutor.setStreet(t.getStreet());
       tutor.setNumber(t.getNumber());

       tutor.setAnimals(t.getAnimals());
    
       return tutor;
   }


   public List<Animal> getAnimals() { return animals; }
   
   public void setAnimals(List<Animal> animals) { this.animals = animals; }


   public Long getId() { return id; }

   public void setId(Long id) { this.id = id; }


   public String getCpf() { return cpf; }

   public void setCpf(String cpf) { this.cpf = cpf; }


   public String getName() { return name; }

   public void setName(String name) { this.name = name; }


   public String getRg() { return rg; }

   public void setRg(String rg) { this.rg = rg; }


   public String getEmail() { return email; }

   public void setEmail(String email) { this.email = email; }


   public String getNationality() { return nationality; }

   public void setNationality(String nationality) { this.nationality = nationality; }


   public String getPhone() { return phone; }

   public void setPhone(String phone) { this.phone = phone; }


   public String getCountry() { return country; }

   public void setCountry(String country) { this.country = country; }


   public String getCity() { return city; }

   public void setCity(String city) { this.city = city; }


   public String getState() { return state; }

   public void setState(String state) { this.state = state; }


   public String getCep() { return cep; }

   public void setCep(String cep) { this.cep = cep; }


   public String getStreet() { return street; }

   public void setStreet(String street) { this.street = street; }


   public String getNumber() { return number; }

   public void setNumber(String number) { this.number = number; }

}