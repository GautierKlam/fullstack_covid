package org.polytech.covid.controller;

import java.util.List;

import org.polytech.covid.entities.Administrateur;
import org.polytech.covid.service.AdministrateurService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AdministrateurController {
    
    @Autowired
    private AdministrateurService administrateurService;

    @GetMapping(path = "/administrateurs")
    public List<Administrateur> getAll(){
        return administrateurService.findAll();
    }

    @GetMapping(path = "/administrateurs/{id}")
    public Administrateur getMedecin(@PathVariable int id){
        return administrateurService.getById(id);
    }

    @PostMapping(path = "/administrateur")
    public Administrateur save(@RequestBody Administrateur admin){
        return administrateurService.save(admin);
    }

    @PutMapping(path = "/administrateur/{id}")
    public Administrateur update(@PathVariable int id, @RequestBody Administrateur admin){
        return administrateurService.update(id, admin);
    }

    @DeleteMapping(path = "/administrateur/{id}")
    public void delete(@PathVariable int id){
        administrateurService.delete(id);
    }
}
