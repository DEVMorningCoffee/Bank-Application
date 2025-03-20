package com.personal_project.bank_application.Service.Impl;

import com.personal_project.bank_application.DTO.UserDTO;
import com.personal_project.bank_application.Exceptions.UserException.UserServiceException;
import com.personal_project.bank_application.Mapper.UserMapper;
import com.personal_project.bank_application.Repo.UserRepo;
import com.personal_project.bank_application.Service.UserService;
import com.personal_project.bank_application.User.User;
import com.personal_project.bank_application.Validate.Validate;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
@AllArgsConstructor
public class UserServiceImpl implements UserService {
    private final UserRepo userRepo;
    private final Validate validate;

    @Override
    public UserDTO createUser(UserDTO userDTO) {
        validate.UserServiceSignUpValidation(userDTO);

        User user = UserMapper.maptoUser(userDTO);
        User newUser = userRepo.save(user);

        return UserMapper.mapToUserDTO(newUser);
    }

    public User findUser(String email){
        Optional<User> user = userRepo.findUserByEmail(email);

        if(user.isEmpty()){
            throw new UserServiceException("User not found");
        }

        return user.orElse(null);
    }
}
