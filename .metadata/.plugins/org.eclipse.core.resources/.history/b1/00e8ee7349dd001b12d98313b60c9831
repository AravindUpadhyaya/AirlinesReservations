package com.hexaware.airlinesreservations.Airlinesreservations.Service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.hexaware.airlinesreservations.Airlinesreservations.Repositories.ReservationRepository;
import com.hexaware.airlinesreservations.Airlinesreservations.models.Flights;
import com.hexaware.airlinesreservations.Airlinesreservations.models.Reservation;
import com.hexaware.airlinesreservations.Airlinesreservations.models.SearchFlights;

@Component
public class ReservationService {

	@Autowired
	private ReservationRepository reservationRepo;
	
	public List<Reservation> findAllReservation() {
		return reservationRepo.findAll();
	}
	
	public Optional<Reservation> findById(int ID) {
		Optional<Reservation> reservation = reservationRepo.findById(ID);
		if (!reservation.isPresent()) {
			//throw exception here 
			//TODO
		}
		return reservation;
	}
	
	public List<Flights> searchFlights(SearchFlights search ) {
		/*
		 * return reservationRepo.search(search.getSourceCity(),
		 * search.getDestinationCity(), search.getTravelDate());
		 */
		return null;
	}
	
	public Reservation save (Reservation reservation) {
		Reservation l_reservation =  reservationRepo.save(reservation);
		
		//After saving, decrease the number of available seats for the flight
		//TODO
		
		return l_reservation;
	}
	
	
	public Reservation update(Reservation reservation) {
		Reservation l_reservation =  reservationRepo.save(reservation);
		
		//After saving, decrease the number of available seats for the flight
		//TODO
		return l_reservation;
	}
}
