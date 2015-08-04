package com.twu.biblioteca.resources;

import com.twu.biblioteca.resources.Resource;

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

    @Override
    public String showDetails() {
        return String.format("%s - %s - %d - %d", name, director, year, rating);
    }
}
