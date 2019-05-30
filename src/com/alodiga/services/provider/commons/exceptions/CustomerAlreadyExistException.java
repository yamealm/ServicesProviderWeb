package com.alodiga.services.provider.commons.exceptions;

public class CustomerAlreadyExistException extends Exception {

    private static final long serialVersionUID = 1L;

    public CustomerAlreadyExistException(String message) {
        super(message);
    }


}
