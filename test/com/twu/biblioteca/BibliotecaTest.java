package com.twu.biblioteca;


import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class BibliotecaTest {

    @Test
    public void welcomeUser_ShouldReturnDefaultWelcomeMessage_WhenNoMessageIsGiven() {
        Biblioteca biblioteca = new Biblioteca();
        assertEquals("Welcome to Biblioteca", biblioteca.welcomeUser());
    }

    @Test
    public void welcomeUser_ShouldReturnGivenMessage() throws Exception {
        Biblioteca biblioteca = new Biblioteca("Given Message");
        assertEquals("Given Message", biblioteca.welcomeUser());
    }
}
