package com.arbs.controller;

import java.io.IOException;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.arbs.bo.CustomerBO;
import com.arbs.model.Customer;


public class AccountController extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    public AccountController() {
        super();
        // TODO Auto-generated constructor stub
    }
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doPost(request, response);
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
			String button=request.getParameter("account");
			RequestDispatcher view=null;
			if("Search".equals(button))
			{
			String customerName=request.getParameter("username");
			//System.out.println("submit buttom"+request.getParameter("account"));
			List<Customer> clist=CustomerBO.searchIdbyName(customerName);
			request.setAttribute("clist",clist);
			view=request.getRequestDispatcher("adminprofile.jsp");
			
			}
			else if("AddCustomer".equals(button))
			{
				String custid=request.getParameter("custid");
				System.out.println("Custid link"+custid);
				request.setAttribute("custid", custid);
				view=request.getRequestDispatcher("addaccount.jsp");
				
				
			}
			view.forward(request, response);
		
		
		
	}

}
