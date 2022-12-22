package org.polytech.covid.service;

import java.util.List;
import java.util.Optional;

import org.polytech.covid.dao.PersonnelRepository;
import org.polytech.covid.entities.Personnel;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

@Service
public class PersonnelService {
    
    private PersonnelRepository personnelDAO;
    
    @Autowired
    private PasswordEncoder passwordEncoder;

    @Autowired
    public PersonnelService(PersonnelRepository personnelDAO , PasswordEncoder passwordEncoder) {
        this.personnelDAO = personnelDAO;
        this.passwordEncoder = passwordEncoder;
    }

    public PasswordEncoder getPasswordEncoder(){
        return passwordEncoder;
    }

    public List<Personnel> findAll(){
        return personnelDAO.findAll();
    }

    public Personnel getById(int id){
        return personnelDAO.findById(id).get();
    }

    public Optional<Personnel> getByEmail(String email){
        return personnelDAO.searchByEmail(email);
    }

    public Personnel save(Personnel personnel){
        return personnelDAO.save(personnel);
    }

    public Personnel update(int id, Personnel personnel){
        Personnel personnelOld = personnelDAO.getReferenceById(id);
        personnelOld.setCentre(personnel.getCentre());
        personnelOld.setNom(personnel.getNom());
        personnelOld.setPrenom(personnel.getPrenom());
        personnelOld.setEmail(personnel.getEmail());
        personnelOld.setPassword(personnel.getPassword());
        return personnelDAO.save(personnelOld);
    }

    public List<Personnel> getByCentreId(int id){
        return personnelDAO.searchByCentreId(id);
    }

    public void delete(int id){
        personnelDAO.deleteById(id);
    }

}
