package com.hexaware.airlinesreservations.Airlinesreservations.exception;

import java.util.Date;

public class ExceptionFormat extends Exception{
	private Date timestmap;
	private String exceptionMessage;
	private String description;
	
	public ExceptionFormat(Date timestmap, String exceptionMessage, String description) {
		super();
		this.timestmap = timestmap;
		this.exceptionMessage = exceptionMessage;
		this.description = description;
	}

	public Date getTimestmap() {
		return timestmap;
	}

	public void setTimestmap(Date timestmap) {
		this.timestmap = timestmap;
	}

	public String getExceptionMessage() {
		return exceptionMessage;
	}

	public void setExceptionMessage(String exceptionMessage) {
		this.exceptionMessage = exceptionMessage;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}
}
