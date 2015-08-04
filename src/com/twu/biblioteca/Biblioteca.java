package com.twu.biblioteca;

import com.twu.biblioteca.resources.Book;
import com.twu.biblioteca.resources.Movie;
import com.twu.biblioteca.resources.Resource;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by fmorais on 7/30/15.
 */
public class Biblioteca {
    String welcomeMessage = "Welcome to Biblioteca";
    List<Book> books = new ArrayList<Book>();
    List<Movie> movies = new ArrayList<Movie>();

    public Biblioteca() {
        initialiazeBookList();
        initialiazeMovieList();
    }

    public Biblioteca(String welcomeMessage) {
        this.welcomeMessage = welcomeMessage;
        initialiazeBookList();
    }

    public String welcomeUser() {
        return welcomeMessage;
    }

    public List<Book> listBooks() {
        List<Book> availableBooks = new ArrayList<Book>();

        for(Book book : books) {
            if(!book.isChecked) {
                availableBooks.add(book);
            }
        }

        return availableBooks;
    }

    public List<Movie> listMovies() {
        return movies;
    }

    public List<Resource> listResources() {
        ArrayList<Resource> resourcesList = new ArrayList<Resource>();
        resourcesList.addAll(listBooks());
        resourcesList.addAll(listMovies());
        return resourcesList;
    }

    private void initialiazeBookList() {
        books.add(new Book("Harry Potter", "J. K. Rowling", 1997));
        books.add(new Book("The Little Prince", "Antoine de Saint-Exupéry", 1943));
        books.add(new Book("Freakonomics", "Stephen Dubner", 2005));
    }

    private void initialiazeMovieList() {
        movies.add(new Movie("The Lord of The Rings", "Peter Jackson", 2001, 10));
        movies.add(new Movie("Toy Story", "John Lasseter", 1995, 10));
    }

    public boolean checkoutResource(String bookName) {
        for(Book book : books) {
            if(book.name.equals(bookName)) {
                return book.checkoutResource();
            }
        }
        return false;
    }

    public boolean returnResource(String bookName) {
        for(Book book : books) {
            if(book.name.equals(bookName)) {
                return book.returnResource();
            }
        }
        return false;
    }
}
