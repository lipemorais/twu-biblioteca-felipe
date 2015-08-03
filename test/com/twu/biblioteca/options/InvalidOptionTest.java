package com.twu.biblioteca.options;

import com.twu.biblioteca.Biblioteca;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Created by gdias on 8/3/15.
 */
public class InvalidOptionTest {
    @Test
    public void execute_ShouldReturnTheInvalidOptionMessage() throws Exception {
        Option option = new InvalidOption(0, "Invalid option");
        assertEquals("Select a valid option!", option.execute(new Biblioteca()));
    }
}
