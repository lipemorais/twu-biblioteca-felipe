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
        UserAccount userAccount = new UserAccount("333-4444", "123");
        assertFalse(userAccount.match("wrongLibraryNumber", "WrongPassword"));
    }

    @Test
    public void match_ShouldReturnTrue_WhenReceivesTheRightCredentials() throws Exception {
        UserAccount userAccount = new UserAccount("333-4444", "123");
        assertTrue(userAccount.match("333-4444", "123"));

    }
}
