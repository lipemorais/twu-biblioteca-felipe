package com.twu.biblioteca;

/**
 * Created by fmorais on 8/4/15.
 */
public class Movie {
    private String name, director;
    int year, rating;

    public Movie(String name, String director, int year, int rating) {
        this.name = name;
        this.director = director;
        this.year = year;
        this.rating = rating;
    }

    public String showDetails() {
        return String.format("%s - %s - %d - %d", name, director, year, rating);
    }
}
