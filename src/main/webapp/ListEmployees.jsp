<%@page import="java.util.List"%>
<%@page import="com.pakjivega.prototypehumanresource.Employee"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>

<body>
	<fieldset>
	<legend>List Employees:</legend>
	<%
		List<Employee> listEmployees = Employee.selectEmployees();
		
		for(Employee employee:listEmployees){ 
	%>
	<%=employee.getId()%>
	<%=employee.getName()%>
	<%=employee.getAgency()%>
	<%=employee.getDateOfBirth()%>
	<br />
	<%
			} 
	%>
	</fieldset>
	
	<a href="NewEmployee.jsp">New Employee</a>
</body>
</html>