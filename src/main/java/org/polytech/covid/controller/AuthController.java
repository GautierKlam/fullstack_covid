package org.polytech.covid.controller;

import java.security.Principal;
import java.util.Base64;

import javax.servlet.http.HttpServletRequest;

import org.polytech.covid.entities.Personne;
import org.polytech.covid.service.AuthService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.web.bind.annotation.GetMapping;
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
        Personne user = authService.login(personne.getEmail(), personne.getPassword());
        return user;
    }

    
    @GetMapping("/user")
    public UserDetails user(HttpServletRequest request){
        String authToken = request.getHeader("Authorization")
            .substring("Basic".length()).trim();
        String username = new String(Base64.getDecoder().decode(authToken)).split(":")[0];
        return authService.loadUserByUsername(username) ;
    }
    
}
