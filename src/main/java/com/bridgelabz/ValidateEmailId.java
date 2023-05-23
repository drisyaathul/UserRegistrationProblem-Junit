package com.bridgelabz;

@FunctionalInterface
public interface ValidateEmailId {

    public boolean validEmailId(String emailId) throws InvalidUserDetailsException;
}
