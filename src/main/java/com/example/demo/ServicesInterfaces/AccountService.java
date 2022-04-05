package com.example.demo.ServicesInterfaces;

import com.example.demo.Models.Admin;
import com.example.demo.Models.Role;

public interface AccountService {
	public Admin saveAdmin(Admin admin);

	public Role saveRole(Role role);

	public void addRoleToAdmin(String login, String roleName);

}
