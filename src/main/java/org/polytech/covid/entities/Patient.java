package org.polytech.covid.entities;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name = "t_patient")
public class Patient extends Personne {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id_patient;


    @OneToMany
    private List<Reservation> reservations;

    @ManyToOne
    private Medecin medecin;

    public Patient(String nom, String prenom, String email, String password, int numero_telephone, Adresse adresse,List<Reservation> reservations, Medecin medecin) {
        super(nom, prenom, email, password, numero_telephone, adresse);
        this.reservations = reservations;
        this.medecin = medecin;
    }

    public List<Reservation> getReservations() {
        return reservations;
    }

    public Medecin getMedecin() {
        return medecin;
    }

    public void setId(int id){
        this.id_patient = id;
    }

    public void setReservations(List<Reservation> reservations) {
        this.reservations = reservations;
    }

    public void setMedecin(Medecin medecin) {
        this.medecin = medecin;
    }
    
}
