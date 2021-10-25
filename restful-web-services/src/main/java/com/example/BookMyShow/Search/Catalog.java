package com.example.BookMyShow.Search;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import com.example.BookMyShow.Movies.Movie;
import com.example.BookMyShow.api.MovieController;

public class Catalog implements Search {

	MovieController movieController;
	
	
	public Catalog() {
		super();
		movieController=new MovieController();
	}

	@Override
	public List<Movie> searchByTitle(String title) {
		// TODO Auto-generated method stub
		return movieController.getAllMovies();
				 		
	}

	@Override
	public List<Movie> searchByLanguage(String language) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Movie> searchByGenre(String genre) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Movie> searchByReleaseDate(Date releaseDate) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Movie> searchByCity(String cityName) {
		// TODO Auto-generated method stub
		return null;
	}

}
