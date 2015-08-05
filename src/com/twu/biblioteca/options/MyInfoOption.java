package com.twu.biblioteca.options;

import com.twu.biblioteca.Biblioteca;

/**
 * Created by gdias on 8/5/15.
 */
public class MyInfoOption extends AbstractOption{
    public MyInfoOption(int number, String name) {
        super(number, name);
    }

    @Override
    public String execute(Biblioteca biblioteca) {
        if(biblioteca.loggedUserIsCustomer()) {
            return biblioteca.showLoggedUserDetails();
        }
        return "Permission denied";
    }
}
