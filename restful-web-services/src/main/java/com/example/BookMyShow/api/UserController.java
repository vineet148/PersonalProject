package com.example.BookMyShow.api;

import com.example.BookMyShow.DataType.Address;
import com.example.BookMyShow.Services.UserService;
import com.example.BookMyShow.Users.Person;

public class UserController {

	UserService userService;

	public UserController() {
		super();
		this.userService = new UserService();
	}

	public Person createUser(String name, Address address, String email, String phone) {

		Person user = userService.createUser(name, address, email, phone);
		System.out.println("user " + user.getName() + " created");
		return user;
	}

	public Person createAdminUsers(String name, Address address, String email, String phone) {

		Person admin = userService.createAdmin(name, address, email, phone);
		System.out.println("admin " + admin.getName() + " created");
		return admin;

	}
}
