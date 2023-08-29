package com.medtrack.services;

import java.io.IOException;
import java.sql.*;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.medtrack.db.ConnectDB;

/**
 * Servlet implementation class UserLogin
 */
public class UserLogin extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public UserLogin() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
		
		try{
			
			
			
			String uemail = request.getParameter("uemail");
			String upassword = request.getParameter("upassword");		
			
			Connection con = ConnectDB.connect();
			PreparedStatement ps = con.prepareStatement("select * from users_tbl where uemail = ? and upassword = ?");				
			ps.setString(1, uemail);
			ps.setString(2, upassword);
			ResultSet rs = ps.executeQuery();
			if(rs.next())
			{
				String uname = rs.getString("uname");
				System.out.println("User login successfuly");
				UserInfo.setUemail(uemail);
				UserInfo.setUname(uname);
				response.sendRedirect("UpdateLocation.html");
					
			}
			else
			{
					
				UserInfo.setFlag1(true);
				response.sendRedirect("ulogin.jsp");
				System.out.println("UnSuccessful user Login");
	
			}
			
		}catch(Exception e)
		{
			System.out.println("Something problem in UserLogin");
			e.printStackTrace();
		}
	}

}
