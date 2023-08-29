<%@page import="com.medtrack.db.*" %>
<%@page import="java.sql.*" %>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Approve</title>
</head>
<body>
	<%
		try{
			String id= request.getParameter("mid");
			int mid=Integer.parseInt(id);
			Connection con = ConnectDB.connect();
			PreparedStatement ps= con.prepareStatement("update medical_tbl set mstatus = ? where mid = ?");
			String mstatus = "approve";
			ps.setString(1, mstatus);
			ps.setInt(2, mid);
			//ps.setString(2, uemail);
			int i= ps.executeUpdate();
			if(i>0){
				response.sendRedirect("approveMedicals.jsp");
			}else{
				response.sendRedirect("approveMedical.jsp");
				System.out.println("Unsuccessful in delete");
			}
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	%>
</body>
</html>