//package com.veterinary_clinic_adm.springframework.controller.dto;
//
//public class TutorRs {
//
//    private int tutor_id;
//    private String cpf;
//    private String name;
//    private String rg;
//    private String email;
//    private String nationality;
//    private String phone;
//
//    public static TutorRs converter(Tutor t) {
//
//        var tutor = new TutorRs();
//
//        tutor.setTutorId(t.getTutorId());
//        tutor.setCpf(t.getCpf());
//        tutor.setName(t.getName());
//        tutor.setRg(t.getRg());
//        tutor.setEmail(t.getEmail());
//        tutor.setNationality(t.getNationality());
//        tutor.setRg(t.getRg());
//
//        return tutor;
//    }
//
//    public int getTutorId() { return tutor_id; }
//
//    public void setTutorId(int tutor_id) { this.tutor_id = tutor_id; }
//
//
//    public String getCpf() { return cpf; }
//
//    public void setCpf(String cpf) { this.cpf = cpf; }
//
//
//    public String getName() { return name; }
//
//    public void setName(String name) { this.name = name; }
//
//
//    public String getRg() { return rg; }
//
//    public void setRg(String rg) { this.rg = rg; }
//
//
//    public String getEmail() { return email; }
//
//    public void setEmail(String email) { this.email = email; }
//
//
//    public String getNationality() { return nationality; }
//
//    public void setNationality(String nationality) { this.nationality = nationality; }
//
//
//    public String getPhone() { return phone; }
//
//    public void setPhone(String phone) { this.phone = phone; }
//
//}