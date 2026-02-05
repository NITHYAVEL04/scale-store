package com.poshmark.demo.exception;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(HttpStatus.NOT_FOUND)
public class ProductNotFoundException extends RuntimeException {
    // This constructor allows you to pass the "Product not found" message
    public ProductNotFoundException(String message) {
        super(message);
    }
}