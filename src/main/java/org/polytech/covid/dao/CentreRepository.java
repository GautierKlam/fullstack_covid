package org.polytech.covid.dao;

import java.util.List;

import org.polytech.covid.entities.Centre;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CentreRepository extends JpaRepository<Centre, Integer>{
    List<Centre> searchByAdresseVilleIgnoringCase(String ville);
    List<Centre> searchByAdresseCodepostal(String codepostal);

}
