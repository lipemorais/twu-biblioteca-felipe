package com.twu.biblioteca;

import com.twu.biblioteca.options.ListBooksOption;
import com.twu.biblioteca.options.Option;

/**
 * Created by gdias on 7/31/15.
 */
public class Menu {
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
                option = null;
        }

        return option;
    }
}
