package com.twu.biblioteca.options;

import com.twu.biblioteca.Biblioteca;
import com.twu.biblioteca.MenuOptionsConsts;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Created by gdias on 8/3/15.
 */
public class QuitOptionTest {
    @Test
    public void execute_ShouldReturnQuit() throws Exception {
        AbstractOption quitOption = new QuitOption(MenuOptionsConsts.QUIT_OPTION_NUMBER, MenuOptionsConsts.QUIT_OPTION_NAME);
        assertEquals("Quit", quitOption.execute(new Biblioteca()));
    }
}
