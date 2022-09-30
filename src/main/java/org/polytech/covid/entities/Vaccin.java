package org.polytech.covid.entities;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="t_vaccin")
public class Vaccin {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id_vaccin;
    private String nom_vaccin;
    private int nb_dose_max;

}
