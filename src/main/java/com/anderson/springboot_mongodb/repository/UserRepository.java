package com.anderson.springboot_mongodb.repository;

import java.util.List;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.anderson.springboot_mongodb.domain.User;
import com.anderson.springboot_mongodb.dto.UserDTO;

@Repository
public interface UserRepository extends MongoRepository<User, String> {
    
    List<UserDTO> findByNameStartsWithIgnoreCase(String name);
    
}
