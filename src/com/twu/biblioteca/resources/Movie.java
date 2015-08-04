package com.twu.biblioteca.resources;

import com.twu.biblioteca.resources.Resource;

import java.util.Objects;

/**
 * Created by fmorais on 8/4/15.
 */
public class Movie extends Resource {
    private String director;
    int rating;

    public Movie(String name, String director, int year, int rating) {
        super(name, year);
        this.director = director;
        this.rating = rating;
    }
// TODO Test Equals
    @Override
    public boolean equals(Object other) {
        if(other instanceof Movie) {
            Movie otherMovie = (Movie) other;
            return this.showDetails().equals(otherMovie.showDetails()) ? true : false;
        }
        return false;
    }

    @Override
    public String showDetails() {
        return String.format("%s - %s - %d - %d", name, director, year, rating);
    }
}
