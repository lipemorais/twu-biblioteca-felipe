package com.twu.biblioteca.options;

import com.twu.biblioteca.Biblioteca;
import com.twu.biblioteca.GUI;

/**
 * Created by gdias on 8/3/15.
 */
public class ReturnResourceOption extends AbstractOption {

    public ReturnResourceOption(int number, String name) {
        super(number, name);
    }

    @Override
    public String execute(Biblioteca biblioteca) {
        if(biblioteca.loggedUserIsCustomer()) {
            System.out.println("Enter book name, please.");
            String userInputBook = GUI.getUserInput();

            if(biblioteca.returnResource(userInputBook)) {
                return "Thank you for returning the resource.";
            } else {
                return "That is not a valid resource to return.";
            }
        }
        return "Permission denied";
    }
}
