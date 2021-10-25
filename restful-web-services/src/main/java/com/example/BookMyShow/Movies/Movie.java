package com.example.BookMyShow.Movies;

import java.util.List;

import com.example.BookMyShow.Enums.Genre;
import com.example.BookMyShow.Enums.Language;
import com.example.BookMyShow.Users.Admin;
import com.example.BookMyShow.Users.Person;

public class Movie {

	private String title;
	private String description;
	private int durationInMins;
	private Language language;
	private String releaseDate;
	private String country;
	private Genre genre;
	private Person movieAddedBy;

	private List<Show> movieShows;

	public Movie(String title, String description, int durationInMins, Language language, String releaseDate,
			String country, Genre genre, Person admin1) {
		super();
		this.title = title;
		this.description = description;
		this.durationInMins = durationInMins;
		this.language = language;
		this.releaseDate = releaseDate;
		this.country = country;
		this.genre = genre;
		this.movieAddedBy=admin1;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public int getDurationInMins() {
		return durationInMins;
	}

	public void setDurationInMins(int durationInMins) {
		this.durationInMins = durationInMins;
	}

	public Language getLanguage() {
		return language;
	}

	public void setLanguage(Language language) {
		this.language = language;
	}

	public String getReleaseDate() {
		return releaseDate;
	}

	public void setReleaseDate(String releaseDate) {
		this.releaseDate = releaseDate;
	}

	public String getCountry() {
		return country;
	}

	public void setCountry(String country) {
		this.country = country;
	}

	public Genre getGenre() {
		return genre;
	}

	public void setGenre(Genre genre) {
		this.genre = genre;
	}

	public Person getMovieAddedBy() {
		return movieAddedBy;
	}

	public void setMovieAddedBy(Admin movieAddedBy) {
		this.movieAddedBy = movieAddedBy;
	}

	public List<Show> getMovieShows() {
		return movieShows;
	}

	public void setMovieShows(List<Show> movieShows) {
		this.movieShows = movieShows;
	}

}
