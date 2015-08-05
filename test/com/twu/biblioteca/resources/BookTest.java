package com.twu.biblioteca.resources;

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
    public void checkoutResource_ShouldReturnTrue_WhenTheBookIsAvailable() throws Exception {
        assertTrue(book.checkoutResource("333-4444"));
    }

    @Test
    public void checkoutResource_ShouldReturnFalse_WhenTheBookIsNotAvailable() throws Exception {
        book.checkoutResource("333-4444");
        assertFalse(book.checkoutResource("333-4444"));
    }

    @Test
    public void returnResource_ShouldReturnTrue_WhenBookIsNotAvailable() throws Exception {
        book.checkoutResource("333-4444");
        assertTrue(book.returnResource());
    }

    @Test
    public void returnResource_ShouldReturnFalse_WhenBookIsAvailable() throws Exception {
        assertFalse(book.returnResource());
    }
}
