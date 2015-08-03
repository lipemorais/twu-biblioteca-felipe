package com.twu.biblioteca.options;

import com.twu.biblioteca.Biblioteca;

/**
 * Created by gdias on 7/31/15.
 */
public abstract class Option {
    private int id;
    private String name;

    public Option(int id, String name) {
        this.id = id;
        this.name = name;
    }

    @Override
    public boolean equals(Object other) {
        if (other instanceof Option) {
            Option otherOption = (Option) other;
            return this.name.equals(otherOption.name) && this.id == otherOption.id;
        }
        return false;
    }

    public abstract String execute(Biblioteca biblioteca);
}
