package com.pakjivega.prototypehumanresource;

import java.util.List;

public class Employee {
	private int id;
	private String name;
	private String agency;
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getAgency() {
		return agency;
	}
	public void setAgency(String agency) {
		this.agency = agency;
	}
	public void save() {
		String querySQL = "insert into employee  ( id, name, agency ) values ( " + this.id + " , '" + this.name + "',  '" + this.agency + "' ) ";
		DatabaseConnect<Employee> db = new DatabaseConnect<Employee>();
		db.updateRow(querySQL);
	}
	public static List<Employee> selectEmployees() {
		String querySQL= "select id, name, agency from employee ";
		DatabaseConnect<Employee> db = new DatabaseConnect<Employee>();
		List<Employee> listEmployees = db.selectRows(querySQL, Employee.class);
		return listEmployees;
	}
}
