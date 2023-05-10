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
}
