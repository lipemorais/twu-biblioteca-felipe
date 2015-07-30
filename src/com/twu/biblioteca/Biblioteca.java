package com.twu.biblioteca;

import java.util.List;

/**
 * Created by fmorais on 7/30/15.
 */
public class Biblioteca {
    String welcomeMessage = "Welcome to Biblioteca";

    public Biblioteca() {
    }

    public Biblioteca(String welcomeMessage) {

        this.welcomeMessage = welcomeMessage;
    }

    public String welcomeUser() {
        return welcomeMessage;
    }
}
