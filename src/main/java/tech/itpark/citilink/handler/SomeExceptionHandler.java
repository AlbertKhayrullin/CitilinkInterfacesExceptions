package tech.itpark.citilink.handler;

import lombok.AllArgsConstructor;
import lombok.Data;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.servlet.mvc.method.annotation.ResponseEntityExceptionHandler;
import tech.itpark.citilink.exception.IdNotFoundException;

@ControllerAdvice
public class SomeExceptionHandler extends ResponseEntityExceptionHandler {
    @ExceptionHandler(IdNotFoundException.class)
    protected ResponseEntity<SomeException> handleIdNotFoundException() {
        return new ResponseEntity<>(new SomeException("Sorry, an error was happened, such Id not found"), HttpStatus.NOT_FOUND);
    }
    @Data
    @AllArgsConstructor
    private static class SomeException {
        private String message;
    }
}
