package com.epicblue.repositories;

public class KmsVo {
	String name;
	long no;
	String email;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public long getNo() {
		return no;
	}
	public void setNo(long no) {
		this.no = no;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	
	public KmsVo() {
		// TODO Auto-generated constructor stub
	}
	public KmsVo(String name, long no, String email) {
		
		this.name = name;
		this.no = no;
		this.email = email;
	}
	
	
}
