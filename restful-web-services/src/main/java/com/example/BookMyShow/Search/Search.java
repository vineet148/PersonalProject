package com.example.BookMyShow.Search;

import java.util.Date;
import java.util.List;

import com.example.BookMyShow.Movies.Movie;

public interface Search {

	List<Movie> searchByTitle(String title);

	/**
	 * Search movice based on Langauge.
	 * @param language
	 * @return
	 */
	List<Movie> searchByLanguage(String language);

	/**
	 * Search movice based on genre.
	 * @param genre
	 * @return
	 */
	List<Movie> searchByGenre(String genre);

	/**
	 * Search movice based on Release Date.
	 * @param releaseDate
	 * @return
	 */
	List<Movie> searchByReleaseDate(Date releaseDate);


	/**
	 * Search movice based on city name.
	 * @param cityName
	 * @return
	 */
	public List<Movie> searchByCity(String cityName);
	
}

