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
@Table(value = "city")

public class City{
   @Id
   @GeneratedValue(strategy = GenerationType.IDENTITY)

//    @Column(name = "tutor_id")
//    private int tutor_id;

   @Column(name = "id")
   private Long id;

   @Column(name = "name")
   private String name;

   @Column(name = "country")
   private String country;

   @Column(name = "state")
   private String state;

   @OneToMany
   private Tutor tutor_id;


   public String getId() { return id; }
   
   public void setId(String id) { this.id = id; }


   public String getName() { return name; }
   
   public void setName(String name) { this.name = name; }


   public String getCountry() { return country; }
   
   public void setCountry(String country) { this.country = country; }


   public String getState() { return state; }
   
   public void setState(String state) { this.state = state; }


   public String getTutorId() { return tutor_id; }
   
   public void setTutorId(String tutor_id) { this.tutor_id = tutor_id; }
   

}


