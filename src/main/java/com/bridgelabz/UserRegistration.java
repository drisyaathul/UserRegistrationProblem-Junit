package com.bridgelabz;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class UserRegistration {
    /*
     UC1: Enter Valid FirstName
     */
    public boolean validFirstname(String firstName) {

       return Pattern.matches("^[A-Z][a-z]{2,}", firstName);
    }
}
