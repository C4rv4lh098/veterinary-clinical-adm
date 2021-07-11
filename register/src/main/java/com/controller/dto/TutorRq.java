package com.veterinary_clinic_adm.register.controller.dto;

public class TutorRq {

    private Long id;
    private String cpf;
    private String name;
    private String age;
    private String rg;
    private String email;
    private String nationality;
    private String phone;

    public Long Id() { return id; }

   public void Id(Long id) { this.id = id; }


   public String getCpf() { return cpf; }

   public void setCpf(String cpf) { this.cpf = cpf; }


   public String getName() { return name; }

   public void setName(String name) { this.name = name; }


   public String getRg() { return rg; }

   public void setRg(String rg) { this.rg = rg; }


   public String getAge() { return age; }

   public void setAge(String age) { this.age = age; }


   public String getEmail() { return email; }

   public void setEmail(String email) { this.email = email; }


   public String getNationality() { return nationality; }

   public void setNationality(String nationality) { this.nationality = nationality; }


   public String getPhone() { return phone; }

   public void setPhone(String phone) { this.phone = phone; }
}