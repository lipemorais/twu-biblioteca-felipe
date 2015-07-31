package com.twu.biblioteca;

/**
 * Created by fmorais on 7/30/15.
 */
public class Book {
    public String name;
    public String author;
    public int year;

    public Book(String name, String author, int year) {
        this.name = name;
        this.author = author;
        this.year = year;
    }

    public String showDetails() {
        String separator = " - ";
        return name + separator + author + separator + Integer.toString(year);
    }
}
