package com.twu.biblioteca;

import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

/**
 * Created by fmorais on 8/4/15.
 */
public class UserAccountTest {
    @Test
    public void match_ShouldReturnFalse_WhenReceivesWrongCredentials() throws Exception {
        UserAccount userAccount = new UserAccount("333-4444", "123", UserAccount.Type.CUSTOMER, "John", "john@mail.com", "12345678");
        assertFalse(userAccount.match("wrongLibraryNumber", "WrongPassword"));
    }

    @Test
    public void match_ShouldReturnTrue_WhenReceivesTheRightCredentials() throws Exception {
        UserAccount userAccount = new UserAccount("333-4444", "123", UserAccount.Type.CUSTOMER, "John", "john@mail.com", "12345678");
        assertTrue(userAccount.match("333-4444", "123"));

    }

    @Test
    public void isCustomer_ShouldReturnTrue_WhenReceivesACostumer() throws Exception {
        UserAccount user = new UserAccount("333-4444", "123", UserAccount.Type.CUSTOMER, "John", "john@mail.com", "12345678");
        assertTrue(user.isCustomer());
    }

    @Test
    public void isCustomer_ShouldReturnFalse_WhenReceivesANonCostumer() throws Exception {
        UserAccount user = new UserAccount("333-4444", "123", UserAccount.Type.LIBRARIAN, "John", "john@mail.com", "12345678");
        assertFalse(user.isCustomer());
    }

    @Test
    public void isLibrarian_ShouldReturnTrue_WhenReceivesALibrarian() throws Exception {
        UserAccount user = new UserAccount("333-4444", "123", UserAccount.Type.LIBRARIAN, "John", "john@mail.com", "12345678");
        assertTrue(user.isLibrarian());
    }

    @Test
    public void showDetails_ShouldReturnNameEmailAndPhoneNumber() throws Exception {
        UserAccount john = new UserAccount("333-4444", "123", UserAccount.Type.LIBRARIAN, "John", "john@mail.com", "12345678");
        assertEquals("John - john@mail.com - 12345678", john.showDetails());

        UserAccount joao = new UserAccount("333-4444", "123", UserAccount.Type.LIBRARIAN, "Joao", "joao@mail.com", "12345678");
        assertEquals("Joao - joao@mail.com - 12345678", joao.showDetails());
    }

    @Test
    public void isLibrarian_ShouldReturnFalse_WhenReceivesANonLibrarian() throws Exception {
        UserAccount user = new UserAccount("333-4444", "123", UserAccount.Type.CUSTOMER, "John", "john@mail.com", "12345678");
        assertFalse(user.isLibrarian());
    }
}
