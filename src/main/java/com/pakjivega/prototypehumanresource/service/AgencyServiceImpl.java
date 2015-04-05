package com.pakjivega.prototypehumanresource.service;

import java.util.List;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.pakjivega.prototypehumanresource.bo.bean.Agency;
import com.pakjivega.prototypehumanresource.bo.bean.Employee;
import com.pakjivega.prototypehumanresource.bo.dao.BasicDao;

public class AgencyServiceImpl implements AgencyService{

	private BasicDao<Agency> agencyDao= null;
	
	public AgencyServiceImpl() {
		ClassPathXmlApplicationContext factoria =
		new  ClassPathXmlApplicationContext("contextHumanResource.xml");
		agencyDao = (BasicDao)factoria.getBean("agencyDAO");
	}
	
	@Override
	public Agency save(Agency agency) {
		return this.agencyDao.save(agency);
	}

	@Override
	public List<Agency> listAgencies() {
		// TODO Auto-generated method stub
		List<Agency> agencies = agencyDao.getAll(Agency.class);
		return agencies;
	}

}
