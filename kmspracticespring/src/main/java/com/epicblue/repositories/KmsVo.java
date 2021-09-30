package com.epicblue.repositories;

import java.util.Date;

public class KmsVo {
	private long no;
	private String name;
	private String email;
	private String password;
	private Date regDate;
	public KmsVo() {
		System.out.println(KmsVo.class + " instance constructed by sqlSession");
	}
	
	public KmsVo(String name, String email, String password) {
		this.email=email;
		this.name=name;
		this.password=password;
	}
	
	public long getNo() {
		return no;
	}
	public void setNo(long no) {
		this.no = no;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public Date getRegDate() {
		return regDate;
	}
	public void setRegDate(Date regDate) {
		this.regDate = regDate;
	}
	@Override
	public String toString() {
		return "KmsVo [no=" + no + ", name=" + name + ", email=" + email + ", password=" + password + ", regDate="
				+ regDate + "]";
	}
	
	
}
