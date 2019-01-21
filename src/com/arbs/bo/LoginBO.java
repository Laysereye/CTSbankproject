package com.arbs.bo;

import com.arbs.dao.LoginDAO;
import com.arbs.model.Customer;

public class LoginBO {

	public static Customer validatedeatils(String userName) {
		Customer customer=LoginDAO.validatedetails(userName);
		return customer;
		
	}

}
