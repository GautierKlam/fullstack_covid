package org.polytech.covid.entities;

import java.time.LocalDate;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name = "t_reservation")
public class Reservation {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id_reservation;
    private String statut;
    private LocalDate date;

    @OneToOne
    private Patient patient;

    public Reservation(String statut, LocalDate date, Patient patient) {
        this.statut = statut;
        this.date = date;
        this.patient = patient;
    }

    public String getStatut() {
        return statut;
    }

    public LocalDate getDate() {
        return date;
    }

    public Patient getPatient() {
        return patient;
    }

    public void setStatut(String statut) {
        this.statut = statut;
    }

    public void setDate(LocalDate date) {
        this.date = date;
    }

    public void setPatient(Patient patient) {
        this.patient = patient;
    }

}
