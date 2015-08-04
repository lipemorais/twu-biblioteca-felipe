package com.twu.biblioteca.options;

import com.twu.biblioteca.Biblioteca;
import com.twu.biblioteca.MenuOptionsConsts;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Created by gdias on 8/3/15.
 */
public class ListResourcesOptionTest {
    @Test
    public void execute_ShouldReturnAListOfResourcesAsString() throws Exception {
        AbstractOption listResourcesOption = new ListResourcesOption(MenuOptionsConsts.LIST_RESOURCES_OPTION_NUMBER, MenuOptionsConsts.LIST_RESOURCES_OPTION_NAME);

        String expected = "Harry Potter - J. K. Rowling - 1997\n";
        expected += "The Little Prince - Antoine de Saint-Exupéry - 1943\n";
        expected += "Freakonomics - Stephen Dubner - 2005\n";
        expected += "The Lord of The Rings - Peter Jackson - 2001 - 10\n";
        expected += "Toy Story - John Lasseter - 1995 - 10\n";

        assertEquals(expected, listResourcesOption.execute(new Biblioteca()));
    }
}
