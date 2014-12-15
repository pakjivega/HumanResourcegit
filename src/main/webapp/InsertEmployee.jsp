<%@page import="com.pakjivega.prototypehumanresource.bo.dao.impl.EmployeeDaoImpl"%>
<%@page import="com.pakjivega.prototypehumanresource.bo.dao.EmployeeDao"%>
<%@page import="java.text.SimpleDateFormat"%>
<%@page import="java.util.Date"%>
<%@page import="com.pakjivega.prototypehumanresource.bo.bean.Employee"%>
<%
SimpleDateFormat formatter = new SimpleDateFormat("dd-MM-yyyy");

String id= request.getParameter("id");
String name= request.getParameter("name");
String dateofbirthString= request.getParameter("dateofbirth");
String agency= request.getParameter("agency");

Date dateofbirth =  formatter.parse(dateofbirthString);

Employee employee = new Employee();
employee.setId(Integer.valueOf(id));
employee.setName(name);
employee.setAgency(agency);
employee.setDateOfBirth(dateofbirth);
EmployeeDao employeeDao = new EmployeeDaoImpl();
System.out.println("Employee: " + employee);
employeeDao.updateEmployee(employee);

response.sendRedirect("ListEmployees.jsp");
%>