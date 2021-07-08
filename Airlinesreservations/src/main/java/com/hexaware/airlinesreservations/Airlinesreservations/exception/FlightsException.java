package com.hexaware.airlinesreservations.Airlinesreservations.exception;

import java.util.Date;

public class FlightsException extends ExceptionFormat{

	public FlightsException(Date timestmap, String exceptionMessage, String description) {
		super(timestmap, exceptionMessage, description);
	}

}
