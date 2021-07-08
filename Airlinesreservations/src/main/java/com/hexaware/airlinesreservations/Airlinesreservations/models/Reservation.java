package com.hexaware.airlinesreservations.Airlinesreservations.models;

import java.sql.Date;
import java.sql.Timestamp;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

@Entity
@Table(name = "Reservation")
public class Reservation {

	@Id
	@SequenceGenerator(name = "Reservation_SEQ", sequenceName = "Reservation_SEQ", allocationSize=1)
	@GeneratedValue(strategy = GenerationType.AUTO, generator = "Reservation_SEQ" )
	@Column(name = "reservation_id")
	private int reservationID;

	@OneToOne(targetEntity = Flights.class)
	private int flightID;
	
	@Column(name = "passenger_name")
	private String passengerName;

	@Column(name = "source_city")
	private String sourceCity;

	@Column(name = "destination_city")
	private String destinationCity;

	@Column(name = "travel_date")
	private Date travelDate;

	@Column(name = "reservation_status")
	private String reservationStatus;

	@Column(name = "create_timestamp")
	private Timestamp createTimestamp;

	public Reservation() {
	}

	public Reservation(int reservationID, int flightID, String passengerName, String sourceCity, String destinationCity, Date travelDate,
			String reservationStatus, Timestamp createTimestamp) {
		super();
		this.reservationID = reservationID;
		this.flightID = flightID;
		this.passengerName = passengerName;
		this.sourceCity = sourceCity;
		this.destinationCity = destinationCity;
		this.travelDate = travelDate;
		this.reservationStatus = reservationStatus;
		this.createTimestamp = createTimestamp;
	}

	public String getPassengerName() {
		return passengerName;
	}

	public void setPassengerName(String passengerName) {
		this.passengerName = passengerName;
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

	public Timestamp getCreateTimestamp() {
		return createTimestamp;
	}

	public void setCreateTimestamp(Timestamp createTimestamp) {
		this.createTimestamp = createTimestamp;
	}

	public int getReservationID() {
		return reservationID;
	}

	public void setReservationID(int reservationID) {
		this.reservationID = reservationID;
	}

	public int getFlightID() {
		return flightID;
	}

	public void setFlightID(int flightID) {
		this.flightID = flightID;
	}

	public String getReservationStatus() {
		return reservationStatus;
	}

	public void setReservationStatus(String reservationStatus) {
		this.reservationStatus = reservationStatus;
	}

}
