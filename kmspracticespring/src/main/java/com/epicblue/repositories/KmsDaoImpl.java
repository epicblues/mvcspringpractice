package com.epicblue.repositories;

import java.util.HashMap;
import java.util.Map;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Repository;

@Repository
public class KmsDaoImpl implements KmsDao {

	@Autowired
	@Qualifier("kmsSqlSession")
	private SqlSession sqlSession;
	
	@Override
	public int join(KmsVo vo) {
		int result = sqlSession.insert("user.join", vo);
		return result;
	}

	@Override
	public KmsVo login(String email, String password) {
		
		Map<String, String> map = new HashMap<String,String>();
		map.put("email", email);
		map.put("password", password);
		KmsVo vo = sqlSession.selectOne("user.login", map);
		return vo;
	}

}
