package com.pakjivega.prototypehumanresource.service;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.pakjivega.prototypehumanresource.bo.dao.BasicDao;

public class BaseService {
	protected ClassPathXmlApplicationContext factoria;
			
	public BaseService(){
		factoria =	new  ClassPathXmlApplicationContext("contextHumanResource.xml");	
	}
}
