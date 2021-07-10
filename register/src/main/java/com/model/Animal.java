package com.veterinary_clinic_adm.register.model;

import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;

import javax.persistence.Entity;
import javax.persistence.Table;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.OneToMany;
import javax.persistence.*;

@Entity
@Table(value = "animal")

public class Animal{
   @Id
   @GeneratedValue(strategy = GenerationType.IDENTITY)

//    @Column(name = "tutor_id")
//    private int tutor_id;

   @Column(name = "id")
   private Long id;

   @Column(name = "name")
   private String name;

   @Column(name = "age")
   private String age;

   @Column(name = "breed")
   private String breed;

   @Column(name = "species")
   private String species;

   @Column(name = "sex")
   private String sex;

   @OneToOne
   private Tutor tutor_id;



   public String getId() { return id; }
   
   public void setId(Long id) { this.id = id; }


   public String getName() { return name; }
   
   public void setName(String name) { this.name = name; }


   public String getAge() { return age; }
   
   public void setAge(String age) { this.age = age; }


   public String getBreed() { return breed; }
   
   public void setBreed(String breed) { this.breed = breed; }


   public String getSpecies() { return species; }

   public void setSpecies(String species) { this.species = species; }


   public String getSex() { return sex; }

   public void setSex(String sex) { this.sex = sex; }


   public String getTutorId() { return tutor_id; }

   public void setTutorId(String tutor_id) { this.tutor_id = tutor_id; }

}


