package com.twu.biblioteca;

import com.twu.biblioteca.options.InvalidOption;
import com.twu.biblioteca.options.ListBooksOption;
import com.twu.biblioteca.options.AbstractOption;
import com.twu.biblioteca.options.QuitOption;

/**
 * Created by gdias on 7/31/15.
 */
public class Menu {
    public String listOptions() {
        return MenuOptionsConsts.LIST_BOOKS_OPTION_NUMBER + " - " + MenuOptionsConsts.LIST_BOOKS_OPTION_NAME;
    }

    public AbstractOption selectOption(int selectedId) {
        AbstractOption option;
        switch (selectedId) {
            case 1:
                option = new ListBooksOption(MenuOptionsConsts.LIST_BOOKS_OPTION_NUMBER, MenuOptionsConsts.LIST_BOOKS_OPTION_NAME);
                break;
            case 2:
                option = new QuitOption(MenuOptionsConsts.QUIT_OPTION_NUMBER, MenuOptionsConsts.QUIT_OPTION_NAME);
                break;
            default:
                option = new InvalidOption(MenuOptionsConsts.INVALID_OPTION_NUMBER, MenuOptionsConsts.INVALID_OPTION_NAME);
        }

        return option;
    }
}
