package com.hexaware.airlinesreservations.Airlinesreservations.models;

import java.sql.Timestamp;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

@Entity
@Table (name = "AirlinesUser")
public class AirlinesUser {

	@Id
	@SequenceGenerator(name = "AirlinesUser_SEQ", sequenceName = "AirlinesUser_SEQ", allocationSize=1)
	@GeneratedValue(strategy = GenerationType.AUTO, generator = "AirlinesUser_SEQ" )
	@Column(name = "ID")
	private int id;
	
	@Column(name = "user_name")
	private String userName;
	
	@Column(name = "password")
	private String password;
	
	@Column(name = "user_email")
	private String email;

	@Column(name = "create_tsp")
	private Timestamp timestamp;
	
	@Column(name = "user_role")
	private String permission;
	
	public AirlinesUser() {
	}
	
	public AirlinesUser(int id, String userName, String password, String email) {
		super();
		this.id = id;
		this.userName = userName;
		this.password = password;
		this.email = email;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public Timestamp getTimestamp() {
		return timestamp;
	}

	public void setTimestamp(Timestamp timestamp) {
		this.timestamp = timestamp;
	}

	public String getPermission() {
		return permission;
	}

	public void setPermission(String permission) {
		this.permission = permission;
	}
	
}
