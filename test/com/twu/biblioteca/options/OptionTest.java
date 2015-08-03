package com.twu.biblioteca.options;

import com.twu.biblioteca.Biblioteca;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by gdias on 7/31/15.
 */
public class OptionTest {
    @Test
    public void equals_ShouldReturnFalse_WhenTheParameterIsNotAnOption() throws Exception {
        AbstractOption optionA = getConcreteOption(1, "List books");
        String fakeOption = "AHuahaa";

        assertFalse(optionA.equals(fakeOption));
    }

    @Test
    public void equals_ShouldReturnTrue_WhenOptionsAreTheSame() throws Exception {
        AbstractOption optionA = getConcreteOption(1, "List books");
        AbstractOption optionB = optionA;

        assertTrue(optionA.equals(optionB));
    }

    @Test
    public void equals_ShouldReturnFalse_WhenOptionsAreDifferent() throws Exception {
        AbstractOption optionA = getConcreteOption(1, "List books");

        AbstractOption optionB = getConcreteOption(2, "List books");

        assertFalse(optionA.equals(optionB));
    }

    @Test
    public void execute_ShouldOverrideExecuteMethod() throws Exception {
        AbstractOption overridenOption = getConcreteOption(0, "");

        assertEquals("", overridenOption.execute(new Biblioteca()));
    }

    @Test
    public void showDetails_ShouldReturnIdAndName() throws Exception {
        AbstractOption option = getConcreteOption(1, "List books");
        assertEquals("1 - List books", option.showDetails());
    }

    private AbstractOption getConcreteOption(int id, String name) {
        AbstractOption optionA = new AbstractOption(id, name) {
            @Override
            public String execute(Biblioteca biblioteca) {
                return "";
            }
        };

        return optionA;
    }
}
