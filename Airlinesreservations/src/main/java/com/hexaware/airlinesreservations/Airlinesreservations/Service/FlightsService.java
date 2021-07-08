package com.hexaware.airlinesreservations.Airlinesreservations.Service;

import java.util.Date;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.hexaware.airlinesreservations.Airlinesreservations.Repositories.FlightsRepository;
import com.hexaware.airlinesreservations.Airlinesreservations.exception.FlightsException;
import com.hexaware.airlinesreservations.Airlinesreservations.models.Flights;

@Component
public class FlightsService {

	@Autowired
	private FlightsRepository flightsRepo;
	
	public List<Flights> findAll() {
		return flightsRepo.findAll();
	}
	
	public Optional<Flights> findById(int id) throws FlightsException {
		Optional<Flights> flight = flightsRepo.findById(id);
		if (!flight.isPresent()) {
			throw new FlightsException(new Date(), "No Flight Found", "No Flight Found");
		}
		return flight;
	}
	
	public Flights saveFlight(Flights flight) {
		return flightsRepo.save(flight);
	}
	
	public Flights updateFlight(Flights flight) {
		return flightsRepo.save(flight);
	}
	
	public void deleteFlight(Flights flight) {
		flightsRepo.delete(flight);
	}
}
