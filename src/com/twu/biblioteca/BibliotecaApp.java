package com.twu.biblioteca;

import com.twu.biblioteca.options.Option;

import java.util.Scanner;

public class BibliotecaApp {

    public static void main(String[] args) {
        Biblioteca biblioteca = new Biblioteca();
        Menu menu = new Menu();

        System.out.println(biblioteca.welcomeUser());

        System.out.println(menu.listOptions());

        String userInput = getUserInput();

        Option selectedOption = menu.selectOption(Integer.parseInt(userInput));

        System.out.println(selectedOption.execute(biblioteca));
    }

    private static String getUserInput() {
        return new Scanner(System.in).nextLine();
    }
}
