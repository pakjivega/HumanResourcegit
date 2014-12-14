<%@page import="java.util.List"%>
<%@page import="com.pakjivega.prototypehumanresource.bean.Agency"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>

<body>
	<fieldset>
	<legend>List Agencies:</legend>
	<%
		List<Agency> listAgencies = Agency.selectAgencies();
		
		for(Agency agency:listAgencies){ 
	%>
	<%=agency.getId()%>
	<%=agency.getName()%>
	<br />
	<%
			} 
	%>
	</fieldset>
	
	<a href="NewAgency.jsp">New Agency</a>
</body>
</html>