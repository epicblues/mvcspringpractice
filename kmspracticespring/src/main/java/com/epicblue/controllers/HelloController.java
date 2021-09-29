package com.epicblue.controllers;

import java.util.LinkedList;
import java.util.List;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.epicblue.repositories.KmsVo;

@Controller
public class HelloController {
	
	
	
	public HelloController() {
		System.out.println(HelloController.class + " constructed");
	}
	
	@RequestMapping({"/", "/index"})
	public String root(@RequestParam(value="name", defaultValue ="default!",required = false) String name,
			Model model) {
		
		List<KmsVo> list = new LinkedList<KmsVo>();
		for(int i = 0; i < 10; i++) {
			list.add(new KmsVo("kms" + i, i, "epicblue@hanmail" + i + ".net"));
		}
		
		model.addAttribute("name", name);
		model.addAttribute("num1", 5);
		model.addAttribute("num2", 10);
		model.addAttribute("kmsList",list);
		
		return "hello";
	}
	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "muyaho";
	}
}
