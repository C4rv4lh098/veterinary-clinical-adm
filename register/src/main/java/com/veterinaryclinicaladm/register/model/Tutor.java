package com.veterinaryclinicaladm.register.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "tutor")
public class Tutor {

   private Long id;
   private String cpf;
   private String name;
   private String age;
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


    public Tutor(){

    }

   public Tutor(long id, String name, String cpf, String age, String rg, String email, String nationality, String phone, String country, String state, String city, String cep, String district, String street, String number) {

        this.id = id;
        this.cpf = cpf;
        this.name = name;
        this.age = age;
        this.rg = rg;
        this.email = email;
        this.nationality = nationality;
        this.phone = phone;
        this.country = country;
        this.state = state;
        this.city = city;
        this.cep = cep;
        this.district = district;
        this.street = street;
        this.number = number;
   }

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}


    @Column(name = "cpf", nullable = false)
	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}


    @Column(name = "name", nullable = false)
	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
	}


    @Column(name = "age", nullable = false)
	public String getAge() {
		return age;
	}

	public void setAge(String age) {
		this.age = age;
	}


    @Column(name = "rg", nullable = false)
	public String getRg() {
		return rg;
	}

	public void setRg(String rg) {
		this.rg = rg;
	}


    @Column(name = "email", nullable = false)
	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}


    @Column(name = "nationality", nullable = false)
	public String getNationality() {
		return nationality;
	}

	public void setNationality(String nationality) {
		this.nationality = nationality;
	}


    @Column(name = "phone", nullable = false)
	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}


    @Column(name = "country", nullable = false)
	public String getCountry() {
		return country;
	}

	public void setCountry(String country) {
		this.country = country;
	}


    @Column(name = "state", nullable = false)
	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}


    @Column(name = "city", nullable = false)
	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}


    @Column(name = "cep", nullable = false)
	public String getCep() {
		return cep;
	}

	public void setCep(String cep) {
		this.cep = cep;
	}


    @Column(name = "district", nullable = false)
	public String getDistrict() {
		return district;
	}

	public void setDistrict(String district) {
		this.district = district;
	}


    @Column(name = "street", nullable = false)
	public String getStreet() {
		return street;
	}

	public void setStreet(String street) {
		this.street = street;
	}


    @Column(name = "number", nullable = false)
	public String getNumber() {
		return number;
	}

	public void setNumber(String number) {
		this.number = number;
	}


    @Override
    public String toString() {
    return "Tutor [id=" + id + ", name=" + name + ", cpf=" + cpf + ",rg=" + rg + ", email=" + email + ", nationality=" + nationality + ", phone=" + phone + ",  country=" + country + ", state=" + state + ", city=" + city + ", cep=" + cep + ",district=" + district + ",street=" + street + ", number=" + number + "]";
  }

}
  