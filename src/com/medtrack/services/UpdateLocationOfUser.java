package com.medtrack.services;

import java.io.IOException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.*;
import com.medtrack.db.ConnectDB;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.medtrack.db.ConnectDB;

/**
 * Servlet implementation class UpdateLocationOfUser
 */
public class UpdateLocationOfUser extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public UpdateLocationOfUser() {
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
			
			String uemail =  UserInfo.getUemail();
			String upassword = UserInfo.getUname();
			String ulatitude = request.getParameter("ulatitude");
			String ulongitude = request.getParameter("ulongitude");
			Connection con = ConnectDB.connect();
			PreparedStatement ps = con.prepareStatement("update users_tbl set ulongitude = ?, ulatitude = ?  where uemail = ?");				
			ps.setString(1, ulongitude);
			ps.setString(2, ulatitude);
			ps.setString(3, uemail);
//			ps.setString(4, upassword);
			int i = ps.executeUpdate();
			System.out.println(uemail);
			System.out.println(upassword);
			System.out.println(ulatitude);
			System.out.println(ulongitude);
			if(i>0)
			{
				UserInfo.setUlatitude(Double.parseDouble(ulatitude));
				UserInfo.setUlongitude(Double.parseDouble(ulongitude));
				
				System.out.println("user Location Update successfuly");			
				response.sendRedirect("user.jsp");
					
			}
			else
			{					
				UserInfo.setFlag1(true);
				System.out.println("user Location Update Unsuccessfuly");	
				response.sendRedirect("ulogin.jsp");
				
	
			}
			
		}catch(Exception e)
		{
			System.out.println("Something problem in UpdateLocationOfUser");
			e.printStackTrace();
		}
		
		
	}

}
