package com.veterinary_clinic_adm.register.controller.dto;

import com.veterinary_clinic_adm.register.model.City;
import com.veterinary_clinic_adm.register.model.Tutor;

public class CityRs {

   private Long id;
   private String country;
   private String state;
   private String name;
   private Tutor tutor_id;

   public static CityRs converter(City t) {

       var city = new CityRs();

       city.setId(t.getId());
       city.setTutorId(t.getTutorId());
       city.setCountry(t.getCountry());
       city.setState(t.getState());
       city.setName(t.getName());

       return city;
   }

   public Long getId() { return id; }

   public void setId(Long id) { this.id = id; }


   public String getCountry() { return country; }

   public void setCountry(String country) { this.country = country; }


   public String getName() { return name; }

   public void setName(String name) { this.name = name; }


   public String getState() { return state; }

   public void setState(String state) { this.state = state; }


   public Tutor getTutorId() { return tutor_id; }

   public void setTutorId(Tutor tutor_id) { this.tutor_id = tutor_id; }

}