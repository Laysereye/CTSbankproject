package com.arbs.bo;

import java.util.List;

import com.arbs.dao.CustomerDAO;
import com.arbs.model.Customer;

public class CustomerBO {

	public static boolean createCustomer(Customer customer) {
		return CustomerDAO.createCustomer(customer);
		//System.out.println("CustomerBO");
		
	}
	public static String autoId()
	{
		String custID = "";
		String numeric = "";
		String num1 = "";
		String alpha = "";
		String last=CustomerDAO.Lastid();
		System.out.println("Last id:"+last);
		if (!last.isEmpty() || last!=null) 
		{
			System.out.println("hi 1");
			alpha = alpha + last.charAt(0);
			System.out.println("alpha 1:"+alpha);
			for (int i = 1; i < last.length(); i++) 
			{
				numeric = numeric + last.charAt(i);
			}
			int num = Integer.parseInt(numeric);
			num = num + 1;
			// System.out.println(num);
			if (num < 10) {
				char c = '0';
				alpha = alpha + c + c;
				num1 = num1.valueOf(num);
				alpha = alpha + num1;
			} 
			else if (num < 100) 
			{
				char c = '0';
				alpha = alpha + c;
				num1 = num1.valueOf(num);
				alpha = alpha + num1;

			} 
			else if (num < 1000) 
			{

				num1 = num1.valueOf(num);
				alpha = alpha + num1;

			} 
			else 
			{
				num1 = num1.valueOf(num);
				alpha = alpha + num1;
			}
			
		}
		else
		{
			return "C0001";
		}
		System.out.println("alphaLast:"+alpha);
		return alpha;
	}
	public static List<Customer> searchIdbyName(String name)
	{
		
		return CustomerDAO.searchIdbyName(name);
	}

}
