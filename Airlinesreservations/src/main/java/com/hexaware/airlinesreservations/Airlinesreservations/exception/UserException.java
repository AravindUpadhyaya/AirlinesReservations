package com.hexaware.airlinesreservations.Airlinesreservations.exception;

import java.util.Date;

public class UserException extends ExceptionFormat{

	public UserException(Date timestmap, String exceptionMessage, String description) {
		super(timestmap, exceptionMessage, description);
	}

}
