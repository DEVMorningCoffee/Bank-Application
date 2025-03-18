package com.personal_project.bank_application.Service;

import com.personal_project.bank_application.DTO.UserDTO;
import com.personal_project.bank_application.User.User;

public interface UserService {
    UserDTO createUser(UserDTO userDTO);
    User findUser(String email);
}
