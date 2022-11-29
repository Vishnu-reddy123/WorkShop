package org.example.WorkShop;
import java.util.regex.Pattern;

public class ValidatePassword {
    public static boolean isPassword(String password){
        return Pattern.matches("[A-Za-z0-9@!#$%^&*]{6}",password);
    }
}
