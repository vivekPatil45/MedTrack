<%@page import="com.medtrack.db.*" %>
<%@page import="com.medtrack.services.*" %>
<%@page import="java.sql.*" %>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>DeleteMed</title>
</head>
<body>
	<%
				try{
					String id = request.getParameter("med_id");
					int med_id = Integer.parseInt(id);
					
					Connection con = ConnectDB.connect();

					PreparedStatement ps = con.prepareStatement("delete from medicine_tbl where med_id =? ");
					
					ps.setInt(1, med_id);
					
					int i = ps.executeUpdate();
					if(i>0)
					{
						System.out.println("Delete Medicine successfuly");
						response.sendRedirect("medview.jsp");
						
					}
					else
					{
						System.out.println("Delete Medicine Unsuccessfuly");
						response.sendRedirect("medview.jsp");
					}
				}catch(Exception e)
				{
					System.out.println("Something went wrong in updateMed.jsp");
					e.printStackTrace();
				}
			%>
</body>
</html>