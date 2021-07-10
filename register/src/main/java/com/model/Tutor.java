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
@Table(value = "tutor")

public class Tutor{
   @Id
   @GeneratedValue(strategy = GenerationType.IDENTITY)

//    @Column(name = "tutor_id")
//    private int tutor_id;

   @Column(name = "cpf")
   private String cpf;

   @Column(name = "name")
   private String name;

   @Column(name = "rg")
   private String rg;

   @Column(name = "email")
   private String email;

   @Column(name = "nationality")
   private String nationality;

   @Column(name = "phone")
   private String phone;

//    @JoinColumn(name="city_id")
//    @OneToOne(cascade = CascadeType.ALL)
   @ManyToOne
   private City city;

//    @JoinColumn(name="address_id")
//    @OneToOne(cascade = CascadeType.ALL)
   @OneToOne
   private Adress address;

//    @JoinColumn(name="animal_id")
//    @OneToMany(cascade = CascadeType.ALL)
   @OneToMany
   private List<Animal> animals;


//    public int getTutorId() { return tutor_id; }

//    public void setTutorId(int tutor_id) { this.tutor_id = tutor_id; }

   public String getCity() { return city; }
   
   public void setCity(City city) { this.city = city; }


   public String getAddress() { return address; }
   
   public void setAddress(Address address) { this.address = address; }


   public String getAnimals() { return animals; }
   
   public void setAnimals(Animal animals) { this.animals = animals; }


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

}


