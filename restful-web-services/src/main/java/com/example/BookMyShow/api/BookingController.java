package com.example.BookMyShow.api;

import com.example.BookMyShow.Booking.Booking;
import com.example.BookMyShow.Movies.Movie;
import com.example.BookMyShow.Movies.Show;
import com.example.BookMyShow.Services.BookingService;

public class BookingController {

	BookingService bookingService;

	public BookingController() {
		bookingService = new BookingService();
	}

	public void bookTicket(Movie movie, Show show, int numberSeats) {

		Booking booking = bookingService.createBooking(movie, show, numberSeats);
		;
		System.out.println("Booking status" + booking.getBookingStatus());
	}

}
