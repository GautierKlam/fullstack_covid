package org.polytech.covid.service;

import org.polytech.covid.entities.Personnel;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class AuthService {

    @Autowired
    private PersonnelService personnelService;

    public Personnel login(String email, String password){
        Personnel personnel = personnelService.getByEmail(email);
        if( personnel!=null) {
            if (personnel.getPassword().equals(password)) return personnel;
        }
        return null;
    }
}
