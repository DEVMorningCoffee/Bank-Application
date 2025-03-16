package com.personal_project.bank_application.Mapper;

import com.personal_project.bank_application.DTO.UserDTO;
import com.personal_project.bank_application.User.User;

public class UserMapper {

    public static UserDTO mapToUserDTO(User user){
        return new UserDTO(user.getFirstName(), user.getLastName(),
                user.getBankID());
    }

    public static User maptoUser(UserDTO userDTO){
        return new User(userDTO.getFirstName(), userDTO.getLastName(), userDTO.getBankID());
    }
}
