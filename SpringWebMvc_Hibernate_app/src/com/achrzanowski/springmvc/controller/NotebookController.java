package com.achrzanowski.springmvc.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.achrzanowski.springmvc.dao.NotebookDAO;
import com.achrzanowski.springmvc.entity.Notebook;

@Controller
@RequestMapping("/notebook")
public class NotebookController {

	@Autowired
	private NotebookDAO notebookDAO;
	
	@RequestMapping("/list")
	public String listNotebooks(Model theModel) {
		
		List<Notebook> theNotebooks = notebookDAO.getNotebook();
		
		theModel.addAttribute("notebooks", theNotebooks);
		
		return "list-notebooks";
	}
}
