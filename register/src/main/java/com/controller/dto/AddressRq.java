// package com.veterinary_clinic_adm.register.controller.dto;
// import com.veterinary_clinic_adm.register.model.Tutor;

package com.controller.dto;

 public class AddressRq {

    private Long address_id;
    private String cep;
    private String district;
    private String street;
    private String number;
//    private Tutor tutor_id;

    public Long getAddress_id() { return address_id; }

    public void setAddress_id(Long address_id) { this.address_id = address_id; }


    public String getCep() { return cep; }

    public void setCep(String cep) { this.cep = cep; }


    public String getDistrict() { return district; }

    public void setDistrict(String district) { this.district = district; }


    public String getStreet() { return street; }

    public void setStreet(String street) { this.street = street; }


    public String getNumber() { return number; }

    public void setNumber(String number) { this.number = number; }


//    public Tutor getTutorId() { return tutor_id; }
//
//    public void setTutorId(Tutor tutor_id) { this.tutor_id = tutor_id; }
   
 }