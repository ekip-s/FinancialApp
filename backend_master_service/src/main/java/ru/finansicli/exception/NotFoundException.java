package ru.finansicli.exception;

import lombok.Data;

import java.time.LocalDateTime;

@Data
public class NotFoundException extends RuntimeException {
    private final LocalDateTime timestamp;


    public NotFoundException(String message) {
        super(message);
        this.timestamp = LocalDateTime.now();
    }
}
