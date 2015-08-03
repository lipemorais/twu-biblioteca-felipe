package com.twu.biblioteca.options;

import com.twu.biblioteca.Biblioteca;

/**
 * Created by gdias on 8/3/15.
 */
public class InvalidOption extends AbstractOption {
    public InvalidOption(int id, String name) {
        super(id, name);
    }

    @Override
    public String execute(Biblioteca biblioteca) {
        return "Select a valid option!";
    }
}
