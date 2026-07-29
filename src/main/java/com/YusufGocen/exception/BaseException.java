package com.YusufGocen.exception;

public class BaseException extends RuntimeException{
	
	public BaseException(ErrorMessage errorMessage) {
		super(errorMessage.prepareErrorMesage());
	}
}
