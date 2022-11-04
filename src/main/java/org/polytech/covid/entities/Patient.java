package org.polytech.covid.entities;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.FetchType;
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


    @OneToMany(mappedBy = "patient", fetch = FetchType.LAZY)
    private List<Reservation> reservations;

    @ManyToOne
    private Personnel personnel;

    
    public Patient() {
    }

    public Patient(String nom, String prenom, String email, String password, List<Reservation> reservations, Personnel personnel) {
        super(nom, prenom, email, password);
        this.reservations = reservations;
        this.personnel = personnel;
    }

    public int getId() {
        return id_patient;
    }

    public List<Reservation> getReservations() {
        return reservations;
    }

    public Personnel getMedecin() {
        return personnel;
    }

    public void setId(int id){
        this.id_patient = id;
    }

    public void setReservations(List<Reservation> reservations) {
        this.reservations = reservations;
    }

    public void setMedecin(Personnel personnel) {
        this.personnel = personnel;
    }
    
}
