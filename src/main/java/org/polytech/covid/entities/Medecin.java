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
@Table(name = "t_medecin")
public class Medecin extends Personne {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id_medecin;

    @OneToMany(mappedBy = "medecin")
    private List<Patient> patients;

    @ManyToOne
    private Centre centre;
}
