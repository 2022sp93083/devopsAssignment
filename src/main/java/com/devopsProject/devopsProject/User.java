package com.devopsProject.devopsProject;

import lombok.Builder;

@Builder(toBuilder = true)
public class User {
		private String name;
		private String email;


	public void setName(String name) {
		this.name = name;
	}

	public void setEmail(String email) {
		this.email = email;
	}


	public String getName() {
		return name;
	}

	public String getEmail() {
		return email;
	}
}
