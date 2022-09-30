package org.polytech.covid.service;

import java.util.List;

import org.polytech.covid.dao.MedecinRepository;
import org.polytech.covid.entities.Medecin;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class MedecinService {
    
    @Autowired
    private MedecinRepository medecinDAO;

    public List<Medecin> findAll(){
        return medecinDAO.findAll();
    }

    public Medecin getById(int id){
        return medecinDAO.getReferenceById(id);
        
    }

    public Medecin save(Medecin centre){
        return medecinDAO.save(centre);
    }

    public Medecin update(int id, Medecin centre){
        medecin.setId(id);
        return medecinDAO.save(centre);
    }

    public void delete(int id){
        medecinDAO.deleteById(id);
    }
}
