package com.epicblue.controllers;

import java.util.HashMap;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.epicblue.repositories.KmsVo;
import com.epicblue.services.KmsService;

@RestController
@RequestMapping("/api")
public class ApiController {
	
	@Autowired
	private KmsService kmsServiceImpl;
	
	@RequestMapping(value="/checkemail", method=RequestMethod.POST)
	public Object checkEmail(@RequestBody Map<String,Object> email) {
		KmsVo result = kmsServiceImpl.checkemail((String)email.get("email"));
		
		if(result == null) {
			return new HashMap<String,String>(); 
		}
		
		return result;	
	}
}
