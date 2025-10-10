package com.demo.demo.exception;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

import com.demo.demo.pojo.ResponseMessage;

import jakarta.servlet.http.HttpServletRequest;

@RestControllerAdvice
public class advice {

  Logger log = LoggerFactory.getLogger(advice.class);

  @ExceptionHandler(Exception.class)
  public ResponseMessage handleException(Exception e, HttpServletRequest request) {
      log.error("Unhandled exception on {}", request.getRequestURI(), e);
      // adjust to your real constructor or builder
      return new ResponseMessage(500, "error", null);
      // or: return ResponseMessage.builder().code(500).message("error").data(null).build();
  }
}
