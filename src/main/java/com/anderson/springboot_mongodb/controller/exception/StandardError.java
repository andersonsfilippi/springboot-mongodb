package com.anderson.springboot_mongodb.controller.exception;

import java.io.Serial;
import java.io.Serializable;

public class StandardError implements Serializable {
    @Serial
    private static final long serialVersionUID = -8201219153209576619L;

    private Long timestamo;
    private Integer status;
    private String error;
    private String message;
    private String path;

    public StandardError() {
    }

    public StandardError(Long timestamo, Integer status, String error, String message, String path) {
        this.timestamo = timestamo;
        this.status = status;
        this.error = error;
        this.message = message;
        this.path = path;
    }

    public Long getTimestamo() {
        return timestamo;
    }

    public void setTimestamo(Long timestamo) {
        this.timestamo = timestamo;
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    public String getError() {
        return error;
    }

    public void setError(String error) {
        this.error = error;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public String getPath() {
        return path;
    }

    public void setPath(String path) {
        this.path = path;
    }
}
