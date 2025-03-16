package com.personal_project.bank_application.Exceptions.Handler;

import com.personal_project.bank_application.Exceptions.CustomException;
import com.personal_project.bank_application.Exceptions.ExceptionDetails;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;

import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.util.Date;

@ControllerAdvice
public class ExceptionHandler {

    @org.springframework.web.bind.annotation.ExceptionHandler(value = { CustomException.class })
    public ResponseEntity<Object> badRequestException(CustomException ex) {
        // Create payload containing exception details
        ExceptionDetails exceptionDetails = new ExceptionDetails(ex.getMessage(), HttpStatus.BAD_REQUEST, ZonedDateTime.now());

        return new ResponseEntity<>(exceptionDetails, HttpStatus.BAD_REQUEST);
    }
}
