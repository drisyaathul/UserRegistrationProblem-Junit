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
    void givenFirstNameHappyTest() {
        //Valid First Name
        boolean actualFirstName = userRegistration.validFirstname("Drisya");
        Assertions.assertTrue(actualFirstName);
        System.out.println("Valid First Name");
    }
    @Test
    void givenFirstNameSadTest() {
        //Invalid First Name
        boolean actualFirstName = userRegistration.validFirstname("drisya");
        Assertions.assertFalse(actualFirstName);
        System.out.println("Invalid First Name");
    }
    @Test
    void givenLastNameHappyTest() {
        //Valid Last Name
        boolean actualLastName = userRegistration.validLastname("Athul");
        Assertions.assertTrue(actualLastName);
        System.out.println("Valid Last Name");
    }
    @Test
    void givenLastNameSadTest() {
        //Invalid Last Name
        boolean actualLastName = userRegistration.validLastname("athul");
        Assertions.assertFalse(actualLastName);
        System.out.println("Invalid Last Name");
    }
    @Test
    void givenEmailIdHappyTest() {
       // Valid Email Id
        boolean actualEmail = userRegistration.validEmailId("abc.xyz@bl.co.in");
        Assertions.assertTrue(actualEmail);
        System.out.println("Valid Email-Id");
    }
    @Test
    void givenEmailIdSadTest() {
        // Invalid Email Id
        boolean actualEmail = userRegistration.validEmailId("abc.xyzbl.co.in");
        Assertions.assertFalse(actualEmail);
        System.out.println("Invalid Email-Id");
    }
    @Test
    void givenMobileFormatHappyTest() {
        // Test Valid Mobile Format
        boolean actualMobileFormat = userRegistration.validMobileFormat("+91 9874563210");
        Assertions.assertTrue(actualMobileFormat);
        System.out.println("Valid Mobile Format");
    }
    @Test
    void givenMobileFormatSadTest() {
        // Test Invalid Mobile Format
        boolean actualMobileFormat = userRegistration.validMobileFormat("+919874563210");
        Assertions.assertFalse(actualMobileFormat);
        System.out.println("Invalid Mobile Format");
    }
    @Test
    void givenPasswordMinimum8CharactersHappyTest() {
        // Test Valid Password-Rule1
        boolean actualPasswordFormat = userRegistration.validPasswordFormat("secretpassword");
        Assertions.assertTrue(actualPasswordFormat);
        System.out.println("Valid Password-Rule1 Format");
    }
    @Test
    void givenPasswordMinimum8CharactersSadTest() {
        // Test invalid Password-Rule1
        boolean actualPasswordFormat = userRegistration.validPasswordFormat("secret");
        Assertions.assertFalse(actualPasswordFormat);
        System.out.println("Invalid Password-Rule1 Format");
    }
    @Test
    void givenPasswordAtLeastOneUpperCaseHappyTest() {
        // Test Valid Password at least one Upper Case-Rule2
        boolean actualPasswordFormat = userRegistration.validPasswordFormat("SecretPassword");
        Assertions.assertTrue(actualPasswordFormat);
        System.out.println("Valid Password-Rule2 Format");
    }
    @Test
    void givenPasswordAtLeastOneUpperCaseSadTest() {
        // Test Invalid Password at least one Upper Case-Rule2
        boolean actualPasswordFormat = userRegistration.validPasswordFormat("Secret");
        Assertions.assertFalse(actualPasswordFormat);
        System.out.println("Invalid Password-Rule2 Format");
    }
    @Test
    void givenPasswordAtLeastOneNumericNumberHappyTest() {
        // Test Valid Password at least one Numeric number-Rule3
        boolean actualPasswordFormat = userRegistration.validPasswordFormat("Secret123Password");
        Assertions.assertTrue(actualPasswordFormat);
        System.out.println("Valid Password-Rule3 Format");
    }
    @Test
    void givenPasswordAtLeastOneNumericNumberSadTest() {
        // Test Invalid Password at least one Numeric number-Rule3
        boolean actualPasswordFormat = userRegistration.validPasswordFormat("Sec2et");
        Assertions.assertFalse(actualPasswordFormat);
        System.out.println("Invalid Password-Rule3 Format");
    }
    @Test
    void givenPasswordHasOneSpecialCharacterHappyTest() {
        // Test Valid Password should have one special character-Rule4
        boolean actualPasswordFormat = userRegistration.validPasswordFormat("Secret123_Password");
        Assertions.assertTrue(actualPasswordFormat);
        System.out.println("Valid Password-Rule4 Format");
    }
    @Test
    void givenPasswordHasOneSpecialCharacterSadTest() {
        // Test Invalid Password should have one special character-Rule4
        boolean actualPasswordFormat = userRegistration.validPasswordFormat("Secr_12");
        Assertions.assertFalse(actualPasswordFormat);
        System.out.println("Invalid Password-Rule4 Format");
    }
    @Test
    void givenAllEmailSamplesHappyTest() {
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
