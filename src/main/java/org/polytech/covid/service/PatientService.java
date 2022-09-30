package org.polytech.covid.service;

import java.util.List;

import org.polytech.covid.dao.PatientRepository;
import org.polytech.covid.entities.Patient;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PatientService {
    
    @Autowired
    private PatientRepository patientDAO;

    public List<Patient> findAll(){
        return patientDAO.findAll();
    }

    public Patient getById(int id){
        return patientDAO.getReferenceById(id);
        
    }

    public Patient save(Patient Patient){
        return patientDAO.save(Patient);
    }

    public Patient update(int id, Patient Patient){
        patient.setId(id);
        return patientDAO.save(Patient);
    }

    public void delete(int id){
        patientDAO.deleteById(id);
    }
}
