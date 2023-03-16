package es.example.test.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

import es.example.test.entity.ErrorDto;
import es.example.test.entity.RequestException;


@RestControllerAdvice
public class ControllerAdvice {

	@ExceptionHandler(value = RuntimeException.class)
	public ResponseEntity<ErrorDto> runtimeExceptionHandler(RuntimeException ex) {
		
		//Codigo de errores personalizados
		ErrorDto error = ErrorDto.builder().code("P-500").message("Server Error").build();
		return new ResponseEntity<>(error, HttpStatus.BAD_REQUEST);
	}

	@ExceptionHandler(value = RequestException.class)
	public ResponseEntity<ErrorDto> requestExceptionHandler(RequestException ex) {
		
		ErrorDto error = ErrorDto.builder().code(ex.getCode()).message("Server Error").build();
		return new ResponseEntity<>(error, HttpStatus.BAD_REQUEST);
	}

//	@ExceptionHandler(value = BusinessException.class)
//	public ResponseEntity<ErrorDto> businessExceptionHandler(BusinessException ex) {
//		
//		ErrorDto error = ErrorDto.builder().code(ex.getCode()).message("Server Error").build();
//		return new ResponseEntity<>(error, ex.getStatus());
//	}
}