package com.bridgelabz;

public class InvalidUserDetailsException extends Exception{
    /*
     Creating custom Exception
     */
    public InvalidUserDetailsException(String message) {
        /*
         * constructor with a String parameter
         * call the super constructor and pass the message
         */
        super(message);
    }
}
