package com.helter.restapiforgithub.error;

import org.springframework.http.HttpStatus;

public record ErrorResponseDto(HttpStatus status, String message) { 
}
