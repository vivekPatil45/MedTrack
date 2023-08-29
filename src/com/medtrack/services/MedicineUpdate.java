package com.medtrack.services;

import java.io.IOException;
import java.sql.*;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.medtrack.db.ConnectDB;

/**
 * Servlet implementation class MedicineUpdate
 */
public class MedicineUpdate extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public MedicineUpdate() {
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
			String id = request.getParameter("med_id");
			int med_id = Integer.parseInt(id);
			int med_price = Integer.parseInt(request.getParameter("med_price"));
			int med_discount = Integer.parseInt(request.getParameter("med_discount"));
			int med_qty = Integer.parseInt(request.getParameter("med_qty"));
			Connection con = ConnectDB.connect();

			PreparedStatement ps = con.prepareStatement("update medicine_tbl set med_price = ? , med_discount = ? , med_qty = ? where med_id =? ");
			ps.setInt(1, med_price);
			ps.setInt(2, med_discount);
			ps.setInt(3, med_qty);
			ps.setInt(4, med_id);
			
			int i = ps.executeUpdate();
			if(i>0)
			{
				System.out.println("Update Medicine successfuly");
				response.sendRedirect("medview.jsp");
				
			}
			else
			{
				System.out.println("Update Medicine Unsuccessfuly");
				response.sendRedirect("medview.jsp");
			}
		}catch(Exception e)
		{
			System.out.println("Something went wrong in updateMed.jsp");
			response.sendRedirect("medview.jsp");
			e.printStackTrace();
		}

	}

}
