package com.bridgelabz;

@FunctionalInterface

public interface ValidateFirstName {

    public boolean validFirstname(String firstName) throws InvalidUserDetailsException;

}
