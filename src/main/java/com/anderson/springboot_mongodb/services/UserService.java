package com.anderson.springboot_mongodb.services;

import java.util.List;

import com.anderson.springboot_mongodb.domain.User;

public interface UserService {

    List<User>findAll();

}
