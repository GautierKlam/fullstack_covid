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

    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "id_adresse",
    foreignKey =  @ForeignKey(name = "adresse_fk"),
    nullable = false)
    private Adresse adresse;

    @OneToMany(mappedBy = "centre")
    private List<Medecin> medecins;

    @OneToMany
    private List<Vaccin> vaccins;

    

}
