package com.tothenew.bluebox.bluebox.exception;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(HttpStatus.FOUND)
public class CategoryAlreadyExistsException extends RuntimeException {

  public CategoryAlreadyExistsException(String message) {
    super(message);
  }
}
