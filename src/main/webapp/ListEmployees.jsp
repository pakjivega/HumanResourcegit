<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ page import="java.sql.ResultSet"%>
<%@ page import="java.sql.SQLException"%>
<%@ page import="com.pakjivega.prototypehumanresource.DatabaseConnect"%>

<body>
	<fieldset>
	<legend>List Employees</legend>
	<%
		ResultSet rs = null;
		 	try {
		String querySQL = "select id, name, dateofbirth, agency from employee";
		DatabaseConnect dbConnect = new DatabaseConnect();
		rs = dbConnect.selectRows(querySQL);
		
		while (rs.next()) {
	%>
	<%=rs.getString("id")%>
	<%=rs.getString("name")%>
	<%=rs.getString("agency")%>
	<br />
	<%
			}
		} catch (SQLException e) {
			System.out.println("Error accessing to the data: " + e.getMessage());
		} 
		finally {
			if (rs != null) {
				try {
					rs.close();
				} catch (SQLException e) {
					System.out.println("Error closing the resulset: " + e.getMessage());
				}
			}
		} 
	%>
	</fieldset>
	
	<a href="NewEmployee.jsp">New Employee</a>
</body>
</html>