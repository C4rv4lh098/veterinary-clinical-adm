// package com.veterinary_clinic_adm.register.controller.dto;
// import com.veterinary_clinic_adm.register.model.Tutor;

 package com.controller.dto;

 public class CityRq {

    private Long city_id;
    private String county;
    private String state;
//    private String name;
//    private Tutor tutor_id;

    public Long getCity_id() { return city_id; }

    public void setCity_id(Long city_id) { this.city_id = city_id; }


    public String getCounty() { return county; }

    public void setCounty(String country) { this.county = country; }


//    public String getName() { return name; }
//
//    public void setName(String name) { this.name = name; }


    public String getState() { return state; }

    public void setState(String state) { this.state = state; }


//    public Tutor getTutorId() { return tutor_id; }
//
//    public void setTutorId(Tutor tutor_id) { this.tutor_id = tutor_id; }

 }