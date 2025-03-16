package com.personal_project.bank_application.User;

import com.personal_project.bank_application.DTO.UserDTO;
import com.personal_project.bank_application.Service.Impl.UserServiceImpl;
import com.personal_project.bank_application.Service.UserService;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/user")
public class UserController {

    private final UserService userService;

    public UserController(UserService userService) {
        this.userService = userService;
    }

    @PostMapping(value = "/signup",
            consumes = {MediaType.APPLICATION_JSON_VALUE, MediaType.APPLICATION_XML_VALUE},
            produces = {MediaType.APPLICATION_JSON_VALUE, MediaType.APPLICATION_XML_VALUE})
    public ResponseEntity<UserDTO> signup(@RequestBody UserDTO userDTO) {
       UserDTO saveUser = userService.createUser(userDTO);
       return new ResponseEntity<>(saveUser, HttpStatus.CREATED);
    }

}
