package com.thoughtworks.capacity.gtb.mvc.exception;

public class UserNameAndPasswordIsNullException extends RuntimeException {
    public UserNameAndPasswordIsNullException(String message) {
        super(message);
    }
}
