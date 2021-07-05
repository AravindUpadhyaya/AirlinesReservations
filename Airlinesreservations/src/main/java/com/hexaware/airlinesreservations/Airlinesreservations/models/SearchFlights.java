package com.hexaware.airlinesreservations.Airlinesreservations.models;

import java.sql.Date;

public class SearchFlights {

	private String sourceCity;
	
	private String destinationCity;
	
	private Date travelDate;
	
	public SearchFlights () {
		
	}
	
	public SearchFlights(String sourceCity, String destinationCity, Date travelDate) {
		super();
		this.sourceCity = sourceCity;
		this.destinationCity = destinationCity;
		this.travelDate = travelDate;
	}

	public String getSourceCity() {
		return sourceCity;
	}

	public void setSourceCity(String sourceCity) {
		this.sourceCity = sourceCity;
	}

	public String getDestinationCity() {
		return destinationCity;
	}

	public void setDestinationCity(String destinationCity) {
		this.destinationCity = destinationCity;
	}

	public Date getTravelDate() {
		return travelDate;
	}

	public void setTravelDate(Date travelDate) {
		this.travelDate = travelDate;
	}
	
}
