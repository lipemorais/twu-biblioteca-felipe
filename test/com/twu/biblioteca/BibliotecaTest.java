package com.twu.biblioteca;


import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import static junit.framework.TestCase.assertFalse;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class BibliotecaTest {
    Biblioteca biblioteca = new Biblioteca();
    @Test
    public void welcomeUser_ShouldReturnDefaultWelcomeMessage_WhenNoMessageIsGiven() {
        biblioteca = new Biblioteca();
        assertEquals("Welcome to Biblioteca", biblioteca.welcomeUser());
    }

    @Test
    public void welcomeUser_ShouldReturnGivenMessage() throws Exception {
        biblioteca = new Biblioteca("Given Message");
        assertEquals("Given Message", biblioteca.welcomeUser());
    }

    @Test
    public void listBooks_ShouldListAllAvailableBooks() throws Exception {
        biblioteca = new Biblioteca();
        List<Book> expected = new ArrayList<Book>();
        expected.add(new Book("Harry Potter", "J. K. Rowling", 1997));
        expected.add(new Book("The Little Prince", "Antoine de Saint-Exupéry", 1943));
        expected.add(new Book("Freakonomics", "Stephen Dubner", 2005));

        assertEquals(expected, biblioteca.listBooks());

        expected.remove(0);

        biblioteca.checkout("Harry Potter");

        assertEquals(expected, biblioteca.listBooks());
    }

    @Test
    public void checkout_ShouldReturnTrue_WhenTheBookIsAvailable() throws Exception {
        boolean isChecked = biblioteca.checkout("Harry Potter");
        assertTrue(isChecked);
    }

    @Test
    public void checkout_ShouldReturnFalse_WhenTheBookIsNotAvailable() throws Exception {
        boolean isChecked = biblioteca.checkout("The Lord of the Rings");
        assertFalse(isChecked);
    }

    @Test
    public void returnBook_ShouldReturnTrue_WhenTheBookIsNotAvailable() throws Exception {
        biblioteca.checkout("Harry Potter");
        boolean isReturned = biblioteca.returnBook("Harry Potter");
        assertTrue(isReturned);
    }

    @Test
    public void returnBook_ShouldReturnFalse_WhenTheBookIsAvailable() throws Exception {
        boolean isReturned = biblioteca.returnBook("Harry Potter");
        assertFalse(isReturned);
    }
}
