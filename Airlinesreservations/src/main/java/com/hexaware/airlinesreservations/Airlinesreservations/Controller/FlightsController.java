package com.hexaware.airlinesreservations.Airlinesreservations.Controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.hexaware.airlinesreservations.Airlinesreservations.Service.FlightsService;
import com.hexaware.airlinesreservations.Airlinesreservations.exception.FlightsException;
import com.hexaware.airlinesreservations.Airlinesreservations.models.Flights;

@RestController
public class FlightsController {
	
	@Autowired
	private FlightsService flightsService;
	
	@GetMapping("/allflights")
	public List<Flights> findAllFlights() {
		return flightsService.findAll();
	}
	
	@GetMapping("/findById")
	public Optional<Flights> findById(@RequestParam String id) throws NumberFormatException, FlightsException {
		return flightsService.findById(Integer.parseInt(id));
	}
	
	@PostMapping("/insertFlight")
	public void saveFlight (@RequestBody Flights flight) {
		flightsService.saveFlight(flight);
	}
	
	@PutMapping("/updateFlight")
	public void updateFlight (@RequestBody Flights flight) {
		flightsService.updateFlight(flight);
	}
	
	@DeleteMapping("/deleteFlight")
	public void deleteFlight(@RequestBody Flights flight) {
		flightsService.deleteFlight(flight);
	}
}
