package com.hexaware.airlinesreservations.Airlinesreservations.Repositories;

import javax.transaction.Transactional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.hexaware.airlinesreservations.Airlinesreservations.models.Flights;

@Repository
@Transactional
public interface FlightsRepository extends JpaRepository<Flights, Integer>{

}
