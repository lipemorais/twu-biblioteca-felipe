package com.twu.biblioteca.options;

import com.twu.biblioteca.Biblioteca;
import com.twu.biblioteca.GUI;

/**
 * Created by gdias on 8/5/15.
 */
public class VerifyBookOption extends AbstractOption {
    public VerifyBookOption(int number, String name) {
        super(number, name);
    }

    @Override
    public String execute(Biblioteca biblioteca) {
        if(biblioteca.loggedUserIsLibrarian()) {
            System.out.println("Enter book name, please.");
            String userInputBook = GUI.getUserInput();

            String userWhoCheckedOut = biblioteca.verifyBook(userInputBook);

            if(userWhoCheckedOut.isEmpty()) {
                return String.format("The book %s is not in checked books list", userInputBook);
            }

           return String.format("%s - %s", userInputBook, userWhoCheckedOut);

        }
        return "Permission denied";
    }
}
