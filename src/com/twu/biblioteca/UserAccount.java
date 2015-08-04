package com.twu.biblioteca;

/**
 * Created by fmorais on 8/4/15.
 */
public class UserAccount {

    private String libraryNumber;
    private String password;

    public UserAccount(String libraryNumber, String password) {
        this.libraryNumber = libraryNumber;
        this.password = password;
    }

    public boolean match(String libraryNumber, String password) {
        return this.libraryNumber.equals(libraryNumber) && this.password.equals(password);
    }
}
