package com.anderson.springboot_mongodb.services;

import java.util.List;

import org.springframework.stereotype.Service;

import com.anderson.springboot_mongodb.domain.User;
import com.anderson.springboot_mongodb.dto.UserDTO;
import com.anderson.springboot_mongodb.repository.UserRepository;

@Service
public class UserServiceImpl implements UserService {

    private final UserRepository repository;

    public UserServiceImpl(final UserRepository repository) {
        this.repository = repository;
    }

    @Override
    public List<User> findAll() {
        return repository.findAll();
    }

    @Override
    public List<UserDTO> findByName(String name) {
        return repository.findByNameStartsWithIgnoreCase(name);
    }

}
