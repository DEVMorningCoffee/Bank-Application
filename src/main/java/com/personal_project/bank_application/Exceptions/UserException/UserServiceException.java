package com.personal_project.bank_application.Exceptions.UserException;

import java.io.Serial;

public class UserServiceException extends RuntimeException {

    @Serial
    private static final long serialVersionUID = 1L;

    public UserServiceException(String message) {
        super(message);
    }

}
