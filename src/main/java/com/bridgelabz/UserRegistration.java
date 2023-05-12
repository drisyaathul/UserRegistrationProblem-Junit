package com.bridgelabz;

import java.util.Arrays;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class UserRegistration {

    public boolean validFirstname(String firstName) {
     /*
      UC1: Enter Valid FirstName
     */
       return Pattern.matches("^[A-Z]{1}[a-z]{2,}", firstName);
    }
    public boolean validLastname(String lastName) {
     /*
      UC2: Enter Valid LastName
     */
        return Pattern.matches("^[A-Z]{1}[a-z]{2,}",lastName);
    }
    public boolean validEmailId(String emailId) {
     /*
      UC3: Enter Valid Email-Id
     */
        return Pattern.matches("^[a-z0-9.]{3,}@[a-z.]{2,}",emailId);
    }
    public boolean validMobileFormat(String mobileNumber) {
     /*
      UC4: Enter Valid Mobile Format
     */
        return Pattern.matches("^[+][0-9]{1,3}\s\\d{10}",mobileNumber);
    }
    public boolean validPasswordFormat(String password) {
     /*
       Enter Valid Mobile Format
     */
        return Pattern.matches("^[A-Za-z0-9].{8,}",password);
    }
    public boolean validEmail(String email) {
    /*
       UC9: Enter Valid Email Format
     */
        return Pattern.matches("[a-z0-9].+@[a-z0-9.]{2,}",email);
    }
}
