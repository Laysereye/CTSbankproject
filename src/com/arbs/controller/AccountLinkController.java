package com.arbs.controller;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.arbs.bo.AccountBO;

/**
 * Servlet implementation class AccountLinkController
 */
public class AccountLinkController extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public AccountLinkController() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doPost(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String button=request.getParameter("submit");
		System.out.println("Account Link button:"+button);
		RequestDispatcher view=null;
		if("AddAccount".equals(button))
		{
			String custid=request.getParameter("cid1");
			String intialamount=request.getParameter("amount");
			String branchName=request.getParameter("branchname");
			String accountType=request.getParameter("acctype");
			System.out.println(custid+intialamount+branchName+accountType);
			String accId=AccountBO.linkCustomer(custid,intialamount,branchName,accountType);
			HttpSession session=request.getSession();
			session.setAttribute("accid", accId);
			view=request.getRequestDispatcher("succesaccountLink.jsp");
			
		}
		view.forward(request, response);
		
	}

}
