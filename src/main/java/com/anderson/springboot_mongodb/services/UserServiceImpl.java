package com.anderson.springboot_mongodb.services;

import com.anderson.springboot_mongodb.domain.User;
import com.anderson.springboot_mongodb.dto.UserDTO;
import com.anderson.springboot_mongodb.repository.UserRepository;
import com.anderson.springboot_mongodb.services.exception.ObjectNotFoundException;
import org.springframework.stereotype.Service;

import java.util.List;

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
        return repository.findByNameStartsWithIgnoreCase(name, UserDTO.class);
    }

    @Override
    public UserDTO findById(String id) {
        return repository.findById(id).map(UserDTO::new)
                .orElseThrow(() -> new ObjectNotFoundException("User not found"));
    }

    @Override
    public User save(User obj) {
        return repository.save(obj);
    }

    @Override
    public User fromDTO(UserDTO userDTO) {
        return new User(userDTO.getId(), userDTO.getName(), userDTO.getEmail());
    }
}
