package com.twu.biblioteca.options;

import com.twu.biblioteca.Biblioteca;
import com.twu.biblioteca.GUI;
import org.junit.Ignore;

/**
 * Created by gdias on 8/3/15.
 */
public class CheckoutOption extends AbstractOption {

    public CheckoutOption(int id, String name) {
        super(id, name);
    }

    @Override
    public String execute(Biblioteca biblioteca) {
        System.out.println("Enter book name, please.");
        String userInputBook = GUI.getUserInput();

        if(biblioteca.checkout(userInputBook)) {
            return "Thank you! Enjoy the book.";
        } else {
            return "That book is not available.";
        }
    }
}
