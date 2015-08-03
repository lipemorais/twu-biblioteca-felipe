package com.twu.biblioteca.options;

import com.twu.biblioteca.Biblioteca;

/**
 * Created by gdias on 8/3/15.
 */
public class ListBooksOption extends Option {
    public ListBooksOption(int id, String name) {
        super(id, name);
    }

    @Override
    public String execute(Biblioteca biblioteca) {
        return "Harry Potter - J. K. Rowling - 1997\n";
    }
}
