package org.polytech.covid.entities;

import java.time.LocalDate;

import javax.persistence.Entity;

import javax.persistence.MappedSuperclass;
import javax.persistence.OneToOne;

@MappedSuperclass
@Entity
public class Personne {

    private String nom;
    private String prenom;
    private String email;
    private String password;
    private LocalDate date;
    private int numero;

    @OneToOne
    private Adresse adresse;


}
