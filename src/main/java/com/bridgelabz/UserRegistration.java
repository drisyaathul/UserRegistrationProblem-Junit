package com.bridgelabz;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class UserRegistration {

    public boolean validFirstname(String firstName) {
     /*
      UC1: Enter Valid FirstName
     */
       return Pattern.matches("^[A-Z]{1}[a-z]{2,}", firstName);
    }
}
