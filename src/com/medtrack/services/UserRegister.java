package com.medtrack.services;

import java.io.IOException;
import java.sql.*;
import java.sql.PreparedStatement;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.medtrack.db.ConnectDB;

/**
 * Servlet implementation class UserRegister
 */
public class UserRegister extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public UserRegister() {
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
			String uname = request.getParameter("uname");			
			String umobile = request.getParameter("umobile");		
			String uemail = request.getParameter("uemail");
			String upassword = request.getParameter("upassword");
			String uaddress = request.getParameter("uaddress");
			Connection con = ConnectDB.connect();
			PreparedStatement ps = con.prepareStatement("insert into users_tbl values(?,?,?,?,?,?,?,?)");
			ps.setInt(1, 0);
			ps.setString(2, uname);
			ps.setString(3, umobile);
			ps.setString(4, uemail);
			ps.setString(5, upassword);
			ps.setString(6, uaddress);
			ps.setString(7, "1");
			ps.setString(8, "2");
			int i = ps.executeUpdate();
			if(i>0)
			{
				System.out.println(" User Successful Register");			
				
				response.sendRedirect("ulogin.jsp");
			}
			else
			{
				UserInfo.setFlag2(true);
				response.sendRedirect("uregister.jsp");
				System.out.println("User UnSuccessful Register");
				
			}			
		}catch(Exception e)
		{

			
			System.out.println("Something wrong in UserRegister");
			e.printStackTrace();
		}
	}

}
