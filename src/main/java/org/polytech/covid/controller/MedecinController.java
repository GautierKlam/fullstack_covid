package org.polytech.covid.controller;

import java.util.List;

import org.polytech.covid.entities.Medecin;
import org.polytech.covid.service.MedecinService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RequestMapping("api/public/")
@RestController
public class MedecinController {
    
    @Autowired
    private MedecinService medecinService;

    @GetMapping(path = "/medecins")
    public List<Medecin> getAll(){
        return medecinService.findAll();
    }

    @GetMapping(path = "/medecins/{id}")
    public Medecin getMedecin(@PathVariable int id){
        return medecinService.getById(id);
    }

    @GetMapping(path = "/medecins/{email}")
    public Medecin getMedecinByEmail(@PathVariable String email){
        return medecinService.getByEmail(email);
    }

    @PostMapping(path = "/medecin")
    public Medecin save(@RequestBody Medecin medecin){
        return medecinService.save(medecin);
    }

    @PutMapping(path = "/medecin/{id}")
    public Medecin update(@PathVariable int id, @RequestBody Medecin medecin){
        return medecinService.update(id, medecin);
    }

    @DeleteMapping(path = "/medecin/{id}")
    public void delete(@PathVariable int id){
        medecinService.delete(id);
    }
}
