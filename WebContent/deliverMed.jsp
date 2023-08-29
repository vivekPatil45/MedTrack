<%@page import="com.medtrack.db.*" %>
<%@page import="java.sql.*" %>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Deliver med</title>
</head>
<body>
	<%
		try{
			String id= request.getParameter("oid");
			int oid=Integer.parseInt(id);
			Connection con = ConnectDB.connect();
			PreparedStatement ps= con.prepareStatement("update order_tbl set ostatus=? where oid=?");
			ps.setString(1, "delivered");
			ps.setInt(2, oid);
			
			int i= ps.executeUpdate();
			if(i>0){
				response.sendRedirect("orderMedicine.jsp");
			}else{
				response.sendRedirect("orderMedicine.jsp");
				System.out.println("Unsuccessful in Delivered");
			}
		}catch(Exception e)
		{
			System.out.println("something went wrong in  deliverMed");
			e.printStackTrace();
		}
	%>
</body>
</html>