package com.twu.biblioteca;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by fmorais on 7/30/15.
 */
public class Biblioteca {
    String welcomeMessage = "Welcome to Biblioteca";
    List<Book> books = new ArrayList<Book>();

    public Biblioteca() {
        initialiazeBookList();
    }

    public Biblioteca(String welcomeMessage) {
        this.welcomeMessage = welcomeMessage;
        initialiazeBookList();
    }

    public String welcomeUser() {
        return welcomeMessage;
    }

    public List<Book> listBooks() {
        return books;
    }

    private void initialiazeBookList() {
        Book book = new Book("Harry Potter", "J. K. Rowling", 1997);
        books.add(book);
    }
}
