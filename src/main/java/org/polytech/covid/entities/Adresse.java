package org.polytech.covid.entities;


import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="t_adresse")
public class Adresse {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id_adresse;
    private String ville;
    private String code_postal;
    private String pays;
    private String complement;

    public String getVille() {
        return ville;
    }
    public String getCode_postal() {
        return code_postal;
    }
    public String getPays() {
        return pays;
    }
    public String getComplement() {
        return complement;
    }
    public Adresse(String ville, String code_postal, String pays, String complement) {
        this.ville = ville;
        this.code_postal = code_postal;
        this.pays = pays;
        this.complement = complement;
    }
    public void setVille(String ville) {
        this.ville = ville;
    }
    public void setCode_postal(String code_postal) {
        this.code_postal = code_postal;
    }
    public void setPays(String pays) {
        this.pays = pays;
    }
    public void setComplement(String complement) {
        this.complement = complement;
    }
    
}
