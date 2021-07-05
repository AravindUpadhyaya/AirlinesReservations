package com.hexaware.airlinesreservations.Airlinesreservations.models;

import java.sql.Date;
import java.sql.Timestamp;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "Reservation")
public class Reservation {

	@Id
	@GeneratedValue
	@Column(name = "reservation_id")
	private int reservationID;

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

	public Reservation(int reservationID, String passengerName, String sourceCity, String destinationCity, Date travelDate,
			String reservationStatus, Timestamp createTimestamp) {
		super();
		this.reservationID = reservationID;
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

}
