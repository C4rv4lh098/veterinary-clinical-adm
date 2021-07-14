// package com.veterinary_clinic_adm.register.model;
package com.model;

 import javax.persistence.*;

 @Entity
 @Table(name = "address")

 public class Address{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)

 //    @Column(name = "tutor_id")
 //    private int tutor_id;

    @Column(name = "address_id")
    private Long address_id;

    @Column(name = "cep")
    private String cep;

    @Column(name = "street")
    private String street;

    @Column(name = "district")
    private String district;

    @Column(name = "number")
    private String number;

//    @OneToOne
//    private Tutor tutor_id;


    public Long getAddress_id() { return address_id; }
   
    public void setAddress_id(Long address_id) { this.address_id = address_id; }


    public String getCep() { return cep; }
   
    public void setCep(String cep) { this.cep = cep; }


    public String getStreet() { return street; }
   
    public void setStreet(String street) { this.street = street; }


    public String getDistrict() { return district; }
   
    public void setDistrict(String district) { this.district = district; }


    public String getNumber() { return number; }
   
    public void setNumber(String number) { this.number = number; }


//    public Tutor getTutorId() { return tutor_id; }
//
//    public void setTutorId(Tutor tutor_id) { this.tutor_id = tutor_id; }
   

 }


