package com.example.BookMyShow.Search;

import java.util.HashMap;

import com.example.BookMyShow.Movies.Movie;

public class DataStorage {

	HashMap<String, Movie> movHashMap=new HashMap<>();
	
 	public void addMovie(Movie movie)
	{
	
 		movHashMap.put(movie.getTitle(),movie);
	}
	
 	public Movie getMovieByTitle(String title )
 	{
 		return movHashMap.get(title);
 	}
 	
 	
}
