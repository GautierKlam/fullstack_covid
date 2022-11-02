package org.polytech.covid.service;

import org.polytech.covid.entities.Administrateur;
import org.polytech.covid.entities.Medecin;
import org.polytech.covid.entities.Personne;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class AuthService {

    @Autowired
    private MedecinService medecinService;
    @Autowired
    private AdministrateurService administrateurService;

    public Personne login(String email, String password){
        Medecin medecin = medecinService.getByEmail(email);
        Administrateur admin = administrateurService.getByEmail(email);
        if(medecin==null && admin==null) return null;
        else {
            if (medecin!=null){
                if (medecin.getPassword().equals(password)) return medecin;
            }
            else {
                if (admin.getPassword().equals(password)) return admin;
            }
            return null;
        }
    }
}
