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
        options.add(new ListResourcesOption(MenuOptionsConsts.LIST_RESOURCES_OPTION_NUMBER, MenuOptionsConsts.LIST_RESOURCES_OPTION_NAME));
        options.add(new CheckoutOption(MenuOptionsConsts.CHECKOUT_OPTION_NUMBER, MenuOptionsConsts.CHECKOUT_RESOURCE_OPTION_NAME));
        options.add(new ReturnResourceOption(MenuOptionsConsts.RETURN_BOOK_OPTION_NUMBER, MenuOptionsConsts.RETURN_RESOURCE_OPTION_NAME));
        options.add(new LoginOption(MenuOptionsConsts.LOGIN_OPTION_NUMBER, MenuOptionsConsts.LOGIN_OPTION_NAME));
        options.add(new VerifyBookOption(MenuOptionsConsts.VERIFY_BOOK_OPTION_NUMBER, MenuOptionsConsts.VERIFY_BOOK_OPTION_NAME));
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
