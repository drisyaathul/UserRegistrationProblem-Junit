package com.bridgelabz;

@FunctionalInterface
public interface ValidateMobileNumber {

    public boolean validMobileFormat(String mobileNumber) throws InvalidUserDetailsException;
}
