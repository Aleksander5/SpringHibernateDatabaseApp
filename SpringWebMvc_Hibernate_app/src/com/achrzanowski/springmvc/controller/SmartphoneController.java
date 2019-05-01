package com.achrzanowski.springmvc.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.achrzanowski.springmvc.dao.SmartphoneDAO;
import com.achrzanowski.springmvc.entity.Smartphone;

@Controller
@RequestMapping("/smartphone")
public class SmartphoneController {

	@Autowired
	private SmartphoneDAO smartphoneDAO;
	
	@RequestMapping("/list")
	public String listSmartphones(Model theModel) {
		
		List<Smartphone> theSmartphones = smartphoneDAO.getSmartphone();
		
		theModel.addAttribute("smartphones", theSmartphones);
		
		return "list-smartphones";
	}
}
