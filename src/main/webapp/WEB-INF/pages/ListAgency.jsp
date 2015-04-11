<%@page import="com.pakjivega.prototypehumanresource.bo.dao.BasicDao"%>
<%@page import="com.pakjivega.prototypehumanresource.bo.dao.AgencyDao"%>
<%@page import="java.util.List"%>
<%@page import="com.pakjivega.prototypehumanresource.bo.bean.Agency"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<body>
	<fieldset>
	<legend>List Agencies:</legend>
	<table border="1">
		<tr>
		<th>Id</th>
		<th>Name</th>
		</tr>
		<c:forEach items="${agencies}" var="agency">
			<tr>
				<td><c:out value="${agency.id}"/></td>
				<td><c:out value="${agency.name}"/></td>
	 		</tr>
		</c:forEach>
	</table>
	</fieldset>
	<a href="New">New Agency</a>
</body>
</html>