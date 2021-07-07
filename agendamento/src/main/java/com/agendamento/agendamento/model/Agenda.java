package com.agendamento.agendamento.model;

// import javax.persistence.Entity;
// import javax.persistence.Table;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;


@Entity
@Table(name = "consulta")
public class Agenda {
    private long id;
    private String tutorName;
    private String animalName;
    private String datee;
    private String startHour;
    private String endHour;

    public Agenda(){

    }

    public Agenda(long id, String tutorName, String animalName, String datee, String startHour, String endHour) {
        this.id = id;

        this.tutorName = tutorName;
        this.animalName = animalName;
        this.datee = datee;
        this.startHour = startHour;
        this.endHour = endHour;
    }

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    @Column(name = "tutorName", nullable = false)
    public String getTutorName() {
        return tutorName;
    }

    public void setTutorName(String tutorName) {
        this.tutorName = tutorName;
    }

    @Column(name = "animalName", nullable = false)
    public String getAnimalName() {
        return animalName;
    }

    public void setAnimalName(String animalName) {
        this.animalName = animalName;
    }

    @Column(name = "datee", nullable = false)
    public String getDatee() {
        return datee;
    }

    public void setDatee(String datee) {
        this.datee = datee;
    }

    @Column(name = "startHour", nullable = false)
    public String getStartHour() {
        return startHour;
    }

    public void setStartHour(String startHour) {
        this.startHour = startHour;
    }

    @Column(name = "endHour", nullable = false)
    public String getEndHour() {
        return endHour;
    }

    public void setEndHour(String endHour) {
        this.endHour = endHour;
    }

    @Override
    public String toString() {
        return "Agenda{" +
                "id=" + id +
                ", tutorName='" + tutorName + '\'' +
                ", animalName='" + animalName + '\'' +
                ", datee='" + datee + '\'' +
                ", startHour='" + startHour + '\'' +
                ", endHour='" + endHour + '\'' +
                '}';
    }
}
