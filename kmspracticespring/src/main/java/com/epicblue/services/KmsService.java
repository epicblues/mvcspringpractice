package com.epicblue.services;

import com.epicblue.repositories.KmsVo;

public interface KmsService {
	
	public int join(KmsVo vo);
	public KmsVo login(String email, String password);
	public KmsVo checkemail(String email);
}
