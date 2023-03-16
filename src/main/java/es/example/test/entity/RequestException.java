package es.example.test.entity;

import lombok.Data;
import lombok.EqualsAndHashCode;

@Data
@EqualsAndHashCode(callSuper = true)
public class RequestException extends RuntimeException{

	private static final long serialVersionUID = 1L;
	
	private String code;

	public RequestException(String code, String message) {
		super(message);
		this.code = code;
	}	
}