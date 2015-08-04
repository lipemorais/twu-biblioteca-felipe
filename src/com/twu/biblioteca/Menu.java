package com.twu.biblioteca;

import com.twu.biblioteca.options.*;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by gdias on 7/31/15.
 */
public class Menu {
    private List<AbstractOption> options = new ArrayList<AbstractOption>();

    public Menu() {
        options.add(new ListResourcesOption(MenuOptionsConsts.LIST_BOOKS_OPTION_NUMBER, MenuOptionsConsts.LIST_BOOKS_OPTION_NAME));
        options.add(new CheckoutOption(MenuOptionsConsts.CHECKOUT_OPTION_NUMBER, MenuOptionsConsts.CHECKOUT_OPTION_NAME));
        options.add(new ReturnBookOption(MenuOptionsConsts.RETURN_BOOK_OPTION_NUMBER, MenuOptionsConsts.RETURN_BOOK_OPTION_NAME));
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
        for(AbstractOption option : options) {
            if(option.number == selectedId) {
                return option;
            }
        }
        return new InvalidOption(MenuOptionsConsts.INVALID_OPTION_NUMBER, MenuOptionsConsts.INVALID_OPTION_NAME);
    }
}
