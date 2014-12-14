<%@page import="com.pakjivega.prototypehumanresource.bean.Agency"%>
<%

String id= request.getParameter("id");
String name= request.getParameter("name");


Agency agency = new Agency();
agency.setId(Integer.valueOf(id));
agency.setName(name);
agency.save();
response.sendRedirect("ListAgency.jsp");
%>