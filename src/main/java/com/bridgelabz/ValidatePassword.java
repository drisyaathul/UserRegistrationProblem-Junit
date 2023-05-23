package com.bridgelabz;

@FunctionalInterface
public interface ValidatePassword {

    public boolean validPasswordFormat(String password) throws InvalidUserDetailsException;
}
