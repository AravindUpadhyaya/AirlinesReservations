package com.hexaware.airlinesreservations.Airlinesreservations.exception;

import java.util.Date;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.context.request.WebRequest;
import org.springframework.web.servlet.mvc.method.annotation.ResponseEntityExceptionHandler;

@ControllerAdvice
@RestController
public class AirlinesReservationException extends ResponseEntityExceptionHandler{
	
	@ExceptionHandler(Exception.class)
	public final ResponseEntity<Object> handleAllException(Exception ex, WebRequest req) throws Exception {
		ExceptionFormat format = new ExceptionFormat(
				new Date(), 
				ex.getMessage(), 
				req.getDescription(false));
		return new ResponseEntity<Object>(format,HttpStatus.INTERNAL_SERVER_ERROR);
	}
	
	@ExceptionHandler(FlightsException.class)
	public final ResponseEntity<Object> handleAllFlightsException(Exception ex, WebRequest req) throws Exception {
		ExceptionFormat format = new ExceptionFormat(
				new Date(), 
				ex.getMessage(), 
				req.getDescription(false));
		return new ResponseEntity<Object>(format,HttpStatus.NOT_FOUND);
	}
	
	@ExceptionHandler(UserException.class)
	public final ResponseEntity<Object> handleAllUserException(Exception ex, WebRequest req) throws Exception {
		ExceptionFormat format = new ExceptionFormat(
				new Date(), 
				ex.getMessage(), 
				req.getDescription(false));
		return new ResponseEntity<Object>(format,HttpStatus.NOT_FOUND);
	}	
}
