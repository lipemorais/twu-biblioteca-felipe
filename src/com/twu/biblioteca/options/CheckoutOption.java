package com.twu.biblioteca.options;

import com.twu.biblioteca.Biblioteca;
import com.twu.biblioteca.GUI;

/**
 * Created by gdias on 8/3/15.
 */
public class CheckoutOption extends AbstractOption {

    public CheckoutOption(int id, String name) {
        super(id, name);
    }

    @Override
    public String execute(Biblioteca biblioteca) {

        if(biblioteca.loggedUserIsCustomer()) {
            System.out.println("Enter book name, please.");
            String userInputBook = GUI.getUserInput();

            if (biblioteca.checkoutResource(userInputBook)) {
                return "Thank you! Enjoy it.";
            } else {
                return "That resource is not available.";
            }
        }
        return "Permision denied.";
    }
}
