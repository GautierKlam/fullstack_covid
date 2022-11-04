package org.polytech.covid.entities;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name = "t_administrateur")
public class Personnel extends Personne {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id_admin;

    @OneToOne
    private Centre centre;

    public Personnel() {
    }

    public Personnel(String nom, String prenom, String email, String password, Centre centre) {
        super(nom, prenom, email, password);
        this.centre = centre;
    }

    public int getId(){
        return id_admin;
    }

    public Centre getCentre() {
        return centre;
    }

    public void setCentre(Centre centre) {
        this.centre = centre;
    }
    
    public void setId(int id){
        this.id_admin = id;
    }
}
