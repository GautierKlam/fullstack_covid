package org.polytech.covid.service;

import java.time.LocalDate;
import java.util.List;

import org.polytech.covid.dao.ReservationRepository;
import org.polytech.covid.entities.Patient;
import org.polytech.covid.entities.Reservation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ReservationService {
    
    @Autowired
    private ReservationRepository reservationDAO;
    @Autowired
    private CentreService centreService;
    @Autowired
    private PatientService patientService;

    public List<Reservation> findAll(){
        return reservationDAO.findAll();
    }

    public List<Reservation> getByDate(LocalDate date){
        return reservationDAO.searchByDate(date);
    }

    public Reservation save(Reservation reservation){
        reservation.setCentre(centreService.getById(reservation.getCentre().getId()));
        Patient patient = patientService.getByEmail(reservation.getPatient().getEmail());
        if (patient==null){
            patientService.save(reservation.getPatient());
        }
        else{
            reservation.setPatient(patient);
        }
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
