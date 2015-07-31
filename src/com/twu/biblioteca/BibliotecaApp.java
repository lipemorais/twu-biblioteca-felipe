package com.twu.biblioteca;

public class BibliotecaApp {

    public static void main(String[] args) {
        Biblioteca biblioteca = new Biblioteca();
        Menu menu = new Menu();

        System.out.println(biblioteca.welcomeUser());

        System.out.println(menu.listOptions());
    }
}
