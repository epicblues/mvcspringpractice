package com.epicblue.exceptions;

import com.epicblue.repositories.KmsVo;

public class KmsException extends RuntimeException{
	
	private KmsVo vo;
	
	
	public KmsException() {
		super();
	}
	
	public KmsException(String message, KmsVo causeObject) {
		super(message + "This is Kms Exception");
		this.vo = causeObject;
	}

	public KmsVo getVo() {
		return vo;
	}

	public void setVo(KmsVo vo) {
		this.vo = vo;
	}
	
	
	
	
}
