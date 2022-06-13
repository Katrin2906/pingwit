package pingwit.homework_26.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

import java.nio.file.AccessDeniedException;

@ControllerAdvice
public class PingwitControllerAdvice {

    @ExceptionHandler
    public ResponseEntity<String> handle(AccessDeniedException e) {
        e.printStackTrace();
        return ResponseEntity.status(HttpStatus.GATEWAY_TIMEOUT).body("Izvinite, polomalsya AccessDeniedException");
    }

    @ExceptionHandler
    public ResponseEntity<String> handle(Exception e) {
        e.printStackTrace();
        return ResponseEntity.status(HttpStatus.GATEWAY_TIMEOUT).body("Izvinite, polomalsya Exception");
    }
}