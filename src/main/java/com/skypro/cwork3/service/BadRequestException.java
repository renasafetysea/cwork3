package com.skypro.cwork3.service;

import org.springframework.http.HttpStatus;
import org.springframework.http.HttpStatusCode;
import org.springframework.web.server.ResponseStatusException;

public class BadRequestException extends ResponseStatusException {

    public BadRequestException(HttpStatusCode status) {
        super(status);
    }

    public BadRequestException(HttpStatusCode status, String reason) {
        super(status, reason);
    }
}
