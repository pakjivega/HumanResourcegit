<%@page import="com.pakjivega.prototypehumanresource.bo.dao.BasicDao"%>
<%@page import="javax.persistence.Basic"%>
<%@page import="com.pakjivega.prototypehumanresource.bo.dao.EmployeeDao"%>
<%@page import="java.util.List"%>
<%@page import="com.pakjivega.prototypehumanresource.bo.bean.Employee"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<body>
	<fieldset>
		<legend>List Employees:</legend>
		<table border="1">
			<tr>
			<th>Delete</th>
			<th>Id</th>
			<th>Name</th>
			<th>Agency</th>
			<th>DOB</th>
			</tr>
			<c:forEach items="${employees}" var="employee">
				<tr>	
					<td>
						<a href="<c:url value="Delete?id=${employee.id}"></c:url>">Delete</a>
					</td>
					<td>
						<c:out value="${employee.id}"/>
					</td>
					<td>
						<c:out value="${employee.name}"/>
					</td>
					<td>
						<c:out value="${employee.agency}"/>
					</td>
					<td>
						<c:out value="${employee.dateofbirth}"/>
					</td>
				</tr>
			</c:forEach>
		</table>
	</fieldset>
	<a href="New">New Employee</a>
</body>
</html>