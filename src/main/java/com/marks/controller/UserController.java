package com.marks.controller;

import com.marks.entity.User;
import com.marks.model.SignInModel;
import com.marks.service.UserService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@CrossOrigin(origins = "*")
@RestController
@RequestMapping("/api")
public class UserController {
	
	Logger logger = LoggerFactory.getLogger(UserController.class);
	
	@Autowired
	UserService userService;
	
	@PostMapping(value = "/login")
	public ResponseEntity<User> signId(@RequestBody SignInModel sModel) {
		System.out.println("==========login===========>");
		logger.info("Usercontroller: login API triggered - username: {}",sModel.getUsername());
		return ResponseEntity.ok(userService.signIn(sModel));
	}
}
