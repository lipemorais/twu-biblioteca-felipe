package com.twu.biblioteca;

import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

/**
 * Created by gdias on 7/31/15.
 */
public class BookTest {
    @Test
    public void showDetails_ShouldReturnBookNameAuthorAndYear() throws Exception {
        String expected = "Harry Potter - J. K. Rowling - 1997";
        assertEquals(expected, new Book("Harry Potter", "J. K. Rowling", 1997).showDetails());
    }

    @Test
    public void checkout_ShouldReturnTrue_WhenTheBookIsAvailable() throws Exception {
        Book book = new Book("Harry Potter", "J. K. Rowling", 1997);
        assertTrue(book.checkout());
    }

    @Test
    public void checkout_ShouldReturnFalse_WhenTheBookIsNotAvailable() throws Exception {
        Book book = new Book("Harry Potter", "J. K. Rowling", 1997);
        book.checkout();
        assertFalse(book.checkout());
    }
}
