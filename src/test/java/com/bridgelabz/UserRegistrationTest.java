package com.bridgelabz;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class UserRegistrationTest {

    @Test
    void givenFirstNameReturnTrue(){
        /*
            UC1: Test Valid FirstName
        */
        UserRegistration userRegistration = new UserRegistration();
        boolean actualFirstName = userRegistration.validFirstname("Drisya");
        Assertions.assertTrue(actualFirstName);
        System.out.println("Valid First Name");
    }

}
