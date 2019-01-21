package com.arbs.dao;

import org.hibernate.Session;

import com.arbs.model.Customer;
import com.arbs.util.HibernateUtil;

public class LoginDAO {

	public static Customer validatedetails(String userName) {
		Session session=HibernateUtil.getSessionFactory().openSession();
		Customer customer=(Customer)session.get(Customer.class, userName);
		
		if(customer.getUsername().equals(userName))
		{
			System.out.println("customer details:in dao"+customer.getUsername()+userName);
			return customer;
			
		}
		return null;
		
	}

}
