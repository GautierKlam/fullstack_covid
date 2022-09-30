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

    public Centre getById(int id){
        return centreDAO.getReferenceById(id);
    }
}
