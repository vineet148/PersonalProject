package com.example.BookMyShow.Users;

import com.example.BookMyShow.DataType.Address;
import com.example.BookMyShow.Movies.Cinema;
import com.example.BookMyShow.Movies.Movie;
import com.example.BookMyShow.Movies.Show;
import com.example.BookMyShow.Search.DataStorage;

public class Admin extends Person {

	
	DataStorage dataStorage;
	public Admin(String name, Address address, String email, String phone) {
		super(name, address, email, phone);
		// TODO Auto-generated constructor stub
		dataStorage=new DataStorage();
	}

	public void addCity(String city) {

	}

	public void addCinema(Cinema cinema) {

	}

	public void addMovie(Movie movie) {

		dataStorage.addMovie(movie);
		
	} 

	public void addShow(Show show) {

	}
	

}