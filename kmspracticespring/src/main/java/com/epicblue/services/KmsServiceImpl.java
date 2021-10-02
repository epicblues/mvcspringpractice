package com.epicblue.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.epicblue.repositories.KmsDao;
import com.epicblue.repositories.KmsVo;

@Service
public class KmsServiceImpl implements KmsService {

	@Autowired
	private KmsDao kmsDaoImpl;
	
	@Override
	public int join(KmsVo vo) {
		
		int resultNum = kmsDaoImpl.join(vo);
		return resultNum;
	}

	@Override
	public KmsVo login(String email, String password) {
		KmsVo vo = kmsDaoImpl.login(email, password);
		return vo;
	}

	@Override
	public KmsVo checkemail(String email) {
		KmsVo vo = kmsDaoImpl.checkEmail(email);
		return vo;
	}

}
