package com.thoughtworks.capacity.gtb.mvc.exception;

public class UsernameOrPasswordIsWrong extends RuntimeException {
    public UsernameOrPasswordIsWrong(String message) {
        super(message);
    }
}
