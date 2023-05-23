package com.bridgelabz;

@FunctionalInterface
public interface ValidateMultipleEmail {

    public boolean validEmail(String email) throws InvalidUserDetailsException;
}
