package com.twu.biblioteca;

import com.twu.biblioteca.options.AbstractOption;

import java.util.Scanner;

/**
 * Created by gdias on 8/3/15.
 */
public class GUI {
    private final Biblioteca biblioteca;
    private final Menu menu;

    public GUI(Biblioteca biblioteca, Menu menu) {
        this.biblioteca = biblioteca;
        this.menu = menu;
    }

    public void start() {
        String executionResult;

        System.out.println(biblioteca.welcomeUser());

        do {
            System.out.println(menu.listOptions());

            String userInput = getUserInput();

            AbstractOption selectedOption = menu.selectOption(Integer.parseInt(userInput));

            executionResult = selectedOption.execute(biblioteca);

            System.out.println(executionResult);
        } while(!executionResult.equals("Quit"));

    }

    public static String getUserInput() {
        return new Scanner(System.in).nextLine();
    }
}
