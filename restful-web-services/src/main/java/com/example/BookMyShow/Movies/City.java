package com.example.BookMyShow.Movies;

import java.util.List;

public class City {

	private String name;
	private String state;
	private String Country;

	List<Cinema> listOfCinema;

	public City(String name, String state, String country, List<Cinema> listOfCinema) {
		super();
		this.name = name;
		this.state = state;
		Country = country;
		this.listOfCinema = listOfCinema;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}

	public String getCountry() {
		return Country;
	}

	public void setCountry(String country) {
		Country = country;
	}

	public List<Cinema> getListOfCinema() {
		return listOfCinema;
	}

	public void setListOfCinema(List<Cinema> listOfCinema) {
		this.listOfCinema = listOfCinema;
	}

}
