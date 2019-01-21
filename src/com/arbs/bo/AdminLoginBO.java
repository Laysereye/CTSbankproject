package com.arbs.bo;

import com.arbs.dao.AdminLoginDAO;
import com.arbs.model.AdminMaster;

public class AdminLoginBO 
{
	
		AdminLoginDAO adminLoginDAO = new AdminLoginDAO();
		public  boolean validateAdmin(String admin,String pass) 
		{
			Boolean status =  adminLoginDAO.validateAdmin(admin,pass);
			System.out.println("AdminBO boolean:"+status);
		    	return status;
		}
	


}
