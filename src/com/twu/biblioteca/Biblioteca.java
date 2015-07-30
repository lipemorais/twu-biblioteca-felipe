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
    }

    public Biblioteca(String welcomeMessage) {

        this.welcomeMessage = welcomeMessage;
    }

    public String welcomeUser() {
        return welcomeMessage;
    }

    public List<Book> listBooks() {
        List<Book> bookList = new ArrayList<Book>();
        Book book = new Book("Harry Potter");
        bookList.add(book);
        return bookList;
    }
}
