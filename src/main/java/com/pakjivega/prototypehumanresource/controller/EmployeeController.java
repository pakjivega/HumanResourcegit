package com.pakjivega.prototypehumanresource.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
@RequestMapping("/Employee")
public class EmployeeController {
	@RequestMapping(method = RequestMethod.GET)
	public String listEmployee(ModelMap model){
		return "ListEmployees";
	}
	
	@RequestMapping(value ="/New",method = RequestMethod.GET)
	public String newEmployee(ModelMap model){
		return "NewEmployee";
	}
	@RequestMapping(value ="/InsertEmployee",method = RequestMethod.GET)
	public String insertEmployee(ModelMap model){
		
		return "ListEmployees";
	}
	
}
