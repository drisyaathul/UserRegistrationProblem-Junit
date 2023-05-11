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
    @Test
    void givenPasswordAtLeastOneUpperCaseReturnTrue() {
        /*
            UC6: Test Valid Password at least one Upper Case-Rule2
        */
        boolean actualPasswordFormat = userRegistration.validPasswordFormat("SecretPassword");
        Assertions.assertTrue(actualPasswordFormat);
        System.out.println("Valid Password-Rule2 Format");
    }
    @Test
    void givenPasswordAtLeastOneNumericNumberReturnTrue() {
        /*
            UC7: Test Valid Password at least one Numeric number-Rule3
        */
        boolean actualPasswordFormat = userRegistration.validPasswordFormat("Secret123Password");
        Assertions.assertTrue(actualPasswordFormat);
        System.out.println("Valid Password-Rule3 Format");
    }
    @Test
    void givenPasswordHasOneSpecialCharacterReturnTrue() {
        /*
            UC8: Test Valid Password should have one special character-Rule4
        */
        boolean actualPasswordFormat = userRegistration.validPasswordFormat("Secret123_Password");
        Assertions.assertTrue(actualPasswordFormat);
        System.out.println("Valid Password-Rule4 Format");
    }
    @Test
    void givenAllEmailSamplesShouldReturnTrue() {
        /*
            UC9: Test all Email Samples
        */
        boolean actualEmail1 = userRegistration.validEmail("abc@yahoo.com");
        Assertions.assertTrue(actualEmail1);
        System.out.println("Valid Email Address-1");

        boolean actualEmail2 = userRegistration.validEmail("abc-100@yahoo.com");
        Assertions.assertTrue(actualEmail2);
        System.out.println("Valid Email Address-2");

        boolean actualEmail3 = userRegistration.validEmail("abc.100@yahoo.com");
        Assertions.assertTrue(actualEmail3);
        System.out.println("Valid Email Address-3");

        boolean actualEmail4 = userRegistration.validEmail("abc111@abc.com");
        Assertions.assertTrue(actualEmail4);
        System.out.println("Valid Email Address-4");

        boolean actualEmail5 = userRegistration.validEmail("abc-100@abc.net");
        Assertions.assertTrue(actualEmail5);
        System.out.println("Valid Email Address-5");

        boolean actualEmail6 = userRegistration.validEmail("abc.100@abc.com.au");
        Assertions.assertTrue(actualEmail6);
        System.out.println("Valid Email Address-6");

        boolean actualEmail7 = userRegistration.validEmail("abc@1.com");
        Assertions.assertTrue(actualEmail7);
        System.out.println("Valid Email Address-7");

        boolean actualEmail8 = userRegistration.validEmail("abc@gmail.com.com");
        Assertions.assertTrue(actualEmail8);
        System.out.println("Valid Email Address-8");

        boolean actualEmail9 = userRegistration.validEmail("abc+100@gmail.com");
        Assertions.assertTrue(actualEmail9);
        System.out.println("Valid Email Address-9");
    }
}
