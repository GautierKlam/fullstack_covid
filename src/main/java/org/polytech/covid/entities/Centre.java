package org.polytech.covid.entities;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.ForeignKey;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name = "t_centre")
public class Centre {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id_centre;
    private String nom;

    @OneToOne(cascade = {CascadeType.PERSIST, CascadeType.REMOVE})
    @JoinColumn(name = "id_adresse",
    foreignKey =  @ForeignKey(name = "adresse_fk"),
    nullable = false)
    private Adresse adresse;

    @OneToMany(mappedBy = "centre")
    private List<Medecin> medecins;


    public Centre() {
    }

    public Centre(String nom, Adresse adresse, List<Medecin> medecins) {
        this.nom = nom;
        this.adresse = adresse;
        this.medecins = medecins;
    }

    
    public String getNom() {
        return nom;
    }

    public Adresse getAdresse() {
        return adresse;
    }

    public List<Medecin> getMedecins() {
        return medecins;
    }

    public void setId(int id){
        this.id_centre = id;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public void setAdresse(Adresse adresse) {
        this.adresse = adresse;
    }

    public void setMedecins(List<Medecin> medecins) {
        this.medecins = medecins;
    }

    

    

}
