package com.twu.biblioteca.options;

import com.twu.biblioteca.Biblioteca;
import com.twu.biblioteca.GUI;

/**
 * Created by fmorais on 8/4/15.
 */
public class LoginOption extends AbstractOption {

    public LoginOption(int number, String name) {
        super(number, name);
    }

    @Override
    public String execute(Biblioteca biblioteca) {
        System.out.println("Enter your library number, please.");
        String libraryNumber = GUI.getUserInput();

        System.out.println("Enter your password, please.");
        String password = GUI.getUserInput();

        if(biblioteca.login(libraryNumber, password)) {
            return "Logged in successfully.";
        } else {
            return "Invalid library number or password.";
        }
    }
}
