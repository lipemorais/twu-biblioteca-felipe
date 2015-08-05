package com.twu.biblioteca;

/**
 * Created by fmorais on 8/4/15.
 */
public class UserAccount {
    public enum Type {CUSTOMER, LIBRARIAN;};

    public String libraryNumber;
    private String password;

    private Type type;
    private String name;
    private String email;
    private String phoneNumber;
    public UserAccount(String libraryNumber, String password, Type type, String name, String email, String phoneNumber) {
        this.libraryNumber = libraryNumber;
        this.password = password;
        this.type = type;
        this.name = name;
        this.email = email;
        this.phoneNumber = phoneNumber;
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

    public String showDetails() {
        return String.format("%s - %s - %s", name, email, phoneNumber);
    }
}
