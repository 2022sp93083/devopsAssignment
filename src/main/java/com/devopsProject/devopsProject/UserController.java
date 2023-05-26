package com.devopsProject.devopsProject;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/users")
public class UserController {
	@GetMapping("")
	public ResponseEntity<User> getUserDetails() {
		return new ResponseEntity<>(User.builder().email("arif@gmail.com").name("arif").build(), HttpStatus.OK);
	}
}
