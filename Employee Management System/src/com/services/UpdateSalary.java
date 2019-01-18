/*
 * UpdateSalary
 * 
 * 1.0
 *
 * 18/01/2019
 * 
 * Copyright notice
 */
package com.services;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.dao.SalaryDaoImp;
import com.pojo.Salary;

/**
 * Servlet implementation class UpdateSalary
 */
@WebServlet("/UpdateSalary")
public class UpdateSalary extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public UpdateSalary() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, 
	 * HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, 
			HttpServletResponse response) throws ServletException, 
			IOException {
		// TODO Auto-generated method stub
		
		String empid=request.getParameter("seid");
		String empsalary=request.getParameter("ssalary");
		Salary salary=new Salary();
		salary.setEmp_id(empid);
		salary.setEmp_salary(empsalary);
		
		SalaryDaoImp si=new SalaryDaoImp();
		si.updateSalary(salary);
		
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
