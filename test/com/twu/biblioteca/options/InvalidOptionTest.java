package com.twu.biblioteca.options;

import com.twu.biblioteca.Biblioteca;
import com.twu.biblioteca.MenuOptionsConsts;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Created by gdias on 8/3/15.
 */
public class InvalidOptionTest {
    @Test
    public void execute_ShouldReturnTheInvalidOptionMessage() throws Exception {
        AbstractOption option = new InvalidOption(MenuOptionsConsts.INVALID_OPTION_NUMBER, MenuOptionsConsts.INVALID_OPTION_NAME);
        assertEquals("Select a valid option!", option.execute(new Biblioteca()));
    }
}
