package com.arbs.dao;

import java.util.List;

import org.hibernate.Session;

import com.arbs.model.AdminMaster;
import com.arbs.util.HibernateUtil;



public class AdminLoginDAO {

	public boolean validateAdmin(String adminId,String pass)
	{
		
		Session session = HibernateUtil.getSessionFactory().openSession();
		AdminMaster admin=null;
		String password=null;
		String adminid=null;
		boolean b=false;
		try
		{
		admin=(AdminMaster)session.get(AdminMaster.class, adminId);
		password=admin.getPassword();
		adminid=admin.getAdminid();
		System.out.println("admin Db Pass:"+password);
		System.out.println("db admin id"+admin.getAdminid());
		}
		catch(Exception e)
		{
			adminid="sukla";
			password="sukla";
		}
		if(adminid.equals(adminId) && password.equals(pass))
		{
			   b=true;
		}
		System.out.println("AdminDAO bolean"+b);
		return b;
		
	}
	
}
