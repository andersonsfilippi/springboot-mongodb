package com.anderson.springboot_mongodb.dto;

import com.anderson.springboot_mongodb.domain.User;

import java.io.Serial;
import java.io.Serializable;

public class AuthorDTO implements Serializable {
    @Serial
    private static final long serialVersionUID = -1003593857214042850L;

    private String id;
    private String name;

    public AuthorDTO() {
    }

    public AuthorDTO(User obj){
        this.id = obj.getId();
        this.name = obj.getName();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }
}
