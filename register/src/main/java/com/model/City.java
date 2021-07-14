// package com.veterinary_clinic_adm.register.model;
package com.model;

 import javax.persistence.*;

 @Entity
 @Table(name = "city")

 public class City{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)

 //    @Column(name = "tutor_id")
 //    private int tutor_id;

    @Column(name = "city_id")
    private Long city_id;

//    @Column(name = "name")
//    private String name;

    @Column(name = "county")
    private String county;

    @Column(name = "state")
    private String state;

    @OneToMany
//    @JoinColumn(name = "tutor_id")
//    private Tutor tutor_id;


    public Long getCity_id() { return city_id; }
   
    public void setCity_id(Long city_id) { this.city_id = city_id; }


//    public String getName() { return name; }
//
//    public void setName(String name) { this.name = name; }


    public String getCounty() { return county; }
   
    public void setCounty(String county) { this.county = county; }


    public String getState() { return state; }
   
    public void setState(String state) { this.state = state; }


//    public Tutor getTutorId() { return tutor_id; }
//
//    public void setTutorId(Tutor tutor_id) { this.tutor_id = tutor_id; }
   

 }


