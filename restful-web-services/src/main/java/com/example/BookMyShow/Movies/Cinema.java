package com.example.BookMyShow.Movies;

import java.util.List;

import com.example.BookMyShow.DataType.Address;

public class Cinema {

	String name;
	int totalCinemaHalls;
	Address addressofCinema;
	City city;
	List<CinemaHall> listOfCinemaHall;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getTotalCinemaHalls() {
		return totalCinemaHalls;
	}

	public void setTotalCinemaHalls(int totalCinemaHalls) {
		this.totalCinemaHalls = totalCinemaHalls;
	}

	public Address getAddressofCinema() {
		return addressofCinema;
	}

	public void setAddressofCinema(Address addressofCinema) {
		this.addressofCinema = addressofCinema;
	}

	public City getCity() {
		return city;
	}

	public void setCity(City city) {
		this.city = city;
	}

	public List<CinemaHall> getListOfCinemaHall() {
		return listOfCinemaHall;
	}

	public void setListOfCinemaHall(List<CinemaHall> listOfCinemaHall) {
		this.listOfCinemaHall = listOfCinemaHall;
	}

	public Cinema(String name, int totalCinemaHalls, Address addressofCinema, List<CinemaHall> listOfCinemaHall) {
		super();
		this.name = name;
		this.totalCinemaHalls = totalCinemaHalls;
		this.addressofCinema = addressofCinema;
		this.listOfCinemaHall = listOfCinemaHall;
	}

}
