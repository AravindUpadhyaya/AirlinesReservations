package com.hexaware.airlinesreservations.Airlinesreservations.Repositories;

import java.sql.Date;
import java.util.List;

import javax.transaction.Transactional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.hexaware.airlinesreservations.Airlinesreservations.models.Flights;
import com.hexaware.airlinesreservations.Airlinesreservations.models.Reservation;

@Repository
@Transactional
public interface ReservationRepository extends JpaRepository<Reservation, Integer> {
	
	/*
	 * @Query("Select * from Flights flight where flight.sourceCity like %?%" +
	 * " AND flight.destinationCity like %?% " + " AND flight.flightDate like %?%")
	 * public List<Flights> search(String sourceCity, String destinationCity, Date
	 * flightDate);
	 */

}
