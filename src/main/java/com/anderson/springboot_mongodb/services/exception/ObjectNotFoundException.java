package com.anderson.springboot_mongodb.services.exception;

import java.io.Serial;

public class ObjectNotFoundException extends RuntimeException {
    @Serial
    private static final long serialVersionUID = -8880026323659558779L;

    public ObjectNotFoundException(String msg) {
        super(msg);
    }
}
