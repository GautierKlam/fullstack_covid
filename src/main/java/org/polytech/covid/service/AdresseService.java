package org.polytech.covid.service;

import java.util.List;

import org.polytech.covid.dao.AdresseRepository;
import org.polytech.covid.entities.Adresse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class AdresseService {
    
    @Autowired
    private AdresseRepository adresseDAO;

    private List<Adresse> findAll(){
        return adresseDAO.findAll();
    }

    
}
