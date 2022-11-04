package org.polytech.covid;

import org.polytech.covid.dao.PersonnelRepository;

import java.util.ArrayList;

import org.polytech.covid.dao.AdresseRepository;
import org.polytech.covid.dao.CentreRepository;
import org.polytech.covid.dao.PatientRepository;

import org.polytech.covid.dao.ReservationRepository;
import org.polytech.covid.entities.Personnel;
import org.polytech.covid.entities.Adresse;
import org.polytech.covid.entities.Centre;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class CovidApiApplication {

	public static void main(String[] args) {
		SpringApplication.run(CovidApiApplication.class, args);
	}

	@Bean
    CommandLineRunner runner   (CentreRepository centreInterface, AdresseRepository adresseInterface, PatientRepository patientInterface, ReservationRepository reservationInterface, PersonnelRepository personnelInterface){
        return args -> {
            centreInterface.save(new Centre("CHRU Nancy Brabois",new Adresse("Nancy","54511","FRANCE","Rue de Morvan"), new ArrayList<Personnel>()));
            centreInterface.save(new Centre("CHR Thionville",new Adresse("Metz","57530","FRANCE","Allee du chateau"), new ArrayList<Personnel>()));
            centreInterface.save(new Centre("CHRU Strasbourg",new Adresse("Strasbourg","67000","FRANCE","place de l'hopitale"), new ArrayList<Personnel>()));
            personnelInterface.save(new Personnel("Tenede", "Bryan", "tenede@bryan.com", "password", null));

        };
}
}
