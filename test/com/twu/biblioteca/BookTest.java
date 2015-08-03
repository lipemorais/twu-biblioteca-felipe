package com.twu.biblioteca;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

/**
 * Created by gdias on 7/31/15.
 */
public class BookTest {
    private Book book;

    @Before
    public void setUp() throws Exception {
        book = new Book("Harry Potter", "J. K. Rowling", 1997);
    }

    @Test
    public void showDetails_ShouldReturnBookNameAuthorAndYear() throws Exception {
        String expected = "Harry Potter - J. K. Rowling - 1997";
        assertEquals(expected, book.showDetails());
    }

    @Test
    public void checkout_ShouldReturnTrue_WhenTheBookIsAvailable() throws Exception {
        assertTrue(book.checkout());
    }

    @Test
    public void checkout_ShouldReturnFalse_WhenTheBookIsNotAvailable() throws Exception {
        book.checkout();
        assertFalse(book.checkout());
    }

    @Test
    public void returnBook_ShouldReturnTrue_WhenBookIsNotAvailable() throws Exception {
        book.checkout();
        assertTrue(book.returnBook());
    }

    @Test
    public void returnBook_ShouldReturnFalse_WhenBookIsAvailable() throws Exception {
        assertFalse(book.returnBook());
    }
}
