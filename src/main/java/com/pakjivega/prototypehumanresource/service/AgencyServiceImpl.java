package com.pakjivega.prototypehumanresource.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.stereotype.Service;

import com.pakjivega.prototypehumanresource.bo.bean.Agency;
import com.pakjivega.prototypehumanresource.bo.bean.Employee;
import com.pakjivega.prototypehumanresource.bo.dao.BasicDao;

@Service
public class AgencyServiceImpl extends BaseService implements AgencyService  {
	@Autowired
	private BasicDao<Agency> agencyDao;
	
	public AgencyServiceImpl() {
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
