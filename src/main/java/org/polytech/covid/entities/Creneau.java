package org.polytech.covid.entities;

import java.time.LocalDate;
import java.time.LocalTime;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;

@Entity
public class Creneau {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id_creneau;
    private LocalTime heure_debut;
    private LocalTime heure_fin;
    private LocalDate date;
    private Boolean est_libre;

    @OneToOne
    private Centre centre;

    @OneToOne
    private Medecin medecin;

}
