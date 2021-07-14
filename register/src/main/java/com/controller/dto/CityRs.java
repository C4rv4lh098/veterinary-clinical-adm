// package com.veterinary_clinic_adm.register.controller.dto;
// import com.veterinary_clinic_adm.register.model.City;
// import com.veterinary_clinic_adm.register.model.Tutor;

package com.controller.dto;
import com.model.City;

 public class CityRs {

    private Long city_id;
    private String county;
    private String state;
//    private String name;
//    private Tutor tutor_id;

    public static CityRs converter(City t) {

        var city = new CityRs();

        city.setCity_id(t.getCity_id());
//        city.setTutorId(t.getTutorId());
        city.setCounty(t.getCounty());
        city.setState(t.getState());
//        city.setName(t.getName());

        return city;
    }

    public Long getCity_id() { return city_id; }

    public void setCity_id(Long city_id) { this.city_id = city_id; }


    public String getCounty() { return county; }

    public void setCounty(String county) { this.county = county; }


//    public String getName() { return name; }
//
//    public void setName(String name) { this.name = name; }


    public String getState() { return state; }

    public void setState(String state) { this.state = state; }


//    public Tutor getTutorId() { return tutor_id; }
//
//    public void setTutorId(Tutor tutor_id) { this.tutor_id = tutor_id; }

 }