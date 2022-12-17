package com.marks.service;

import com.marks.entity.User;
import com.marks.exception.AppException;
import com.marks.model.SignInModel;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

@Component
public class UserService {
	
	Logger logger = LoggerFactory.getLogger(UserService.class);
	
	public User signIn(SignInModel model) {

		if (model.getUsername().equals("system") && model.getPassword().equals("password")) {
			User user = new User();
			user.setId(1L);
			user.setEmail("system@gmail.com");
			user.setFirstName("System");
			user.setLastName("Admin");

			return user;
		} else {
			throw new AppException("User is not found");
		}


	}
}
