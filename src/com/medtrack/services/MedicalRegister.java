package com.medtrack.services;

import java.io.IOException;
import java.sql.*;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.medtrack.db.ConnectDB;

/**
 * Servlet implementation class MedicalRegister
 */
public class MedicalRegister extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public MedicalRegister() {
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
			String mname = request.getParameter("mname");
			String mowner = request.getParameter("mowner");
			String mmobile = request.getParameter("mmobile");
			String id=request.getParameter("medical_id");
			int medical_id = Integer.parseInt(id);
			String memail = request.getParameter("memail");
			String mpassword = request.getParameter("mpassword");
			String maddress = request.getParameter("maddress");
			String mlatitude = request.getParameter("mlatitude");
			String mlongitude = request.getParameter("mlongitude");
			
			
			Connection con = ConnectDB.connect();
			PreparedStatement ps = con.prepareStatement("insert into medical_tbl values(?,?,?,?,?,?,?,?,?,?,?)");
			ps.setInt(1, 0);
			ps.setString(2, mname);
			ps.setString(3, mowner);
			ps.setString(4, mmobile);
			ps.setInt(5, medical_id);
			ps.setString(6, memail);
			ps.setString(7, mpassword);
			ps.setString(8, maddress);
			ps.setString(9, mlongitude);
			ps.setString(10, mlatitude);
			ps.setString(11, "pending");
			int i = ps.executeUpdate();
			if(i>0)
			{
				System.out.println("Successful Register");			
				MedicalInfo.setFlag3(true);	
				response.sendRedirect("mregister.jsp");
			}
			else
			{
				MedicalInfo.setFlag1(true);
				response.sendRedirect("mregister.jsp");
				System.out.println("UnSuccessful Register");
				
			}			
		}catch(Exception e)
		{

			
			System.out.println("Not Register");
			e.printStackTrace();
		}
		
	}

}
