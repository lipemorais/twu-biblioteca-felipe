package com.twu.biblioteca.options;

import com.twu.biblioteca.Biblioteca;
import com.twu.biblioteca.GUI;

/**
 * Created by gdias on 8/3/15.
 */
public class ReturnBookOption extends AbstractOption {

    public ReturnBookOption(int number, String name) {
        super(number, name);
    }

    @Override
    public String execute(Biblioteca biblioteca) {
        System.out.println("Enter book name, please.");
        String userInputBook = GUI.getUserInput();

        if(biblioteca.returnBook(userInputBook)) {
            return "Thank you for returning the book.";
        } else {
            return "That is not a valid book to return.";
        }
    }
}
