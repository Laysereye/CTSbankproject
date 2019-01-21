package com.arbs.dao;

import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.Transaction;

import com.arbs.model.Account;
import com.arbs.model.Customer;
import com.arbs.util.HibernateUtil;

public class AccountDAO {

	public static String linkCustomer(String custid, String intialamount,
			String branchName, String accountType) {
		Session session=HibernateUtil.getSessionFactory().openSession();
		Double amount=null;
		String username=searchusername(custid);
		try
		{
		amount=Double.parseDouble(intialamount);
		} catch(Exception e)
		{
			amount=1000.0;
		}
		Customer customer=new Customer();
		//customer.setId(custid);
		customer.setUsername(username);
		Account account=new Account();
		String accId=accountid();
		System.out.println("Actual ACCID"+accId);
		//setter
		account.setAcc_type(accountType);
		account.setBalance(amount);
		account.setAccount_id(accId);
		account.setCustomer(customer);
		
		if(branchName!=null)
		{
			if(branchName.equalsIgnoreCase("Dhaka"))
			{
				account.setBranch_code("B0001");
			}
			else if (branchName.equalsIgnoreCase("Khulna")) 
			{
				account.setBranch_code("B0002");
			}
			else if (branchName.equalsIgnoreCase("Chittagong")) 
			{
				account.setBranch_code("B0003");
			}
			else if (branchName.equalsIgnoreCase("Rajshahi")) 
			{
				account.setBranch_code("B0004");
			}
			else if (branchName.equalsIgnoreCase("Sylhet"))
			{
				account.setBranch_code("B0005");
			}
			else
			{
				account.setBranch_code("B0006");
			}
		}
		else
		{
			account.setBranch_code("B0002");
		}
		Transaction tr=session.beginTransaction();
		session.persist(account);
		tr.commit();
		System.out.println("account Sucess");
		
		
		return accId;
		
	}

	private static String searchusername(String custid) {
		Session session=HibernateUtil.getSessionFactory().openSession();
		String hql="select C.username from Customer C where C.id=:cid ";
		Query q=session.createQuery(hql);
		q.setParameter("cid", custid);
		List<String> list=q.list();
		String cust=list.get(0);
		return cust;
	}

	private static String accountid() {
		String LastId=Lastaccountid();
		String accID = "";
		String numeric = "";
		String num1 = "";
		String alpha = "";
		if(LastId !=null)
		{
			System.out.println("acc 1");
		alpha = alpha + LastId.charAt(0);
		System.out.println("acc 1:"+alpha);
		for (int i = 1; i < LastId.length(); i++) 
		{
			numeric = numeric + LastId.charAt(i);
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
		return "A001";
	}
		System.out.println("AccountId"+alpha);
		return alpha;
		
	}

	private static String Lastaccountid() {
		Session session=HibernateUtil.getSessionFactory().openSession();
		String hql="Select max(account_id) from Account";
		Query query=session.createQuery(hql);
		List<String> queryList=query.list();
		String Lastid="";
		for(String id:queryList)
		{
			Lastid=id;
			System.out.println("LastAccId:"+Lastid);
		}
		return Lastid;
	}

}
