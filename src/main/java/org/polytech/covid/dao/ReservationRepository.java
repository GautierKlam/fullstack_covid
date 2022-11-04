package org.polytech.covid.dao;

import java.time.LocalDate;

import org.polytech.covid.entities.Reservation;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ReservationRepository extends JpaRepository<Reservation, Integer>{
    Reservation[] searchByDate(LocalDate date);
}
