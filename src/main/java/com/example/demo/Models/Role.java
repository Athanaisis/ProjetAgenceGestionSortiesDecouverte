package com.example.demo.Models;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Role {

	@Id
	private String rolename;

	public String getRolename() {
		return rolename;
	}

	public void setRolename(String role_name) {
		this.rolename = role_name;
	}

	public Role() {
		super();
	}

	public Role(String role_name) {
		super();
		this.rolename = role_name;
	}

}
