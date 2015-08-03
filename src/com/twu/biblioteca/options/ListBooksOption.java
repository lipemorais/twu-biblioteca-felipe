package com.twu.biblioteca.options;

import com.twu.biblioteca.Biblioteca;
import com.twu.biblioteca.Book;

/**
 * Created by gdias on 8/3/15.
 */
public class ListBooksOption extends AbstractOption {
    public ListBooksOption(int id, String name) {
        super(id, name);
    }

    @Override
    public String execute(Biblioteca biblioteca) {
        String resultString = "";
        for(Book book : biblioteca.listBooks()) {
            resultString += book.showDetails() + "\n";
        }
        return resultString;
    }
}
