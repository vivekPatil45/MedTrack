package com.medtrack.services;

import java.io.IOException;
import java.sql.*;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.medtrack.db.ConnectDB;

/**
 * Servlet implementation class NewMedicine
 */
public class NewMedicine extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public NewMedicine() {
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
			String med_name = request.getParameter("med_name");
			String med_brand = request.getParameter("med_name");
			String med_desc = request.getParameter("med_desc");
			int med_qty = Integer.parseInt(request.getParameter("med_qty"));
			String med_exp = request.getParameter("med_exp");
			String memail = MedicalInfo.getMemail();
			int med_price = Integer.parseInt(request.getParameter("med_price"));
			int med_discount = Integer.parseInt(request.getParameter("med_discount"));
			
			
			Connection con = ConnectDB.connect();
			PreparedStatement ps = con.prepareStatement("insert into medicine_tbl values(?,?,?,?,?,?,?,?,?)");
			ps.setInt(1, 0);
			ps.setString(2, med_name);
			ps.setString(3, med_brand);
			ps.setString(4, med_desc);
			ps.setInt(5, med_qty);
			ps.setString(6, med_exp);
			ps.setString(7, memail);
			ps.setInt(8, med_price);
			ps.setInt(9, med_discount);
			int i = ps.executeUpdate();
			if(i>0)
			{
				System.out.println("Successful Add Medicine");			
				MedicineInfo.setFlag1(true);
				response.sendRedirect("addmed.jsp");
			}
			else
			{
				System.out.println("Successful Add Medicine");			
				MedicineInfo.setFlag1(true);
				response.sendRedirect("addmed.jsp");
				
			}			
		}catch(Exception e)
		{			
			System.out.println("Something wrong in NewMeddicine");
			e.printStackTrace();
		}
	}

}
