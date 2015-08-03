package com.twu.biblioteca;

import com.twu.biblioteca.options.InvalidOption;
import com.twu.biblioteca.options.ListBooksOption;
import com.twu.biblioteca.options.QuitOption;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

/**
 * Created by gdias on 7/31/15.
 */
public class MenuTest {
    private Menu menu;

    @Before
    public void setUp() throws Exception {
        menu = new Menu();
    }

    @Test
    public void listOptions_ShouldReturnTheMenuOptions() throws Exception {
        assertEquals("1 - List books", menu.listOptions());
    }

    @Test
    public void selectOption_ShouldReturnAListBooksOption_WhenReceivesListBooksOptionNumber() throws Exception {
        assertTrue(menu.selectOption(MenuOptionsConsts.LIST_BOOKS_OPTION_NUMBER) instanceof ListBooksOption);
    }

    @Test
    public void selectOption_ShouldReturnAQuitOption_WhenReceivesQuitOptionNumber() throws Exception {
        assertTrue(menu.selectOption(MenuOptionsConsts.QUIT_OPTION_NUMBER) instanceof QuitOption);
    }

    @Test
    public void selectOption_ShouldReturnAnInvalidOption_WhenReceivesAnInvalidOptionNumber() throws Exception {
        int invalidOptionNumber = 0;
        assertTrue(menu.selectOption(invalidOptionNumber) instanceof InvalidOption);
    }
}
