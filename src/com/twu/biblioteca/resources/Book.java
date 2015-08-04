package com.twu.biblioteca.resources;

/**
 * Created by fmorais on 7/30/15.
 */
public class Book extends Resource {
    public String author;


    public Book(String name, String author, int year) {
        super(name, year);
        this.author = author;
    }

    @Override
    public String showDetails() {
        String separator = " - ";
        return name + separator + author + separator + Integer.toString(year);
    }

    @Override
    public boolean equals(Object other) {
        if (other instanceof Book) {
            Book otherBook = (Book) other;

            return this.showDetails().equals(otherBook.showDetails());
        }

        return false;
    }

    @Override
    public String toString() {
        return this.name;
    }
}
