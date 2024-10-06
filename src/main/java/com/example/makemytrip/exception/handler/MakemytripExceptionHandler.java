package com.example.makemytrip.exception.handler;

import com.example.makemytrip.exception.MakemytripException;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

@ControllerAdvice
public class MakemytripExceptionHandler {

        @ExceptionHandler(MakemytripException.class)
        public ResponseEntity<String> handleApplicationException(MakemytripException ex) {

            return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).body(ex.getMessage());
        }
}
