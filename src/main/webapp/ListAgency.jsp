<%@page import="java.util.List"%>
<%@page import="com.pakjivega.prototypehumanresource.bean.Agency"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>

<body>
	<fieldset>
	<legend>List Agencies:</legend>
	<%
		List<Agency> listAgencies = Agency.selectAgencies();
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