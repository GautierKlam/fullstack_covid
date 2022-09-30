package org.polytech.covid.entities;


import javax.persistence.MappedSuperclass;
import javax.persistence.OneToOne;

@MappedSuperclass
public class Personne {

    private String nom;
    private String prenom;
    private String email;
    private String password;
    private int numero_telephone;

    @OneToOne
    private Adresse adresse;


}
