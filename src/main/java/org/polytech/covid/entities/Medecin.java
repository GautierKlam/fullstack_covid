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


    public Medecin() {
    }

    public Medecin(String nom, String prenom, String email, String password, int numero_telephone, Adresse adresse,List<Patient> patients, Centre centre) {
        super(nom,prenom, email, password, numero_telephone, adresse);
        this.patients = patients;
        this.centre = centre;
    }

    public List<Patient> getPatients() {
        return patients;
    }

    public Centre getCentre() {
        return centre;
    }

    public void setId(int id){
        this.id_medecin = id;
    }

    public void setPatients(List<Patient> patients) {
        this.patients = patients;
    }

    public void setCentre(Centre centre) {
        this.centre = centre;
    }

    
}
