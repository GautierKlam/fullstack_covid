package org.polytech.covid.service;

import java.util.List;

import org.polytech.covid.dao.CentreRepository;
import org.polytech.covid.entities.Centre;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CentreService {
    
    @Autowired
    public CentreRepository centreDAO;

    public List<Centre> findAll(){
        return centreDAO.findAll();
    }

    public List<Centre> searchByVille(String ville){
        return centreDAO.searchByAdresseVilleIgnoringCase(ville);
    }

    public List<Centre> searchByCodepostal(String codepostal){
        return centreDAO.searchByAdresseCodepostal(codepostal);
    }

    public Centre getById(int id){
        return centreDAO.getReferenceById(id);
    }

    public Centre getByNom(String nom){
        return centreDAO.searchByNom(nom);
    }

    public Centre save(Centre centre){
        return centreDAO.save(centre);
    }

    public Centre update(int id, Centre centre){
        centre.setId(id);
        return centreDAO.save(centre);
    }

    public void delete(int id){
        centreDAO.deleteById(id);
    }
}
