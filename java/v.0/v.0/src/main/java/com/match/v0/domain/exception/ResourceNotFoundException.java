package com.match.v0.domain.exception;

public class ResourceNotFoundException extends RuntimeException{

    private static final String DESCRIPTION = "Resource not found";

    public ResourceNotFoundException(String message) {
        super(DESCRIPTION + ". " + message);
    }
}

