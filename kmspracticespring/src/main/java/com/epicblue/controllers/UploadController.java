package com.epicblue.controllers;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Calendar;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.MultipartFile;

@Controller
public class UploadController {
	
	private static final String FILE_STORAGE = "C:/upload/"; 
	
	
	@RequestMapping(value="/upload", method=RequestMethod.GET)
	public String upload() {
		return "upload";
	}
	
	
	@RequestMapping(value="/upload", method=RequestMethod.POST)
	public String upload(@RequestParam("file") MultipartFile file, Model model) throws IOException {
		String originalName = file.getOriginalFilename();
		String ext = originalName.substring(originalName.lastIndexOf("."), originalName.length());
		String newFileName = "byKms" + Calendar.getInstance().getTimeInMillis() / 1000 + ext;
		FileOutputStream fos = new FileOutputStream(FILE_STORAGE + newFileName);
		fos.write(file.getBytes());
		fos.flush();
		fos.close();
		
		model.addAttribute("fileUrl",newFileName);
		
		
		return "/success";
	}
}
