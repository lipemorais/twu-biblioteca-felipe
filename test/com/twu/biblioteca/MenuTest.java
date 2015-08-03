package com.twu.biblioteca;

import com.twu.biblioteca.options.InvalidOption;
import com.twu.biblioteca.options.Option;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

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
        Option listBookOption = new Option(1, "List books") {
            @Override
            public String execute(Biblioteca biblioteca) {
                return "";
            }
        };

        assertEquals(listBookOption, new Menu().selectOption(1));
    }

    @Test
    public void selectOption_ShouldReturnAnInvalidOption_WhenReceivesAnInvalidOption() throws Exception {
        Menu menu = new Menu();

        assertTrue(menu.selectOption(0) instanceof InvalidOption);
    }
}
