package com.twu.biblioteca.options;

import com.twu.biblioteca.Biblioteca;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Created by gdias on 8/3/15.
 */
public class QuitOptionTest {
    @Test
    public void execute_ShouldReturnQuit() throws Exception {
        Option quitOption = new QuitOption(2, "Quit");
        assertEquals("Quit", quitOption.execute(new Biblioteca()));
    }
}
