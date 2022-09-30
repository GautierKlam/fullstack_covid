package org.polytech.covid.controller;

import java.util.List;

import org.polytech.covid.entities.Reservation;
import org.polytech.covid.service.ReservationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ReservationController {
    
    @Autowired
    private ReservationService reservationService;

    @GetMapping(path = "/reservations")
    public List<Reservation> getAll(){
        return reservationService.findAll();
    }

    @GetMapping(path = "/reservations/{id}")
    public Reservation getReservation(@PathVariable int id){
        return reservationService.getById(id);
    }

    @PostMapping(path = "/reservation")
    public Reservation save(@RequestBody Reservation reservation){
        return reservationService.save(reservation);
    }

    @PutMapping(path = "/reservation/{id}")
    public Reservation update(@PathVariable int id, @RequestBody Reservation reservation){
        return reservationService.update(id, reservation);
    }

    @DeleteMapping(path = "/reservation/{id}")
    public void delete(@PathVariable int id){
        reservationService.delete(id);
    }
}
