package com.twu.biblioteca;

import com.twu.biblioteca.options.InvalidOption;
import com.twu.biblioteca.options.ListBooksOption;
import com.twu.biblioteca.options.AbstractOption;
import com.twu.biblioteca.options.QuitOption;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by gdias on 7/31/15.
 */
public class Menu {
    private List<AbstractOption> options = new ArrayList<AbstractOption>();

    public Menu() {
        options.add(new ListBooksOption(MenuOptionsConsts.LIST_BOOKS_OPTION_NUMBER, MenuOptionsConsts.LIST_BOOKS_OPTION_NAME));
        options.add(new QuitOption(MenuOptionsConsts.QUIT_OPTION_NUMBER, MenuOptionsConsts.QUIT_OPTION_NAME));
    }

    public String listOptions() {
        String resultString = "";

        for(AbstractOption option : options) {
            resultString += option.showDetails() + "\n";
        }

        return resultString;
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
