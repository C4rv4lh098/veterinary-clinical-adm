//package com.veterinary_clinic_adm.register.controller.dto;
//import com.veterinary_clinic_adm.register.model.Tutor;

package com.controller.dto;
import com.model.Tutor;

public class AnimalRq {

    private Long animal_id;
    private String name;
    private String age;
    private String breed;
    private String species;
    private String sex;
    private Tutor tutor_id;

    public Long getId() { return animal_id; }

    public void setId(Long animal_id) { this.animal_id = animal_id; }
 
 
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