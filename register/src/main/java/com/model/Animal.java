//package com.veterinary_clinic_adm.register.model;
package com.model;

import javax.persistence.*;

@Entity
@Table(name = "animal")

public class Animal{
   
   @Id
   @GeneratedValue(strategy = GenerationType.IDENTITY)

   @Column(name = "animal_id")
   private Long animal_id;

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

   // @OneToOne(cascade = CascadeType.ALL)
   //  @JoinTable(name = "emp_workstation", 
   //    joinColumns = 
   //      { @JoinColumn(name = "employee_id", referencedColumnName = "id") },
   //    inverseJoinColumns = 
   //      { @JoinColumn(name = "workstation_id", referencedColumnName = "id") })
  
   // @ManyToOne(cascade = CascadeType.ALL)
   // @JoinTable(name="tutor")
   // @JoinColumn(name = "tutor_id")
   
   @ManyToOne(cascade = CascadeType.ALL)
   @JoinColumn(name = "tutor_id")
   private Tutor tutor_id;



   public Long getId() { return animal_id; }
   
   public void setId(Long animal_id) { this.animal_id = animal_id; }


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


   
   public Tutor getTutorId() { return tutor_id; }

   public void setTutorId(Tutor tutor_id) { this.tutor_id = tutor_id; }

}


