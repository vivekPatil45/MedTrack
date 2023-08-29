package com.medtrack.services;

import java.io.IOException;
import java.sql.*;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.medtrack.db.ConnectDB;

/**
 * Servlet implementation class MedicalLogin
 */
public class MedicalLogin extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public MedicalLogin() {
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
			String memail = request.getParameter("memail");
			String mpassword = request.getParameter("mpassword");		
			
			Connection con = ConnectDB.connect();
			PreparedStatement ps = con.prepareStatement("select * from medical_tbl where memail = ? and mpassword=?");				
			ps.setString(1, memail);
			ps.setString(2, mpassword);
			ResultSet rs = ps.executeQuery();
			if(rs.next())
			{
					String mstatus=rs.getString("mstatus");
					
					System.out.println("Medical can login");
					if(mstatus.equals("approve"))
					{
						String mname = rs.getString("mname");
						System.out.println("Approved and login successfuly");
						MedicalInfo.setMemail(memail);
						MedicalInfo.setMname(mname);
						response.sendRedirect("medical.jsp");
					}
					else
					{
						MedicalInfo.setFlag1(true);
						System.out.println("Not Approved and login Usuccessfuly");
						response.sendRedirect("mlogin.jsp");
					}
			}
			else
			{
					
				MedicalInfo.setFlag2(true);
				response.sendRedirect("mlogin.jsp");
				System.out.println("UnSuccessful Login");
	
			}
			
		}catch(Exception e)
		{
			System.out.println("Not Register");
			e.printStackTrace();
		}
	}

}
