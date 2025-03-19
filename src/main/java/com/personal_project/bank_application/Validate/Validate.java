package com.personal_project.bank_application.Validate;

import com.personal_project.bank_application.DTO.UserDTO;
import com.personal_project.bank_application.Exceptions.UserException.UserServiceException;
import org.apache.commons.validator.routines.EmailValidator;
import org.springframework.stereotype.Service;

import java.util.regex.Pattern;

@Service
public class Validate {
    private static final String OnlyLetterRegex = "^[a-zA-Z]*$";

    public void UserServiceSignUpValadation(UserDTO userDTO) {
        if(userDTO.getFirstName() == null || userDTO.getLastName() == null || userDTO.getFirstName().isEmpty() || userDTO.getLastName().isEmpty()){
            throw new UserServiceException("First name or Last null can't be null");
        }

        if(userDTO.getEmail() == null || userDTO.getEmail().isEmpty()){
            throw new UserServiceException("Email can't be empty");
        }

        Pattern pattern = Pattern.compile(OnlyLetterRegex);
        if(!pattern.matcher(userDTO.getFirstName()).matches() || !pattern.matcher(userDTO.getLastName()).matches()){
            throw new UserServiceException("First and last name can only contain letters");
        }

        if(!EmailValidator.getInstance().isValid(userDTO.getEmail())){
            throw new UserServiceException("Email is not valid");
        }
    }
}
