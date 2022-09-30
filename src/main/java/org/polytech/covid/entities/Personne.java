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

    public Personne() {
    }

    public Personne(String nom, String prenom, String email, String password, int numero_telephone, Adresse adresse) {
        this.nom = nom;
        this.prenom = prenom;
        this.email = email;
        this.password = password;
        this.numero_telephone = numero_telephone;
        this.adresse = adresse;
    }

    public String getPrenom() {
        return prenom;
    }

    public String getEmail() {
        return email;
    }

    public String getPassword() {
        return password;
    }

    public int getNumero_telephone() {
        return numero_telephone;
    }

    public Adresse getAdresse() {
        return adresse;
    }

    public void setPrenom(String prenom) {
        this.prenom = prenom;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public void setNumero_telephone(int numero_telephone) {
        this.numero_telephone = numero_telephone;
    }

    public void setAdresse(Adresse adresse) {
        this.adresse = adresse;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }


}
