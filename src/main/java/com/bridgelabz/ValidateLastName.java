package com.bridgelabz;

@FunctionalInterface

public interface ValidateLastName {
    public boolean validLastName(String lastName) throws InvalidUserDetailsException;
}
