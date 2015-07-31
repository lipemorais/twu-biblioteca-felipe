package com.twu.biblioteca;

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
}
