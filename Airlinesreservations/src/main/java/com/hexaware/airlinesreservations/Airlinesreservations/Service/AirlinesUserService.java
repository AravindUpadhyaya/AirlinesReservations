package com.hexaware.airlinesreservations.Airlinesreservations.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.hexaware.airlinesreservations.Airlinesreservations.Repositories.AirlinesUserRepository;
import com.hexaware.airlinesreservations.Airlinesreservations.models.AirlinesUser;

@Component
public class AirlinesUserService {

	@Autowired
	private AirlinesUserRepository airlinesRepo;
	
	public List<AirlinesUser> findAllUsers() {
		return airlinesRepo.findAll();
	}
	
	public void saveUser(AirlinesUser user) {
		airlinesRepo.save(user);
	}
	
	public void updateUser(AirlinesUser user) {
		if (airlinesRepo.existsById(user.getId())) {
			airlinesRepo.saveAndFlush(user);
		}
	}
	
	public void deleteUser(AirlinesUser user) {
		if (airlinesRepo.existsById(user.getId())) {
			airlinesRepo.delete(user);
		}
	}
}
