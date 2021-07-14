package com.veterinary_clinic_adm.schedulingservice.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import java.util.Date;


@Entity
@Table(name = "agendamento")
public class Agenda {
    private long consulta_id;
    private int tutor_id;
    private int animal_id;
    private Date date;
    private String horain;
    private String horaout;

    public Agenda() {

    }

    public Agenda(long consulta_id, int tutor_id, int animal_id, Date date, String horain, String horaout) {
        this.consulta_id = consulta_id;
        this.tutor_id = tutor_id;
        this.animal_id = animal_id;
        this.date = date;
        this.horain = horain;
        this.horaout = horaout;
    }

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    public long getConsulta_id() {
        return consulta_id;
    }

    public void setConsulta_id(long consulta_id) {
        this.consulta_id = consulta_id;
    }

    @Column(name = "tutor_id", nullable = false)
    public int getTutor_id() {
        return tutor_id;
    }

    public void setTutor_id(int tutor_id) {
        this.tutor_id = tutor_id;
    }

    @Column(name = "animal_id", nullable = false)
    public int getAnimal_id() {
        return animal_id;
    }

    public void setAnimal_id(int animal_id) {
        this.animal_id = animal_id;
    }

    @Column(name = "data", nullable = false)
    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    @Column(name = "horain", nullable = false)
    public String getHorain() {
        return horain;
    }

    public void setHorain(String horain) {
        this.horain = horain;
    }

    @Column(name = "horaout", nullable = false)
    public String getHoraout() {
        return horaout;
    }

    public void setHoraout(String horaout) {
        this.horaout = horaout;
    }

   /* @Override
    public String toString() {
        return "Agenda{" +
                "id=" + id +
                ", tutor_id=" + tutor_id +
                ", animal_id=" + animal_id +
                ", date=" + date +
                ", horain='" + horain + '\'' +
                ", horaout='" + horaout + '\'' +
                '}';
    }*/
}