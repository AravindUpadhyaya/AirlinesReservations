package com.hexaware.airlinesreservations.Airlinesreservations.Controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.hexaware.airlinesreservations.Airlinesreservations.Service.ReservationService;
import com.hexaware.airlinesreservations.Airlinesreservations.exception.FlightsException;
import com.hexaware.airlinesreservations.Airlinesreservations.models.Flights;
import com.hexaware.airlinesreservations.Airlinesreservations.models.Reservation;
import com.hexaware.airlinesreservations.Airlinesreservations.models.SearchFlights;

@RestController
public class ReservationController {
	
	@Autowired
	ReservationService reservationService;
	
	@GetMapping("/getAllReservations")
	public List<Reservation> findAllReservation(){
		return reservationService.findAllReservation();
	}
	
	@GetMapping("/getReservationByID")
	public Optional<Reservation> findById(@RequestParam String id) {
		return reservationService.findById(Integer.parseInt(id));
	}
	
	@GetMapping("/searchFlights")
	public List<Flights> search(@RequestBody SearchFlights search) {
		return reservationService.searchFlights(search);
	}
	
	@PostMapping("/saveReservation")
	public Reservation saveReservation(@RequestBody Reservation reservation) throws FlightsException {
		return reservationService.save(reservation);
	}
	
	@PutMapping("/updateReservation")
	public Reservation updateReservation(@RequestBody Reservation reservation) {
		return reservationService.update(reservation);
	}

}
