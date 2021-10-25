package com.example.BookMyShow.Movies;

import java.util.Date;

public class Show {

	String createdOn;
	String startTime;
	String endTime;
	Movie movie;
	CinemaHall cinemaHall;

	public Show(String createdOn, String startTime, String endTime, Movie movie, CinemaHall cinemaHall) {
		super();
		this.createdOn = createdOn;
		this.startTime = startTime;
		this.endTime = endTime;
		this.movie = movie;
		this.cinemaHall = cinemaHall;
	}

	public CinemaHall getCinemaHall() {
		return cinemaHall;
	}

	public void setCinemaHall(CinemaHall cinemaHall) {
		this.cinemaHall = cinemaHall;
	}

	public String getCreatedOn() {
		return createdOn;
	}

	public void setCreatedOn(String createdOn) {
		this.createdOn = createdOn;
	}

	public String getStartTime() {
		return startTime;
	}

	public void setStartTime(String startTime) {
		this.startTime = startTime;
	}

	public String getEndTime() {
		return endTime;
	}

	public void setEndTime(String endTime) {
		this.endTime = endTime;
	}

	public Movie getMovie() {
		return movie;
	}

	public void setMovie(Movie movie) {
		this.movie = movie;
	}

}
