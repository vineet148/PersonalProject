package com.example.BookMyShow.Services;

import java.util.Random;

import com.example.BookMyShow.Booking.Booking;
import com.example.BookMyShow.Enums.BookingStatus;
import com.example.BookMyShow.Movies.Movie;
import com.example.BookMyShow.Movies.Show;
import com.example.BookMyShow.Users.Person;

public class BookingService {

	public Booking createBooking(Movie movie, Show show, int numberSeats)
	{
		Booking booking=new Booking();
		
		Double id=Math.random();
		booking.setBookingId(id);
		booking.setBookedOn("22-10-2022");
		booking.setBookingStatus(BookingStatus.REQUESTED);
		booking.setNumOfSeats(numberSeats);
		booking.setPayment(null);
		booking.setShow(show);
		booking.setUser(null);

		//Send for booking
		return booking;
		
	}
	
}
