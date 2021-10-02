package com.epicblue.exceptions;

import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;

@ControllerAdvice
public class GlobalExceptionHandler {
	
	@ExceptionHandler(KmsException.class)
	@ResponseBody
	public String handleKmsException( KmsException e) {
		
		
		String result = null;
		result += e.getMessage();
		result += e.getVo();
		return result;
	}
}
