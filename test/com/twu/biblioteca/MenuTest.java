package com.twu.biblioteca;

import com.twu.biblioteca.options.*;
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
        assertEquals("1 - List resources\n2 - Checkout book\n3 - Return book\n5 - Quit\n", menu.listOptions());
    }

    @Test
    public void selectOption_ShouldReturnAListResourcesOption_WhenReceivesListBooksOptionNumber() throws Exception {
        assertTrue(menu.selectOption(MenuOptionsConsts.LIST_RESOURCES_OPTION_NUMBER) instanceof ListResourcesOption);
    }

    @Test
    public void selectOption_ShouldReturnAQuitOption_WhenReceivesQuitOptionNumber() throws Exception {
        assertTrue(menu.selectOption(MenuOptionsConsts.QUIT_OPTION_NUMBER) instanceof QuitOption);
    }

    @Test
    public void selectOption_ShouldReturnACheckoutOption_WhenReceivesCheckoutOptionNumber() throws Exception {
        assertTrue(menu.selectOption(MenuOptionsConsts.CHECKOUT_OPTION_NUMBER) instanceof CheckoutOption);
    }

    @Test
    public void selectOption_ShouldReturnAReturnBookOption_WhenReceivesReturnBookOptionNumber() throws Exception {
        assertTrue(menu.selectOption(MenuOptionsConsts.RETURN_BOOK_OPTION_NUMBER) instanceof ReturnResourceOption);
    }

    @Test
    public void selectOption_ShouldReturnAnInvalidOption_WhenReceivesAnInvalidOptionNumber() throws Exception {
        int invalidOptionNumber = 0;
        assertTrue(menu.selectOption(invalidOptionNumber) instanceof InvalidOption);
    }
}
