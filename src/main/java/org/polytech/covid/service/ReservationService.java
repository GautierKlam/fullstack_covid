package org.polytech.covid.service;

import java.util.List;

import org.polytech.covid.dao.ReservationRepository;
import org.polytech.covid.entities.Reservation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ReservationService {
    
    @Autowired
    private ReservationRepository reservationDAO;
    private CentreService centreService;

    public List<Reservation> findAll(){
        return reservationDAO.findAll();
    }

    public Reservation getById(int id){
        return reservationDAO.getReferenceById(id);
        
    }

    public Reservation save(Reservation reservation){
        reservation.setCentre(centreService.getByNom(reservation.getCentre().getNom()));
        return reservationDAO.save(reservation);
    }

    public Reservation update(int id, Reservation reservation){
        reservation.setId(id);
        return reservationDAO.save(reservation);
    }

    public void delete(int id){
        reservationDAO.deleteById(id);
    }
}
