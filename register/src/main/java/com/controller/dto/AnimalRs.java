package com.veterinary_clinic_adm.register.controller.dto;

import com.veterinary_clinic_adm.register.model.Animal;
import com.veterinary_clinic_adm.register.model.Tutor;

public class AnimalRs {

   private Long id;
   private String age;
   private String name;
   private String breed;
   private String species;
   private String sex;
   private Tutor tutor_id;

   public static AnimalRs converter(Animal t) {

       var animal = new AnimalRs();

       animal.setTutorId(t.getTutorId());
       animal.setId(t.getId());
       animal.setAge(t.getAge());
       animal.setBreed(t.getBreed());
       animal.setSpecies(t.getSpecies());
       animal.setSex(t.getSex());
       animal.setName(t.getName());

       return animal;
   }

   public Long getId() { return id; }

   public void setId(Long id) { this.id = id; }


   public String getAge() { return age; }

   public void setAge(String age) { this.age = age; }


   public String getName() { return name; }

   public void setName(String name) { this.name = name; }


   public String getBreed() { return breed; }

   public void setBreed(String breed) { this.breed = breed; }


   public String getSpecies() { return species; }

   public void setSpecies(String species) { this.species = species; }


   public String getSex() { return sex; }

   public void setSex(String sex) { this.sex = sex; }


   public Tutor getTutorId() { return tutor_id; }

   public void setTutorId(Tutor tutor_id) { this.tutor_id = tutor_id; }


}