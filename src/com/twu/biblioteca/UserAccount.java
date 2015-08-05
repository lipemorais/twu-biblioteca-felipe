package com.twu.biblioteca;

/**
 * Created by fmorais on 8/4/15.
 */
public class UserAccount {
    public enum Type {CUSTOMER, LIBRARIAN;};

    public String libraryNumber;

    private String password;
    private Type type;
    public UserAccount(String libraryNumber, String password, Type type) {
        this.libraryNumber = libraryNumber;
        this.password = password;
        this.type = type;
    }

    public boolean match(String libraryNumber, String password) {
        return this.libraryNumber.equals(libraryNumber) && this.password.equals(password);
    }

    public boolean isCustomer() {
        return type.equals(Type.CUSTOMER);
    }

    public boolean isLibrarian() {
        return type.equals(Type.LIBRARIAN);
    }
}
