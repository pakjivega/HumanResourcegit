<%@page import="com.pakjivega.prototypehumanresource.bo.dao.BasicDao"%>
<%@page import="javax.persistence.Basic"%>
<%@page import="com.pakjivega.prototypehumanresource.bo.dao.impl.EmployeeDaoImpl"%>
<%@page import="com.pakjivega.prototypehumanresource.bo.dao.EmployeeDao"%>
<%@page import="java.util.List"%>
<%@page import="com.pakjivega.prototypehumanresource.bo.bean.Employee"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>

<body>
	<fieldset>
		<legend>List Employees:</legend>
		<%
			BasicDao basicDao = new EmployeeDaoImpl();
			List<Employee> listEmployees = basicDao.getAll(Employee.class) ;//employeeDao.getAllEmployee();
		%>
		<table border="1">
			<tr>
			<th>Id</th>
			<th>Name</th>
			<th>Agency</th>
			<th>DOB</th>
			</tr>
			<%
				for (Employee employee : listEmployees) {
			%>
			<tr>
				<td><%=employee.getId()%>
			</td>
			<td><%=employee.getName()%>
			</td>
			<td><%=employee.getAgency()%>
			</td>
			<td><%=employee.getDateOfBirth()%>
			 </td></tr>
	<%
		}
	%>
	</table>
	</fieldset>
	
	<a href="NewEmployee.jsp">New Employee</a>

			</body>
</html>