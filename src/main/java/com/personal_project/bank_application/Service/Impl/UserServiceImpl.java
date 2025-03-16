package com.personal_project.bank_application.Service.Impl;

import com.personal_project.bank_application.DTO.UserDTO;
import com.personal_project.bank_application.Mapper.UserMapper;
import com.personal_project.bank_application.Repo.UserRepo;
import com.personal_project.bank_application.Service.UserService;
import com.personal_project.bank_application.User.User;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@AllArgsConstructor
public class UserServiceImpl implements UserService {
    private final UserRepo userRepo;

    @Override
    public UserDTO createUser(UserDTO userDTO) {

        User user = UserMapper.maptoUser(userDTO);
        User newUser = userRepo.save(user);

        return UserMapper.mapToUserDTO(newUser);
    }
}
