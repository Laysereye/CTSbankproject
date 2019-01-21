package com.arbs.controller;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.arbs.bo.CustomerBO;
import com.arbs.model.Customer;

/**
 * Servlet implementation class CustomerServlet
 */
public class CustomerServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public CustomerServlet() {
        super();
        
    }

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
	String firstName=request.getParameter("first_name");
	String lastName=request.getParameter("last_name");
	String address=request.getParameter("address");
	String city=request.getParameter("city");
	String branch=request.getParameter("branch");
	String zip=request.getParameter("zip");
	String username=request.getParameter("username");
	String password=request.getParameter("password");
	String phone=request.getParameter("phone");
	String email=request.getParameter("email");
	String gender=request.getParameter("gender");
	String dob=request.getParameter("dob");
	Customer customer=new Customer();
	customer.setId(CustomerBO.autoId());
	customer.setFirstname(firstName);
	customer.setLastName(lastName);
	customer.setAddress(address);
	customer.setCity(city);
	customer.setBranch(branch);
	customer.setPin(zip);
	customer.setUsername(username);
	customer.setPassword(password);
	customer.setPhone(phone);
	customer.setEmail(email);
	customer.setGender(gender);
	customer.setDob(dob);
	//
	//customer.setStatus(b);
	boolean b=CustomerBO.createCustomer(customer);
	System.out.println("Customer Servlet");
	RequestDispatcher view=null;
	if(b)
	{
	request.setAttribute("msg", customer);
	view= request.getRequestDispatcher("sucessfulregmsg.jsp");
	}
	else
	{
		view= request.getRequestDispatcher("sucessfulregmsg.jsp");
	}
	view.forward(request, response);
	
		
		
		
	}

}
