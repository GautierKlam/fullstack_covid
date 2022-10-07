package org.polytech.covid.service;

import java.util.List;

import org.polytech.covid.dao.AdministrateurRepository;
import org.polytech.covid.entities.Administrateur;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class AdministrateurService {
    
    @Autowired
    private AdministrateurRepository administrateurDAO;

    public List<Administrateur> findAll(){
        return administrateurDAO.findAll();
    }

    public Administrateur getById(int id){
        return administrateurDAO.getReferenceById(id);  
    }

    public Administrateur save(Administrateur admin){
        return administrateurDAO.save(admin);
    }

    public Administrateur update(int id, Administrateur admin){
        admin.setId(id);
        return administrateurDAO.save(admin);
    }

    public void delete(int id){
        administrateurDAO.deleteById(id);
    }
}
