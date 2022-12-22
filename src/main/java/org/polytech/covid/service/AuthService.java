package org.polytech.covid.service;

import java.util.Optional;

import org.polytech.covid.entities.Personnel;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

@Service
public class AuthService implements UserDetailsService {

    @Autowired
    private PersonnelService personnelService;

    public Personnel login(String email, String password){
        UserDetails personnel = loadUserByUsername(email);
        if (personnelService.getPasswordEncoder().matches(password, personnel.getPassword())) return personnelService.getByEmail(email).get();
        else return null;
    }

    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        Optional<Personnel> optionalPersonnel = personnelService.getByEmail(username);
        if (optionalPersonnel.isPresent()) {
            UserDetails personnel = optionalPersonnel.get();
            return personnel;
        } else {
            throw new UsernameNotFoundException("l'utilisateur "+username+" n'existe pas");
        }
    }
}
