package com.pakjivega.prototypehumanresource.controller;

import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.pakjivega.prototypehumanresource.bo.bean.Employee;
import com.pakjivega.prototypehumanresource.bo.dao.BasicDao;
import com.pakjivega.prototypehumanresource.service.EmployeeService;
import com.pakjivega.prototypehumanresource.service.EmployeeServiceImpl;

@Controller
@RequestMapping("/Employee/")
public class EmployeeController {
	
	private EmployeeService employeeService = new EmployeeServiceImpl();
	private static String LIST_EMPLOYEES = "ListEmploye";
	@RequestMapping(method = RequestMethod.GET)
	public String listEmployee(ModelMap model){
		List<Employee> employees = employeeService.listEmployees();
		model.addAttribute("employees", employees);
		return LIST_EMPLOYEES;
	}
	
	@RequestMapping(value ="/New",method = RequestMethod.GET)
	public String newEmployee(ModelMap model){
		return "NewEmployee";
	}
	@RequestMapping(value ="/InsertEmployee",method = RequestMethod.POST)
	public String insertEmployee(Employee employee){
		employeeService.save(employee);
		return "redirect:/Employee/";
	}

	@RequestMapping(value ="/Delete",method = RequestMethod.GET)
	public String deleteEmployee(@RequestParam("id") int id){
		employeeService.delete(id);
		return "redirect:/Employee/";
	}
}
