package com.example.BookMyShow.Movies;

import com.example.BookMyShow.Enums.SeatType;

public class CinemaHallSeat {

	int seatRow;
	int seatColumn;
	SeatType seatType;

	public CinemaHallSeat(int seatRow, int seatColumn, SeatType seatType) {
		super();
		this.seatRow = seatRow;
		this.seatColumn = seatColumn;
		this.seatType = seatType;
	}

}
