package com.twu.biblioteca;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Created by gdias on 7/31/15.
 */
public class BookTest {
    @Test
    public void showDetails_ShouldReturnBookNameAuthorAndYear() throws Exception {
        String expected = "Harry Potter - J. K. Rowling - 1997";
        assertEquals(expected, new Book("Harry Potter", "J. K. Rowling", 1997).showDetails());
    }
}
