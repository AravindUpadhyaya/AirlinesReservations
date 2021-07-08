package com.hexaware.airlinesreservations.Airlinesreservations.Service;

import java.util.Date;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Example;
import org.springframework.data.domain.ExampleMatcher;
import org.springframework.data.domain.ExampleMatcher.GenericPropertyMatcher;
import org.springframework.data.domain.ExampleMatcher.StringMatcher;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.QueryByExampleExecutor;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.RequestParam;

import com.hexaware.airlinesreservations.Airlinesreservations.Repositories.AirlinesUserRepository;
import com.hexaware.airlinesreservations.Airlinesreservations.exception.UserException;
import com.hexaware.airlinesreservations.Airlinesreservations.models.AirlinesUser;

@Component
public class AirlinesUserService {

	@Autowired
	private AirlinesUserRepository userRepo;
	
	public List<AirlinesUser> findAllUsers() {
		return userRepo.findAll();
	}
	
	public void saveUser(AirlinesUser user) {
		userRepo.save(user);
	}
	
	public void updateUser(AirlinesUser user) {
		if (userRepo.existsById(user.getId())) {
			userRepo.saveAndFlush(user);
		}
	}
	
	public void deleteUser(AirlinesUser user) {
		if (userRepo.existsById(user.getId())) {
			userRepo.delete(user);
		}
	}
	
	public ResponseEntity<Object> validateUser(String userName) throws UserException {
		AirlinesUser user = new AirlinesUser();
		user.setUserName(userName);
		
		ExampleMatcher matcher = ExampleMatcher.matching()
				.withMatcher(userName, GenericPropertyMatcher.of(StringMatcher.EXACT));
		
		Example<AirlinesUser> example = Example.of(user, matcher);
		
		if (!userRepo.exists(example)) {
			throw new UserException(new Date(), "Invalid User Name" , "Invalid User Name");
		}
		
		return ResponseEntity.ok(user);
	}
}
