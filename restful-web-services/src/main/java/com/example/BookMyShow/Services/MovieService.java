package com.example.BookMyShow.Services;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.example.BookMyShow.Enums.Genre;
import com.example.BookMyShow.Enums.Language;
import com.example.BookMyShow.Movies.CinemaHall;
import com.example.BookMyShow.Movies.City;
import com.example.BookMyShow.Movies.Movie;
import com.example.BookMyShow.Movies.Show;
import com.example.BookMyShow.Users.Person;

public class MovieService {

	private HashMap<String, Movie> movieHashMap;
	private HashMap<String, City> cityHashMap;
	private HashMap<String, Show> showHashMap;

	public MovieService() {
		movieHashMap = new HashMap<>();
        cityHashMap=new HashMap<>();
        showHashMap=new HashMap<>();
	}

	public Movie addMovie(String title, String description, int duration, Language language, String releaseDate,
			String country, Genre genre, Person admin1) {
		// TODO Auto-generated method stub

		Movie movie = new Movie(title, description, duration, language, releaseDate, country, genre, admin1);
		movieHashMap.put(title, movie);
		return movie;

	}

	public List<Movie> getAllMovies() {
		// TODO Auto-generated method stub
		List<Movie> moviesList = new ArrayList<>();

		for (Movie movie : movieHashMap.values()) {

			moviesList.add(movie);
		}
		return moviesList;

	}

	public List<Movie> searchByTitle(String title) {
		// TODO Auto-generated method stub
		List<Movie> moviesList = new ArrayList<>();

		if (movieHashMap.containsKey(title)) {

			for (Map.Entry<String, Movie> entry : movieHashMap.entrySet()) {
				if (entry.getKey() == title) {

					moviesList.add(entry.getValue());

				}
			}

		}

		return moviesList;
	}

	public City addCity(City city) {
		// TODO Auto-generated method stub
		
		cityHashMap.put(city.getName(), city);
		return cityHashMap.get(city.getName());
	}

	public  Show addShow(Show show) {
		// TODO Auto-generated method stub
		
		showHashMap.put(show.getMovie().getTitle(), show);
		System.out.println("Added show for movie"+show.getMovie().getTitle());
		return showHashMap.get(show.getMovie().getTitle());
	}

	public List<Show> getShowsForMovie(Movie movie) {
		// TODO Auto-generated method stub

		List<Show> showList=new ArrayList<>();
		if (showHashMap.containsKey(movie.getTitle())) {

			for (Map.Entry<String, Show> entry : showHashMap.entrySet()) {
				if (entry.getKey() == movie.getTitle()) {

					showList.add(entry.getValue());

				}
			}

		}

		return showList;
		
		
		
	}

}
