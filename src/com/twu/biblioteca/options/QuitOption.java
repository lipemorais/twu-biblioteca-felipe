package com.twu.biblioteca.options;

import com.twu.biblioteca.Biblioteca;

/**
 * Created by gdias on 8/3/15.
 */
public class QuitOption extends AbstractOption {
    public QuitOption(int id, String name) {
        super(id, name);
    }

    @Override
    public String execute(Biblioteca biblioteca) {
        return "Quit";
    }
}
