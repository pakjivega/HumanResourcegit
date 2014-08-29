<%@page import="com.pakjivega.prototypehumanresource.Employee"%>

<%
String id= request.getParameter("id");
String name= request.getParameter("name");
String dateofbirth= request.getParameter("dateofbirth");
String agency= request.getParameter("agency");


String insertSQL= "insert into employee (id, name, agency) values ";
insertSQL+= "(" +id+ ",'" +name + "','" +agency+"')";
Employee employee = new Employee();
employee.setId(Integer.valueOf(id));
employee.setName(name);
employee.setAgency(agency);
employee.save();
response.sendRedirect("ListEmployees.jsp");
%>