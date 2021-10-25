package com.example.BookMyShow.api;

import java.util.List;

import com.example.BookMyShow.Enums.Genre;
import com.example.BookMyShow.Enums.Language;
import com.example.BookMyShow.Movies.City;
import com.example.BookMyShow.Movies.Movie;
import com.example.BookMyShow.Movies.Show;
import com.example.BookMyShow.Services.MovieService;
import com.example.BookMyShow.Users.Person;

public class MovieController {

	MovieService movieService;

	public MovieController() {
		movieService = new MovieService();
	}

	public void addMovie(String title, String description, int duration, Language language, String releaseDate,
			String country, Genre genre, Person admin1) {

		Movie movie=movieService.addMovie(title,description,duration,language,releaseDate,country,genre,admin1);
		System.out.println("movie "+movie.getTitle()+"  added");
	}
    public List<Movie> getAllMovies()
    {
    
    	return movieService.getAllMovies();
    	
    }

	public List<Movie> searchByTitle(String title) {
		// TODO Auto-generated method stub
	
		return movieService.searchByTitle(title);
		
	}
	
	public void addCity(City city)
	{
		City c=movieService.addCity(city);
	   System.out.println(c.getName()+" has been added");
	}
	
	public void addShow(Show show)
	{
		movieService.addShow(show);
		
	}
   
	public List<Show> getShowsMovie(Movie movie)
	{
		
		return movieService.getShowsForMovie(movie);
	}
	
}
