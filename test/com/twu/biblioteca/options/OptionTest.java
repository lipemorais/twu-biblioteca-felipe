package com.twu.biblioteca.options;

import com.twu.biblioteca.Biblioteca;
import com.twu.biblioteca.Book;
import com.twu.biblioteca.options.Option;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by gdias on 7/31/15.
 */
public class OptionTest {
    @Test
    public void equals_ShouldReturnFalse_WhenTheParameterIsNotAnOption() throws Exception {
        Option optionA = getConcreteOption(1, "List books");
        String fakeOption = "AHuahaa";

        assertFalse(optionA.equals(fakeOption));
    }

    @Test
    public void equals_ShouldReturnTrue_WhenOptionsAreTheSame() throws Exception {
        Option optionA = getConcreteOption(1, "List books");
        Option optionB = optionA;

        assertTrue(optionA.equals(optionB));
    }

    @Test
    public void equals_ShouldReturnFalse_WhenOptionsAreDifferent() throws Exception {
        Option optionA = getConcreteOption(1, "List books");

        Option optionB = getConcreteOption(2, "List books");

        assertFalse(optionA.equals(optionB));
    }

    @Test
    public void execute_ShouldOverrideExecuteMethod() throws Exception {
        Option overridenOption = getConcreteOption(0, "");

        assertEquals("", overridenOption.execute(new Biblioteca()));
    }

    private Option getConcreteOption(int id, String name) {
        Option optionA = new Option(id, name) {
            @Override
            public String execute(Biblioteca biblioteca) {
                return "";
            }
        };

        return optionA;
    }
}
