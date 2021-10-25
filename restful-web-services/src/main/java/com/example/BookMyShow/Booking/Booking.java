package com.example.BookMyShow.Booking;

import java.util.Date;
import java.util.List;

import com.example.BookMyShow.Enums.BookingStatus;
import com.example.BookMyShow.Movies.Show;
import com.example.BookMyShow.Movies.ShowSeat;
import com.example.BookMyShow.Payment.Payment;
import com.example.BookMyShow.Users.Person;

public class Booking {

	Double bookingId;
	int numOfSeats;
	String bookedOn;
	BookingStatus bookingStatus;
	Person user;
	

	public Double getBookingId() {
		return bookingId;
	}

	public void setBookingId(Double bookingId) {
		this.bookingId = bookingId;
	}

	public int getNumOfSeats() {
		return numOfSeats;
	}

	public void setNumOfSeats(int numOfSeats) {
		this.numOfSeats = numOfSeats;
	}

	public String getBookedOn() {
		return bookedOn;
	}

	public void setBookedOn(String bookedOn) {
		this.bookedOn = bookedOn;
	}

	public BookingStatus getBookingStatus() {
		return bookingStatus;
	}

	public void setBookingStatus(BookingStatus bookingStatus) {
		this.bookingStatus = bookingStatus;
	}

	public Person getUser() {
		return user;
	}

	public void setUser(Person user) {
		this.user = user;
	}

	public Payment getPayment() {
		return payment;
	}

	public void setPayment(Payment payment) {
		this.payment = payment;
	}

	public Show getShow() {
		return show;
	}

	public void setShow(Show show) {
		this.show = show;
	}

	Payment payment;
	private Show show;
	private List<ShowSeat> listofShowSeats;

}
