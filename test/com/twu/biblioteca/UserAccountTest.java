package com.twu.biblioteca;

import org.junit.Test;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

/**
 * Created by fmorais on 8/4/15.
 */
public class UserAccountTest {
    @Test
    public void match_ShouldReturnFalse_WhenReceivesWrongCredentials() throws Exception {
        UserAccount userAccount = new UserAccount("333-4444", "123", UserAccount.Type.CUSTOMER);
        assertFalse(userAccount.match("wrongLibraryNumber", "WrongPassword"));
    }

    @Test
    public void match_ShouldReturnTrue_WhenReceivesTheRightCredentials() throws Exception {
        UserAccount userAccount = new UserAccount("333-4444", "123", UserAccount.Type.CUSTOMER);
        assertTrue(userAccount.match("333-4444", "123"));

    }

    @Test
    public void isCustomer_ShouldReturnTrue_WhenReceivesACostumer() throws Exception {
        UserAccount user = new UserAccount("333-4444", "123", UserAccount.Type.CUSTOMER);
        assertTrue(user.isCustomer());
    }

    @Test
    public void isCustomer_ShouldReturnFalse_WhenReceivesANonCostumer() throws Exception {
        UserAccount user = new UserAccount("333-4444", "123", UserAccount.Type.LIBRARIAN);
        assertFalse(user.isCustomer());
    }

    @Test
    public void isLibrarian_ShouldReturnTrue_WhenReceivesALibrarian() throws Exception {
        UserAccount user = new UserAccount("333-4444", "123", UserAccount.Type.LIBRARIAN);
        assertTrue(user.isLibrarian());
    }

    @Test
    public void isLibrarian_ShouldReturnFalse_WhenReceivesANonLibrarian() throws Exception {
        UserAccount user = new UserAccount("333-4444", "123", UserAccount.Type.CUSTOMER);
        assertFalse(user.isLibrarian());
    }
}
