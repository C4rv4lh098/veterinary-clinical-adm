// package com.veterinary_clinic_adm.register.controller.dto;

// import com.veterinary_clinic_adm.register.model.Address;
// import com.veterinary_clinic_adm.register.model.Tutor;

// public class AddressRs {

//    private Long id;
//    private String cep;
//    private String district;
//    private String street;
//    private String number;
//    private Tutor tutor_id;

//    public static AddressRs converter(Address t) {

//        var address = new AddressRs();

//        address.setId(t.getId());
//        address.setTutorId(t.getTutorId());
//        address.setCep(t.getCep());
//        address.setStreet(t.getStreet());
//        address.setNumber(t.getNumber());

//        return address;
//    }

//    public Long getId() { return id; }

//    public void setId(Long id) { this.id = id; }


//    public String getCep() { return cep; }

//    public void setCep(String cep) { this.cep = cep; }


//    public String getStreet() { return street; }

//    public void setStreet(String street) { this.street = street; }


//    public String getNumber() { return number; }

//    public void setNumber(String number) { this.number = number; }


//    public Tutor getTutorId() { return tutor_id; }

//    public void setTutorId(Tutor tutor_id) { this.tutor_id = tutor_id; }

// }