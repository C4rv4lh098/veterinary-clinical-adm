// package com.veterinary_clinic_adm.register.model;

// import javax.persistence.Column;
// import javax.persistence.GeneratedValue;
// import javax.persistence.GenerationType;

// import javax.persistence.Entity;
// import javax.persistence.Table;
// import javax.persistence.Id;
// import javax.persistence.OneToOne;
// import javax.persistence.OneToMany;
// import javax.persistence.*;

// @Entity
// @Table(name = "address")

// public class Address{
//    @Id
//    @GeneratedValue(strategy = GenerationType.IDENTITY)

// //    @Column(name = "tutor_id")
// //    private int tutor_id;

//    @Column(name = "id")
//    private Long id;

//    @Column(name = "cep")
//    private String cep;

//    @Column(name = "street")
//    private String street;

//    @Column(name = "district")
//    private String district;

//    @Column(name = "number")
//    private String number;

//    @OneToOne
//    private Tutor tutor_id;


//    public Long getId() { return id; }
   
//    public void setId(Long id) { this.id = id; }


//    public String getCep() { return cep; }
   
//    public void setCep(String cep) { this.cep = cep; }


//    public String getStreet() { return street; }
   
//    public void setStreet(String street) { this.street = street; }


//    public String getDistrict() { return district; }
   
//    public void setDistrict(String district) { this.district = district; }


//    public String getNumber() { return number; }
   
//    public void setNumber(String number) { this.number = number; }


//    public Tutor getTutorId() { return tutor_id; }
   
//    public void setTutorId(Tutor tutor_id) { this.tutor_id = tutor_id; }
   

// }


