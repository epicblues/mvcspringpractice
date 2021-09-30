package com.epicblue.controllers;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.epicblue.repositories.KmsVo;
import com.epicblue.services.KmsService;

@Controller
public class UserController {
	
	@Autowired
	private KmsService kmsServiceImpl;
	
	
	@RequestMapping({"","/"})
	public String join() {
		
		return "join";
	}
	
	@RequestMapping(value="/join", method=RequestMethod.POST)
	public String joinForm(@ModelAttribute KmsVo vo) {
		
		int result = kmsServiceImpl.join(vo);
		
		if(result != 1) {
			return "redirect:/";
		}
		return "hello";
	}
	
	@RequestMapping(value="/login", method=RequestMethod.POST)
	public String joinForm(@RequestParam String email, @RequestParam String password, HttpSession session) {
		
		KmsVo authUser = kmsServiceImpl.login(email, password);
		
		if(authUser != null) {
			session.setAttribute("authUser", authUser.getName());
		}
		
		return "redirect:/";
	}
}