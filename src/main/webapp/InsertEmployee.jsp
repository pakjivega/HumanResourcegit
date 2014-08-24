<%@page import="com.pakjivega.prototypehumanresource.DatabaseConnect"%>
<%
String id= request.getParameter("id");
String name= request.getParameter("name");
String dateofbirth= request.getParameter("dateofbirth");
String agency= request.getParameter("agency");


String insertSQL= "insert into employee (id, name, agency) values ";
insertSQL+= "('" +id+ "','" +name + "','" +agency+"')";
DatabaseConnect db= new DatabaseConnect();
int rows=db.updateRow(insertSQL);
response.sendRedirect("ListEmployees.jsp");
%>