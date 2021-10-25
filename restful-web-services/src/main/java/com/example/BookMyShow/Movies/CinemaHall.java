package com.example.BookMyShow.Movies;

import java.util.List;

public class CinemaHall {

	String name;
	int totalSeats;

	Cinema cinema;
	List<CinemaHallSeat> listOfCinemaSeats;
	List<Show> listOfShows;

	public CinemaHall(String name, int totalSeats, List<CinemaHallSeat> listOfCinemaSeats) {
		super();
		this.name = name;
		this.totalSeats = totalSeats;
		this.listOfCinemaSeats = listOfCinemaSeats;
	}

	public Cinema getCinema() {
		return cinema;
	}

	public void setCinema(Cinema cinema) {
		this.cinema = cinema;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getTotalSeats() {
		return totalSeats;
	}

	public void setTotalSeats(int totalSeats) {
		this.totalSeats = totalSeats;
	}

	public List<CinemaHallSeat> getListOfCinemaSeats() {
		return listOfCinemaSeats;
	}

	public void setListOfCinemaSeats(List<CinemaHallSeat> listOfCinemaSeats) {
		this.listOfCinemaSeats = listOfCinemaSeats;
	}

	public List<Show> getListOfShows() {
		return listOfShows;
	}

	public void setListOfShows(List<Show> listOfShows) {
		this.listOfShows = listOfShows;
	}

	
}
