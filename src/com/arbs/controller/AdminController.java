package com.arbs.controller;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.arbs.bo.AdminLoginBO;

public class AdminController extends HttpServlet {
	private static final long serialVersionUID = 1L;

    public AdminController() {
        super();

    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doPost(request, response);
		
		
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	
	String adminid=request.getParameter("username");
	String password=request.getParameter("password");
	System.out.println("adminid:"+adminid);
	System.out.println("pass"+password);
	
	AdminLoginBO adminLoginBO=new AdminLoginBO();
	boolean b=adminLoginBO.validateAdmin(adminid,password);
	System.out.println("servlet b:"+b);
	RequestDispatcher view=null;
	if(b)
	{
		HttpSession session=request.getSession();
		session.setAttribute("admin",adminid);
		view=request.getRequestDispatcher("adminprofile.jsp");
	}
	else
	{
		//String msg="Incorrect Username or Password!";
		request.setAttribute("b", "NO");
		view=request.getRequestDispatcher("adminlogin.jsp");
	}
	view.forward(request, response);

	
	      
	
	
	}

}
