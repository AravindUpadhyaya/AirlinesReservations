package com.hexaware.airlinesreservations.Airlinesreservations.Service;

import java.util.Date;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.hexaware.airlinesreservations.Airlinesreservations.Repositories.ReservationRepository;
import com.hexaware.airlinesreservations.Airlinesreservations.exception.FlightsException;
import com.hexaware.airlinesreservations.Airlinesreservations.models.Flights;
import com.hexaware.airlinesreservations.Airlinesreservations.models.Reservation;
import com.hexaware.airlinesreservations.Airlinesreservations.models.SearchFlights;

@Component
public class ReservationService {

	@Autowired
	private ReservationRepository reservationRepo;
	
	@Autowired
	private FlightsService flightService;
	
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
	
	public Reservation save (Reservation reservation) throws FlightsException {
		Reservation l_reservation =  reservationRepo.save(reservation);
		
		Flights flight = flightService.findById(reservation.getFlightID()).get();
		int seats = flight.getSeats();
		seats --;
		if (seats < 0) {
			throw  new FlightsException(new Date(), "No seats available", "No seats available");
		} else {
			// decreasing the number of seat by 1 for the booked flight
			flight.setSeats(seats);
			flightService.saveFlight(flight);
		}
		return l_reservation;
	}
	
	
	public Reservation update(Reservation reservation) {
		Reservation l_reservation =  reservationRepo.save(reservation);
		return l_reservation;
	}
}
