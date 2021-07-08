package com.hexaware.airlinesreservations.Airlinesreservations.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.hexaware.airlinesreservations.Airlinesreservations.Service.AirlinesUserService;
import com.hexaware.airlinesreservations.Airlinesreservations.models.AirlinesUser;

@RestController
public class AirlinesUserController {

	@Autowired
	private AirlinesUserService airlinesUserService;  
	
	@GetMapping("/allUsers")
	public List<AirlinesUser> findAllUsers() {
		return airlinesUserService.findAllUsers();
	}
	
	@PostMapping("/createUser")
	public void createUser(@RequestBody AirlinesUser user) {
		airlinesUserService.saveUser(user);
	}
	
	@PutMapping("/updateUser")
	public void updateUser(@RequestBody AirlinesUser user) {
		airlinesUserService.updateUser(user);
	}
	
	@DeleteMapping("/deleteUser")
	public void deleteUser(@RequestBody AirlinesUser user) {
		airlinesUserService.deleteUser(user);
	}
}
