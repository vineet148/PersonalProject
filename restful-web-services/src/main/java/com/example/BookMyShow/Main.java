package com.example.BookMyShow;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

import com.example.BookMyShow.DataType.Address;
import com.example.BookMyShow.Enums.Genre;
import com.example.BookMyShow.Enums.Language;
import com.example.BookMyShow.Enums.SeatType;
import com.example.BookMyShow.Movies.Cinema;
import com.example.BookMyShow.Movies.CinemaHall;
import com.example.BookMyShow.Movies.CinemaHallSeat;
import com.example.BookMyShow.Movies.City;
import com.example.BookMyShow.Movies.Movie;
import com.example.BookMyShow.Movies.Show;
import com.example.BookMyShow.Search.Catalog;
import com.example.BookMyShow.Search.Search;
import com.example.BookMyShow.Users.Admin;
import com.example.BookMyShow.Users.Person;
import com.example.BookMyShow.api.BookingController;
import com.example.BookMyShow.api.MovieController;
import com.example.BookMyShow.api.UserController;
import com.example.BookMyShow.util.UserLevelAdminActivities;

public class Main {

	public static void main(String args[]) throws IOException {

		UserController userController = new UserController();
		Person user1 = userController.createUser("vineet", new Address(1, "one", "Gaya", "Bihar", "India"),
				"vinee148@mail.com", "923345");
		Person admin1 = userController.createAdminUsers("vineet", new Address(1, "one", "Gaya", "Bihar", "India"),
				"vinee148@mail.com", "923345");

		MovieController movieController = new MovieController();
		movieController.addMovie("Terminator", "Machines", 120, Language.ENG, "22-10-2010", "USA", Genre.ACTION,
				admin1);
		movieController.addMovie("Terminator2", "Machines", 120, Language.ENG, "22-10-2012", "USA", Genre.ACTION,
				admin1);
		movieController.addMovie("Terminator3", "Machines", 120, Language.ENG, "22-10-2014", "USA", Genre.ACTION,
				admin1);
		movieController.addMovie("Terminator4", "Machines", 120, Language.ENG, "22-10-2016", "USA", Genre.ACTION,
				admin1);

		List<Movie> list = movieController.getAllMovies();
		/*
		 * for (Movie m : list) { System.out.println(m.getTitle()); }
		 */
		CinemaHallSeat cinemaHallSeat1 = new CinemaHallSeat(1, 1, SeatType.REGULAR);
		CinemaHallSeat cinemaHallSeat2 = new CinemaHallSeat(1, 2, SeatType.REGULAR);
		CinemaHallSeat cinemaHallSeat3 = new CinemaHallSeat(1, 3, SeatType.REGULAR);
		CinemaHallSeat cinemaHallSeat4 = new CinemaHallSeat(2, 1, SeatType.PREMIUM);
		List<CinemaHallSeat> listCinemaHallSeat = new ArrayList<>();
		listCinemaHallSeat.add(cinemaHallSeat1);
		listCinemaHallSeat.add(cinemaHallSeat2);
		listCinemaHallSeat.add(cinemaHallSeat3);
		listCinemaHallSeat.add(cinemaHallSeat4);

		CinemaHall lobby1 = new CinemaHall("Lobby1", listCinemaHallSeat.size(), listCinemaHallSeat);
		CinemaHall lobby2 = new CinemaHall("Lobby2", listCinemaHallSeat.size(), listCinemaHallSeat);

		List<CinemaHall> listCinemaHall = new ArrayList<>();
		listCinemaHall.add(lobby1);
		listCinemaHall.add(lobby2);

		Cinema cinema1 = new Cinema("Anand", 8, new Address(1, "park street", "Gaya", "Bihar", "India"),
				listCinemaHall);

		Cinema cinema2 = new Cinema("APR", 8, new Address(1, "lane street", "Patna", "Bihar", "India"), listCinemaHall);

		List<Cinema> listOfCinema = new ArrayList<>();

		City gaya = new City("gaya", "Bihar", "India", listOfCinema);
		City patna = new City("patna", "Bihar", "India", listOfCinema);

		cinema1.setCity(gaya);
		cinema2.setCity(patna);

		// Set cinema for cinema hall
		lobby1.setCinema(cinema1);
		lobby2.setCinema(cinema2);

		System.out.println("add city");
		movieController.addCity(gaya);
		movieController.addCity(patna);

		Show show1 = new Show("22-10-2022", "9:30", "12:00", movieController.searchByTitle("Terminator").get(0),
				lobby1);
		Show show2 = new Show("22-11-2022", "9:30", "12:00", movieController.searchByTitle("Terminator2").get(0),
				lobby2);
		Show show3 = new Show("23-11-2022", "13:30", "15:00", movieController.searchByTitle("Terminator3").get(0),
				lobby1);

		movieController.addShow(show1);
		movieController.addShow(show2);
		movieController.addShow(show3);
		List<Show> listOfShows = new ArrayList<>();
		listOfShows.add(show1);
		listOfShows.add(show2);
		listOfShows.add(show3);

		List<Movie> list2 = movieController.searchByTitle("Terminator");
		list2.get(0).setMovieShows(listOfShows);
		List<Movie> list3 = movieController.searchByTitle("Terminator2");
		list3.get(0).setMovieShows(listOfShows);
		List<Movie> list4 = movieController.searchByTitle("Terminator3");
		list4.get(0).setMovieShows(listOfShows);
		List<Movie> list5 = movieController.searchByTitle("Terminator4");
		list5.get(0).setMovieShows(listOfShows);

		lobby1.setListOfShows(listOfShows);
		lobby2.setListOfShows(listOfShows);

		System.out.println("Search by Title");
		List<Movie> moviesByTitleList = movieController.searchByTitle("Terminator4   j");
		if (!moviesByTitleList.isEmpty()) {
			Movie movie = moviesByTitleList.get(0);
			System.out.println("please book ticket for" + movie.getTitle());
			List<Show> listShow = movie.getMovieShows();
			Show show = listShow.get(0);
			System.out.println("at time" + show.getStartTime());
			System.out.println("int the  " + show.getCinemaHall().getName() + " of the Cinema "
					+ show.getCinemaHall().getCinema().getName() + " in city "
					+ show.getCinemaHall().getCinema().getCity().getName());
			System.out.println("Total number of seats available " + show.getCinemaHall().getTotalSeats());
			int numberOfSeatsToBook = 1;
			System.out.println("book " + numberOfSeatsToBook + " seat");
			BookingController bookingController = new BookingController();
			bookingController.bookTicket(movie, show, numberOfSeatsToBook);

		}
	}

}
