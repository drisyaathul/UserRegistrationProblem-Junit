package com.bridgelabz;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

public class UserRegistrationTest {
    /*
     Initializing the object before every testcase;
     */
    static UserRegistration userRegistration;
    @BeforeAll
    public static void initialize(){
         userRegistration = new UserRegistration();
    }
    @Test
    void givenFirstNameReturnTrue() {
        /*
            UC1: Test Valid FirstName
        */
        boolean actualFirstName = userRegistration.validFirstname("Drisya");
        Assertions.assertTrue(actualFirstName);
        System.out.println("Valid First Name");
    }
    @Test
    void givenLastNameReturnTrue() {
        /*
            UC2: Test Valid LastName
        */
        boolean actualLastName = userRegistration.validLastname("Athul");
        Assertions.assertTrue(actualLastName);
        System.out.println("Valid Last Name");
    }
    @Test
    void givenEmailIdReturnTrue() {
        /*
            UC3: Test Valid Email-Id
        */
        boolean actualEmail = userRegistration.validEmailId("abc.xyz@bl.co.in");
        Assertions.assertTrue(actualEmail);
        System.out.println("Valid Email-Id");
    }
    @Test
    void givenMobileFormatReturnTrue() {
        /*
            UC4: Test Valid Mobile Format
        */
        boolean actualMobileFormat = userRegistration.validMobileFormat("+91 9874563210");
        Assertions.assertTrue(actualMobileFormat);
        System.out.println("Valid Mobile Format");
    }
    @Test
    void givenPasswordMinimum8CharactersReturnTrue() {
        /*
            UC5: Test Valid Password minimum 8 characters-Rule1
        */
        boolean actualPasswordFormat = userRegistration.validPasswordFormat("secretpassword");
        Assertions.assertTrue(actualPasswordFormat);
        System.out.println("Valid Password-Rule1 Format");
    }

}
