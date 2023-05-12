package com.bridgelabz;

import java.util.Arrays;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class UserRegistration {
    /*
      Refactor the Code to throw custom exceptions in case of Invalid User Details
      Rewrite all Test Cases to take in Custom
     */
    public boolean validFirstname(String firstName) throws InvalidUserDetailsException {

       if (Pattern.matches("^[A-Z]{1}[a-z]{2,}", firstName)) {
           return true;
       }else
           throw new InvalidUserDetailsException("Invalid First Name");
    }
    public boolean validLastname(String lastName) throws InvalidUserDetailsException {

        if (Pattern.matches("^[A-Z]{1}[a-z]{2,}",lastName)) {
            return true;
        }else
            throw new InvalidUserDetailsException("Invalid Last Name");
    }
    public boolean validEmailId(String emailId) throws InvalidUserDetailsException  {

        if (Pattern.matches("^[a-z0-9.]{3,}@[a-z.]{2,}",emailId)) {
            return true;
        }else
            throw new InvalidUserDetailsException("Invalid Email Id");
    }
    public boolean validMobileFormat(String mobileNumber) throws InvalidUserDetailsException  {

        if (Pattern.matches("^[+][0-9]{1,3}\s\\d{10}",mobileNumber)) {
            return true;
        }else
            throw new InvalidUserDetailsException("Invalid Mobile Number");
    }
    public boolean validPasswordFormat(String password) throws InvalidUserDetailsException  {

        if (Pattern.matches("^[A-Za-z0-9].{8,}",password)) {
            return true;
        }else
            throw new InvalidUserDetailsException("Invalid Password");
    }
    public boolean validEmail(String email) throws InvalidUserDetailsException  {

        if (Pattern.matches("[a-z0-9].+@[a-z0-9.]{2,}",email)) {
            return true;
        }else
            throw new InvalidUserDetailsException("Invalid Email Addresses");
    }
}
