package com.pakjivega.prototypehumanresource.controller;

import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.pakjivega.prototypehumanresource.bo.bean.Agency;
import com.pakjivega.prototypehumanresource.bo.bean.Employee;
import com.pakjivega.prototypehumanresource.bo.dao.BasicDao;
import com.pakjivega.prototypehumanresource.bo.dao.impl.AgencyDaoImpl;
import com.pakjivega.prototypehumanresource.bo.dao.impl.EmployeeDaoImpl;
import com.pakjivega.prototypehumanresource.service.AgencyService;
import com.pakjivega.prototypehumanresource.service.AgencyServiceImpl;
import com.pakjivega.prototypehumanresource.service.EmployeeService;
import com.pakjivega.prototypehumanresource.service.EmployeeServiceImpl;

@Controller
@RequestMapping("/Agency")
public class AgencyController {
	
	private AgencyService agencyService = new AgencyServiceImpl();
	private static String LIST_AGENCIES = "ListAgency";
	@RequestMapping(method = RequestMethod.GET)
	public String listAgency(ModelMap model){
		List<Agency> agencies = agencyService.listAgencies();
		model.addAttribute("agencies", agencies);
		return LIST_AGENCIES;
	}
	
	@RequestMapping(value ="/New",method = RequestMethod.GET)
	public String newAgency(ModelMap model){
		return "NewAgency";
	}
	@RequestMapping(value ="/InsertAgency",method = RequestMethod.POST)
	public String insertAgency(Agency agency){
		BasicDao<Agency> agencyDao = new AgencyDaoImpl();
		agencyDao.save(agency);
		return "redirect:/Agency/";
	}
}
