package com.example.demo.facade;

import com.example.demo.entity.User;
import com.example.demo.dto.UserDTO;
import org.springframework.stereotype.Component;

@Component
public class UserFacade {

    public UserDTO userToUserDTO(User user) {
        UserDTO userDTO = new UserDTO();
        userDTO.setId(user.getId());
        userDTO.setUsername(user.getUsername());
        userDTO.setLastname(user.getLastname());
        userDTO.setFirstname(user.getName());
        userDTO.setBio(user.getBio());
        return userDTO;
    }

}
