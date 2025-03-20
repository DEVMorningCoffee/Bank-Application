package com.personal_project.bank_application.Mapper;

import com.personal_project.bank_application.DTO.UserDTO;
import com.personal_project.bank_application.User.User;

public class UserMapper {

    // This class turn the user class into an object which the database can understand and store
    // Help store user
    public static UserDTO mapToUserDTO(User user){
        return new UserDTO(user.getFirstName(), user.getLastName(),
                user.getBankID(), user.getEmail());
    }

    // This class turn User Data Object to something the service layer can understand
    // Help find user
    public static User maptoUser(UserDTO userDTO){
        return new User(userDTO.getFirstName(), userDTO.getLastName(), userDTO.getBankID(), userDTO.getEmail());
    }
}
