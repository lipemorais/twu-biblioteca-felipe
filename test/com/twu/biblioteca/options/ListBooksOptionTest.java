package com.twu.biblioteca.options;

import com.twu.biblioteca.Biblioteca;
import com.twu.biblioteca.Book;
import org.junit.Test;

import java.util.List;

import static org.junit.Assert.assertEquals;

/**
 * Created by gdias on 8/3/15.
 */
public class ListBooksOptionTest {
    @Test
    public void execute_ShouldReturnAListOfBooksAsString() throws Exception {
        Option listBooksOption = new ListBooksOption(1, "List books");
        assertEquals("Harry Potter - J. K. Rowling - 1997\n", listBooksOption.execute(new Biblioteca()));
    }
}
