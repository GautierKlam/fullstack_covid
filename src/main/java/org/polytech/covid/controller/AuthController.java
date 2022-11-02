package org.polytech.covid.controller;

import org.polytech.covid.entities.Personne;
import org.polytech.covid.service.AuthService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RequestMapping("api/")
@RestController
public class AuthController {
    
    @Autowired
    private AuthService authService;

    @PostMapping(path="auth/login")
    public Personne login(@RequestBody Personne personne){
        return authService.login(personne.getEmail(), personne.getPassword());
    }
}
