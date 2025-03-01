package com.anderson.springboot_mongodb.controller;

import java.util.List;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.anderson.springboot_mongodb.domain.User;
import com.anderson.springboot_mongodb.dto.UserDTO;
import com.anderson.springboot_mongodb.services.UserService;

@RestController
@RequestMapping(value = "/users")
public class UserController {

    private final UserService service;

    public UserController(final UserService service) {
        this.service = service;
    }

    @GetMapping
    public ResponseEntity<List<User>> findAll() {
        return ResponseEntity.ok().body(service.findAll());
    }

    @GetMapping("/{id}")
    public ResponseEntity<UserDTO> findByName(@PathVariable String id) {
        return ResponseEntity.ok().body(service.findById(id));
    }

}
