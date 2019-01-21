package com.arbs.controller;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.arbs.bo.LoginBO;
import com.arbs.model.Customer;


public class LoginController extends HttpServlet {
	private static final long serialVersionUID = 1L;
      
    public LoginController() {
        super();
    }

	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doPost(request, response);
	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String UserName=request.getParameter("UserName");
		String password=request.getParameter("password");
		//String deatils=UserName+" "+password;
		System.out.println("login details:::::::"+UserName+password);
		Customer customer=LoginBO.validatedeatils(UserName);
		RequestDispatcher view=null;
		System.out.println("customer Passw :"+customer.getPassword());
		System.out.println("type pas: "+password);
		if(customer.getPassword().equals(password))
		{
			HttpSession session=request.getSession();
			session.setAttribute("ud", customer);
			view=request.getRequestDispatcher("profile.jsp");
			
		}
		else
		{
			request.setAttribute("isPassOK", "No");
			view=request.getRequestDispatcher("login.jsp");
		}
		view.forward(request, response);
		
		
		
	}

}
