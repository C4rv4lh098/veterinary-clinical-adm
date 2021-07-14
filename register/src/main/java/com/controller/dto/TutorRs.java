//package com.veterinary_clinic_adm.register.controller.dto;
//import com.veterinary_clinic_adm.register.model.Tutor;
//import com.veterinary_clinic_adm.register.model.Animal;

package com.controller.dto;
import com.model.Address;
import com.model.City;
import com.model.Tutor;

public class TutorRs {

   private Long tutor_id;
   private String cpf;
   private String name;
   private String rg;
   private String email;
   private String nationality;
   private String phone;

//   private String country;
//   private String state;
//   private String city;
//
//   private String cep;
//   private String district;
//   private String street;
//   private String number;

//   private List<Animal> animal_id;
   private City city_id;
   private Address address_id;


   public static TutorRs converter(Tutor t) {

       var tutor = new TutorRs();

       tutor.setTutor_id(t.getTutor_id());
       tutor.setCpf(t.getCpf());
       tutor.setName(t.getName());
       tutor.setRg(t.getRg());
       tutor.setEmail(t.getEmail());
       tutor.setNationality(t.getNationality());
       tutor.setRg(t.getRg());

//       tutor.setCity(t.getCity());
//       tutor.setCountry(t.getCountry());
//       tutor.setState(t.getState());
//
//       tutor.setCep(t.getCep());
//       tutor.setStreet(t.getStreet());
//       tutor.setNumber(t.getNumber());

//       tutor.setAnimals(t.getAnimals());
       tutor.setCity_id(t.getCity_id());
       tutor.setAddress_id(t.getAddress_id());
    
       return tutor;
   }


//   public List<Animal> getAnimals() { return animal_id; }
//
//   public void setAnimals(List<Animal> animal_id) { this.animal_id = animal_id; }

//chaves
   public City getCity_id() { return city_id; }

   public void setCity_id(City city_id) { this.city_id = city_id; }


    public Address getAddress_id() { return address_id; }

    public void setAddress_id(Address address_id) { this.address_id = address_id; }


    public Long getTutor_id() { return tutor_id; }

    public void setTutor_id(Long tutor_id) { this.tutor_id = tutor_id; }





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




//   public String getPhone() { return phone; }
//
//   public void setPhone(String phone) { this.phone = phone; }
//
//
//   public String getCountry() { return country; }
//
//   public void setCountry(String country) { this.country = country; }
//
//
//   public String getCity() { return city; }
//
//   public void setCity(String city) { this.city = city; }
//
//
//   public String getState() { return state; }
//
//   public void setState(String state) { this.state = state; }
//
//
//   public String getCep() { return cep; }
//
//   public void setCep(String cep) { this.cep = cep; }
//
//
//   public String getStreet() { return street; }
//
//   public void setStreet(String street) { this.street = street; }
//
//
//   public String getNumber() { return number; }
//
//   public void setNumber(String number) { this.number = number; }

}