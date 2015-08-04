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
    private String welcomeMessage = "Welcome to Biblioteca";
    private List<Book> books;
    private List<Movie> movies;
    private List<UserAccount> users;

    public Biblioteca() {
        initializeBiblioteca();
    }

    public Biblioteca(String welcomeMessage) {
        this.welcomeMessage = welcomeMessage;
        initializeBiblioteca();
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
        List<Movie> availableMovies = new ArrayList<Movie>();
        for (Movie movie : movies) {
            if (!movie.isChecked) {
                availableMovies.add(movie);
            }
        }
        return availableMovies;
    }

    public List<Resource> listResources() {
        ArrayList<Resource> resourcesList = new ArrayList<Resource>();
        resourcesList.addAll(listBooks());
        resourcesList.addAll(listMovies());
        return resourcesList;
    }

    public boolean checkoutResource(String resourceName) {
        for(Resource resource : listResources()) {
            if(resource.name.equals(resourceName)) {
                return resource.checkoutResource();
            }
        }
        return false;
    }

    public boolean returnResource(String resourceName) {
        List<Resource> allResources = new ArrayList<Resource>();
        allResources.addAll(books);
        allResources.addAll(movies);

        for(Resource resource : allResources) {
            if(resource.name.equals(resourceName)) {
                return resource.returnResource();
            }
        }
        return false;
    }

    public boolean login(String libraryNumber, String password) {
        for(UserAccount user : users) {
            if (user.match(libraryNumber, password)){
                return true;
            }
        }
        return false;
    }

    private void initializeBiblioteca() {
        initialiazeBookList();
        initialiazeMovieList();
        initializeUserList();
    }

    private void initialiazeBookList() {
        books = new ArrayList<Book>();
        books.add(new Book("Harry Potter", "J. K. Rowling", 1997));
        books.add(new Book("The Little Prince", "Antoine de Saint-Exupéry", 1943));
        books.add(new Book("Freakonomics", "Stephen Dubner", 2005));
    }

    private void initialiazeMovieList() {
        movies = new ArrayList<Movie>();
        movies.add(new Movie("The Lord of The Rings", "Peter Jackson", 2001, 10));
        movies.add(new Movie("Toy Story", "John Lasseter", 1995, 10));
    }

    private void initializeUserList() {
        users = new ArrayList<UserAccount>();
        users.add(new UserAccount("333-4444", "123"));
        users.add(new UserAccount("444-5555", "456"));
        users.add(new UserAccount("555-6666", "789"));
    }
}
