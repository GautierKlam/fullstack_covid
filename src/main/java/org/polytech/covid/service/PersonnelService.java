package org.polytech.covid.service;

import java.util.List;

import org.polytech.covid.dao.PersonnelRepository;
import org.polytech.covid.entities.Personnel;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PersonnelService {
    
    @Autowired
    private PersonnelRepository personnelDAO;

    public List<Personnel> findAll(){
        return personnelDAO.findAll();
    }

    public Personnel getById(int id){
        return personnelDAO.findById(id).get();  
    }

    public Personnel getByEmail(String email){
        return personnelDAO.searchByEmail(email);
    }

    public Personnel save(Personnel personnel){
        return personnelDAO.save(personnel);
    }

    public Personnel update(int id, Personnel personnel){
        personnel.setId(id);
        personnelDAO.deleteById(id);
        return personnelDAO.save(personnel);
    }

    public void delete(int id){
        personnelDAO.deleteById(id);
    }
}
