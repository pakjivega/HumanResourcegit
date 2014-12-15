<%@page import="com.pakjivega.prototypehumanresource.bo.dao.impl.AgencyDaoImpl"%>
<%@page import="com.pakjivega.prototypehumanresource.bo.dao.AgencyDao"%>
<%@page import="java.util.List"%>
<%@page import="com.pakjivega.prototypehumanresource.bo.bean.Agency"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>

<body>
	<fieldset>
	<legend>List Agencies:</legend>
	<%
		AgencyDao agencyDao = new AgencyDaoImpl();
		List<Agency> listAgencies = agencyDao.getAllAgency();
	%>
	<table border="1">
		<tr>
		<th>Id</th>
		<th>Name</th>
		</tr>
		<%
		for(Agency agency:listAgencies){ 
	%>
	<tr>
				<td><%=agency.getId()%></td>
				<td><%=agency.getName()%></td>
	 </td></tr>
	<%
			} 
	%>
	</table>
	</fieldset>
	
	<a href="NewAgency.jsp">New Agency</a>
</body>
</html>