package com.personal_project.bank_application.Exceptions;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Setter;
import org.springframework.http.HttpStatus;

import java.time.ZonedDateTime;

@Data
@AllArgsConstructor
@Setter
public class ExceptionDetails {
    private String message;
    private HttpStatus httpStatus;
    private ZonedDateTime zonedDateTime;
}
