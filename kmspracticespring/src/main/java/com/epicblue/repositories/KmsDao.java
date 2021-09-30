package com.epicblue.repositories;

public interface KmsDao {
	
	public int join(KmsVo vo);
	public KmsVo login(String email, String password);
}
