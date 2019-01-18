/*
 * SortEmployeeBySalary
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

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.dao.EmployeeDaoImp;
import com.dao.SalaryDaoImp;

/**
 * Servlet implementation class SortEmployeeBySalary
 */
@WebServlet("/SortEmployeeBySalary")
public class SortEmployeeBySalary extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public SortEmployeeBySalary() {
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
		
		SalaryDaoImp si=new SalaryDaoImp();
		ResultSet s=si.sortEmployeeBySalary();
		request.setAttribute("rs", s);
		request.getRequestDispatcher(
				"jsp/sortEmployee.jsp").forward(request,response);
		
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request,
	 *  HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request,
			HttpServletResponse response) throws ServletException,
			IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
