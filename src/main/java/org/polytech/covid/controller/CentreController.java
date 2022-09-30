package org.polytech.covid.controller;

import java.util.List;

import org.polytech.covid.entities.Centre;
import org.polytech.covid.service.CentreService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CentreController {
    
    @Autowired
    private CentreService centreService;

    @GetMapping(path = "/centres")
    public List<Centre> getAll(){
        return centreService.findAll();
    }

    @GetMapping(path = "/centres/{id}")
    public Centre getCentre(@PathVariable int id){
        return centreService.getById(id);
    }

    @PostMapping(path = "/centre")
    public Centre save(@RequestBody Centre centre){
        return centreService.save(centre);
    }

    @PutMapping(path = "/centre/{id}")
    public Centre update(@PathVariable int id, @RequestBody Centre centre){
        return centreService.update(id, centre);
    }

    @DeleteMapping(path = "/centre/{id}")
    public void delete(@PathVariable int id){
        centreService.delete(id);
    }
}
