package com.veterinary_clinic_adm.schedulingservice.controller.dto;

import java.util.Date;

public class AgendaRq {
    private int tutor_id;
    private int animal_id;
    private Date date;
    private String horain;
    private String horaout;

    public int getTutor_id() {
        return tutor_id;
    }

    public void setTutor_id(int tutor_id) {
        this.tutor_id = tutor_id;
    }

    public int getAnimal_id() {
        return animal_id;
    }

    public void setAnimal_id(int animal_id) {
        this.animal_id = animal_id;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public String getHorain() {
        return horain;
    }

    public void setHorain(String horain) {
        this.horain = horain;
    }

    public String getHoraout() {
        return horaout;
    }

    public void setHoraout(String horaout) {
        this.horaout = horaout;
    }
}
