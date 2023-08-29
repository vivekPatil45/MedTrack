<%@page import="com.medtrack.db.*" %>
<%@page import="com.medtrack.services.*" %>
<%@page import="java.sql.*" %>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Buy</title>
</head>
<body>
	<%
		String uemail = request.getParameter("uemail");
		String id = request.getParameter("med_id");
		int med_id = Integer.parseInt(id);
		String memail = request.getParameter("memail");
		
		try{
			Connection con = ConnectDB.connect();
			PreparedStatement ps = con.prepareStatement("insert into order_tbl values (?,?,?,?,?)");
			ps.setInt(1, 0);
			ps.setString(2, uemail);
			ps.setString(3, memail);
			ps.setInt(4, med_id);
			ps.setString(5, "pending");
			int i = ps.executeUpdate();
			if(i>0)
			{
				System.out.println("Buy Successfuly");
				response.sendRedirect("viewAllMedicine.jsp");
			}
			else{
				System.out.println("Buy UNSuccessfuly");
			}
		}catch(Exception e)
		{
			System.out.println("failed in buy.jsp");
			e.printStackTrace();
		}
	%>
</body>
</html>