package com.anderson.springboot_mongodb.services;

import java.util.List;

import com.anderson.springboot_mongodb.domain.User;
import com.anderson.springboot_mongodb.dto.UserDTO;

public interface UserService {

    List<User>findAll();
    List<UserDTO>findByName(String name);
    UserDTO findById(String id);
    User save(User user);
    void delete(String id);
    User fromDTO(UserDTO userDto);
}
