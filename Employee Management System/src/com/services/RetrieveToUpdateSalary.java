/*
 * RetrieveToUpdateSalary
 * 
 * 1.0
 *
 * 18/01/2019
 * 
 * Copyright notice
 */
package com.services;

import java.io.IOException;
import java.sql.ResultSet;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.dao.SalaryDaoImp;

/**
 * Servlet implementation class RetrieveToUpdateSalary
 */
@WebServlet("/RetrieveToUpdateSalary")
public class RetrieveToUpdateSalary extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public RetrieveToUpdateSalary() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request,
	 *  HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request,
			HttpServletResponse response) throws ServletException, 
			IOException {
		// TODO Auto-generated method stub
		
		String emp_id=request.getParameter("seid");
		SalaryDaoImp si=new SalaryDaoImp();
		ResultSet r=(ResultSet) si.retrieveToUpdateSalary(emp_id);
		request.setAttribute("rs", r);
		request.getRequestDispatcher(
				"jsp/updateSalary.jsp").forward(request, response);
		
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, 
	 * HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request,
			HttpServletResponse response) throws ServletException, 
			IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
