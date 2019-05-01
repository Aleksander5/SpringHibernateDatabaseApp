package com.achrzanowski.springmvc.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.achrzanowski.springmvc.dao.ManufacturerDAO;
import com.achrzanowski.springmvc.entity.Manufacturer;

@Controller
@RequestMapping("/manufacturer")
public class ManufacturerController {
	
	@Autowired
	private ManufacturerDAO manufacturerDAO;
	
	@RequestMapping("/list")
	public String listManufacturers(Model theModel) {
		
		List<Manufacturer> theManufacturers = manufacturerDAO.getManufacturer();
		
		theModel.addAttribute("manufacturers", theManufacturers);
		
		return "list-manufacturers";
	}
	
	@RequestMapping("/showFormForAddManufacturer")
	public String showFormForAddManufacturer(Model theModel) {
		
		Manufacturer theManufacturer = new Manufacturer();
		
		theModel.addAttribute("manufacturer", theManufacturer);
		
		return "manufacturer-form";
	}
	
	@PostMapping("/saveManufacturer")
	public String saveCustomer(@ModelAttribute("manufacturer") Manufacturer theManufacturer) {
		
		System.out.println(theManufacturer.toString());
		
		ManufacturerDAO manufacturerDAO = new ManufacturerDAO();
		
		manufacturerDAO.saveManufacturer(theManufacturer);
		
		return "redirect:/manufacturer/list";
	}
}
