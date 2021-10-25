package com.example.BookMyShow.Services;

import java.util.HashMap;
import java.util.Map;

import com.example.BookMyShow.DataType.Address;
import com.example.BookMyShow.Users.Customer;
import com.example.BookMyShow.Users.Person;

public class UserService {

	Map<String, Person> userMap;

	Map<String, Person> adminMap;

	public UserService() {
		userMap = new HashMap<>();
		adminMap = new HashMap<>();
	}

	public Person createUser(String name, Address address, String email, String phone) {
		// TODO Auto-generated method stub

		Person user = new Customer(name, address, email, phone);
		userMap.put(name, user);

		return user;
	}

	public Person createAdmin(String name, Address address, String email, String phone) {
		// TODO Auto-generated method stub

		Person admin = new Customer(name, address, email, phone);
		adminMap.put(name, admin);
		return admin;
	}

}
