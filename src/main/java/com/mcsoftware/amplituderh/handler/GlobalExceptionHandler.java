package com.mcsoftware.amplituderh.handler;

import com.mcsoftware.amplituderh.exception.ObjectValidationException;
import com.mcsoftware.amplituderh.exception.OperationNonPermittedException;
import org.springframework.dao.DataIntegrityViolationException;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

import javax.persistence.EntityNotFoundException;

/**
 * @author cyrille.mbassi
 */
@RestControllerAdvice
public class GlobalExceptionHandler {

  @ExceptionHandler({ObjectValidationException.class})
  public ResponseEntity<ExceptionRepresentation> handleException(ObjectValidationException exception) {
    ExceptionRepresentation representation = ExceptionRepresentation.builder()
        .errorMessage("Object not valid exception has occurred")
        .errorSource(exception.getViolationSource())
        .validationErrors(exception.getViolations())
        .build();
    return ResponseEntity
        .status(HttpStatus.BAD_REQUEST)
        .contentType(MediaType.APPLICATION_JSON)
        .body(representation);
  }

  @ExceptionHandler(EntityNotFoundException.class)
  public ResponseEntity<ExceptionRepresentation> handleException(EntityNotFoundException exception) {
    ExceptionRepresentation representation = ExceptionRepresentation.builder()
        .errorMessage(exception.getMessage())
        .build();
    return ResponseEntity
        .status(HttpStatus.NOT_FOUND)
        .body(representation);
  }

  @ExceptionHandler(OperationNonPermittedException.class)
  public ResponseEntity<ExceptionRepresentation> handleException(OperationNonPermittedException exception) {
    ExceptionRepresentation representation = ExceptionRepresentation.builder()
        .errorMessage(exception.getErrorMsg())
        .build();
    return ResponseEntity
        .status(HttpStatus.NOT_ACCEPTABLE)
        .body(representation);
  }

  @ExceptionHandler(DataIntegrityViolationException.class)
  public ResponseEntity<ExceptionRepresentation> handleException() {
    ExceptionRepresentation representation = ExceptionRepresentation.builder()
        .errorMessage("A user already exists with the provided Email")
        .build();
    return ResponseEntity
        .status(HttpStatus.BAD_REQUEST)
        .body(representation);
  }


}
