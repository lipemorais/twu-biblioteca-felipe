package com.twu.biblioteca;

import com.twu.biblioteca.options.Option;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Created by gdias on 7/31/15.
 */
public class MenuTest {
    @Test
    public void listOptions_ShouldReturnTheMenuOptions() throws Exception {
        assertEquals("1 - List books", new Menu().listOptions());
    }

    @Test
    public void selectOption_ShouldReturnSelectedOption() throws Exception {
        Option listBookOption= new Option(1, "List books") {
            @Override
            public String execute(Biblioteca biblioteca) {
                return "";
            }
        };

        assertEquals(listBookOption, new Menu().selectOption(1));
    }
}
