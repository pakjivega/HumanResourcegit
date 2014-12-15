<%@page import="com.pakjivega.prototypehumanresource.bo.dao.impl.AgencyDaoImpl"%>
<%@page import="com.pakjivega.prototypehumanresource.bo.dao.AgencyDao"%>
<%@page import="com.pakjivega.prototypehumanresource.bo.bean.Agency"%>
<%

String id= request.getParameter("id");
String name= request.getParameter("name");


Agency agency = new Agency();
agency.setId(Integer.valueOf(id));
agency.setName(name);
AgencyDao agencyDao = new AgencyDaoImpl();
agencyDao.updateAgency(agency);
response.sendRedirect("ListAgency.jsp");
%>