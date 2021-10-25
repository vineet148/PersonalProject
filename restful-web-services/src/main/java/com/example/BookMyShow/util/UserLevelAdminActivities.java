package com.example.BookMyShow.util;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

import com.example.BookMyShow.DataType.Address;
import com.example.BookMyShow.Users.Admin;
import com.example.BookMyShow.Users.Person;

public class UserLevelAdminActivities {

	public Admin createUser() throws IOException {
		// TODO Auto-generated method stub
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));		
		System.out.println("enter user name");
		String name=reader.readLine();
		System.out.println("enter email");
		String email=reader.readLine();
		System.out.println("enter phone");
		String phone=reader.readLine();
		System.out.println("enter housenumber");
		int houseNum=Integer.parseInt(reader.readLine());
		System.out.println("enter city");
		String city=reader.readLine();
		System.out.println("enter state");
		String state=reader.readLine();
		System.out.println("enter country");
		String country=reader.readLine();
		Address address=new Address(houseNum, phone, city, state, country);
	
		Admin admin=new Admin(name, address, email, phone);
		return admin;
	}

	
	
}
