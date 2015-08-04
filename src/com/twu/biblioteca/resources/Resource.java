package com.twu.biblioteca.resources;

/**
 * Created by fmorais on 8/4/15.
 */
public class Resource {

    private boolean isChecked = false;

    public boolean checkoutResource() {
        if(isChecked) {
            return false;
        } else {
            isChecked = true;
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
}
