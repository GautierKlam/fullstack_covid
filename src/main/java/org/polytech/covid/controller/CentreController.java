package org.polytech.covid.controller;

import java.util.List;

import org.polytech.covid.dao.CentreRepository;
import org.polytech.covid.entities.Centre;
import org.polytech.covid.service.CentreService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CentreController {
    
    @Autowired
    private CentreService centreService;

    @GetMapping(path = "/centres")
    public List<Centre> getAll(){
        return centreService.findAll();
    }

    @GetMapping(path = "/centre/{id}")
    public Centre getCentre(@PathVariable int id){
        return centreService.getById(id);
    }
}
