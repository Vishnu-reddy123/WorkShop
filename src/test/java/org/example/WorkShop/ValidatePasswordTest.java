package org.example.WorkShop;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class ValidatePasswordTest {
    @Test
    public void givenPassword_WhenValid_ThenTrue() {
        boolean result = ValidatePassword.isPassword("Viva1@");
        Assert.assertTrue(result);
        System.out.println(result);
    }
    @Test
    public void givenPassword_WhenInValid_ThenFalse() {
        boolean result = ValidatePassword.isPassword("Vivare123");
        Assert.assertFalse(result);
        System.out.println(result);
    }

}
