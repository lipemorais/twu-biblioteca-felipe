package com.twu.biblioteca;

public class BibliotecaApp {

    public static void main(String[] args) {
        Biblioteca biblioteca = new Biblioteca();
        Menu menu = new Menu();
        GUI gui = new GUI(biblioteca, menu);

        gui.start();
   }
}
