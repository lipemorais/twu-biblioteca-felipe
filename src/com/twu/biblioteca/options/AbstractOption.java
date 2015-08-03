package com.twu.biblioteca.options;

import com.twu.biblioteca.Biblioteca;

/**
 * Created by gdias on 7/31/15.
 */
public abstract class AbstractOption {
    public int number;
    private String name;

    public AbstractOption(int number, String name) {
        this.number = number;
        this.name = name;
    }

    public String showDetails() {
        String separator = " - ";
        return number + separator + name;
    }

    @Override
    public boolean equals(Object other) {
        if (other instanceof AbstractOption) {
            AbstractOption otherOption = (AbstractOption) other;
            return this.name.equals(otherOption.name) && this.number == otherOption.number;
        }
        return false;
    }

    public abstract String execute(Biblioteca biblioteca);
}
