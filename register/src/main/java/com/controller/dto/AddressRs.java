// package com.veterinary_clinic_adm.register.controller.dto;
// import com.veterinary_clinic_adm.register.model.Address;
// import com.veterinary_clinic_adm.register.model.Tutor;
package com.controller.dto;
import com.model.Address;

 public class AddressRs {

    private Long address_id;
    private String cep;
    private String district;
    private String street;
    private String number;

     public AddressRs() {
     }
//    private Tutor tutor_id;

    public static AddressRs converter(Address t) {

        var address = new AddressRs();

        address.setAddress_id(t.getAddress_id());
//        address.setTutorId(t.getTutorId());
        address.setCep(t.getCep());
        address.setDistrict(t.getDistrict());
        address.setStreet(t.getStreet());
        address.setNumber(t.getNumber());

        return address;
    }

    public Long getAddress_id() { return address_id; }

    public void setAddress_id(Long address_id) { this.address_id = address_id; }


    public String getCep() { return cep; }

    public void setCep(String cep) { this.cep = cep; }


    public String getStreet() { return street; }

    public void setStreet(String street) { this.street = street; }


     public String getDistrict() { return district; }

     public void setDistrict(String district) { this.street = district; }


    public String getNumber() { return number; }

    public void setNumber(String number) { this.number = number; }


//    public Tutor getTutorId() { return tutor_id; }
//
//    public void setTutorId(Tutor tutor_id) { this.tutor_id = tutor_id; }

 }