package com.twu.biblioteca.resources;

/**
 * Created by fmorais on 8/4/15.
 */
public abstract class Resource {

    public String name;
    public int year;
    public boolean isChecked;
    public String whoCheckedOut;

    public Resource(String name, int year) {
        this.name = name;
        this.year = year;
        this.isChecked = false;
        this.whoCheckedOut = "";
    }

    public boolean checkoutResource(String libraryNumber) {
        if(isChecked) {
            return false;
        } else {
            isChecked = true;
            whoCheckedOut = libraryNumber;
            return true;
        }
    }

    public boolean returnResource() {
        if(isChecked) {
            isChecked = false;
            return true;
        } else {
            return false;
        }
    }

    public abstract String showDetails();
}
