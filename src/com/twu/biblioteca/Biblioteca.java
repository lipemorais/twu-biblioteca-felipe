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
        List<Book> availableBooks = new ArrayList<Book>();

        for(Book book : books) {
            if(!book.isChecked) {
                availableBooks.add(book);
            }
        }

        return availableBooks;
    }

    private void initialiazeBookList() {
        books.add(new Book("Harry Potter", "J. K. Rowling", 1997));
        books.add(new Book("The Little Prince", "Antoine de Saint-Exupéry", 1943));
        books.add(new Book("Freakonomics", "Stephen Dubner", 2005));
    }

    public boolean checkout(String bookName) {
        for(Book book : books) {
            if(book.name.equals(bookName)) {
                return book.checkoutResource();
            }
        }
        return false;
    }

    public boolean returnBook(String bookName) {
        for(Book book : books) {
            if(book.name.equals(bookName)) {
                return book.returnResource();
            }
        }
        return false;
    }
}
