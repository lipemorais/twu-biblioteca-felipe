package com.twu.biblioteca;

public class BibliotecaApp {

    public static void main(String[] args) {
        Biblioteca biblioteca = new Biblioteca();
        System.out.println(biblioteca.welcomeUser());

        for(Book book : biblioteca.listBooks()) {
            System.out.println(book.name + "\n");
        }
    }
}
