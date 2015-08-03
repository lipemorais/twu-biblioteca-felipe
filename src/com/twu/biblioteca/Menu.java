package com.twu.biblioteca;

import com.twu.biblioteca.options.InvalidOption;
import com.twu.biblioteca.options.ListBooksOption;
import com.twu.biblioteca.options.Option;

/**
 * Created by gdias on 7/31/15.
 */
public class Menu {
    public static final  int LIST_BOOKS_NUMBER = 1;

    public String listOptions() {
        return "1 - List books";
    }

    public Option selectOption(int selectedId) {
        Option option;
        switch (selectedId) {
            case 1:
                option = new ListBooksOption(1, "List books");
                break;
            default:
                option = new InvalidOption(0, "Invalid option");
        }

        return option;
    }
}
