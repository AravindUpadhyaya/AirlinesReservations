package com.hexaware.airlinesreservations.Airlinesreservations.models;

import java.sql.Date;
import java.sql.Timestamp;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "Flights")
public class Flights {

	@Id
	@GeneratedValue
	@Column(name = "flight_id")
	private int flightID;
	
	@Column(name = "flight_name")
	private String flightName;
	
	@Column(name = "source_city")
	private String sourceCity;
	
	@Column(name = "destination_city")
	private String destinationCity;
	
	@Column(name = "flight_date")
	private Date flightDate;
	
	@Column(name = "seats_available")
	private int seats;
	
	@Column(name = "price")
	private int price;
	
	@Column(name = "create_user")
	private String userID;
	
	@Column(name = "create_timestmap")
	private Timestamp createTimestamp;
	
	public Flights() {
		
	}

	public Flights(int flightID, String flightName, String sourceCity, String destinationCity, Date flightDate, int seats, int price,
			String userID, Timestamp createTimestamp) {
		super();
		this.flightID = flightID;
		this.flightName = flightName;
		this.sourceCity = sourceCity;
		this.destinationCity = destinationCity;
		this.flightDate = flightDate;
		this.seats = seats;
		this.price = price;
		this.userID = userID;
		this.createTimestamp = createTimestamp;
	}

	public int getFlightID() {
		return flightID;
	}

	public void setFlightID(int flightID) {
		this.flightID = flightID;
	}

	public String getFlightName() {
		return flightName;
	}

	public void setFlightName(String flightName) {
		this.flightName = flightName;
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

	public int getSeats() {
		return seats;
	}

	public void setSeats(int seats) {
		this.seats = seats;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	public String getUserID() {
		return userID;
	}

	public void setUserID(String userID) {
		this.userID = userID;
	}

	public Timestamp getCreateTimestamp() {
		return createTimestamp;
	}

	public void setCreateTimestamp(Timestamp createTimestamp) {
		this.createTimestamp = createTimestamp;
	}

	public Date getFlightDate() {
		return flightDate;
	}

	public void setFlightDate(Date flightDate) {
		this.flightDate = flightDate;
	}
	
}
