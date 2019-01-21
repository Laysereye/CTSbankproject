package com.arbs.bo;

import com.arbs.dao.AccountDAO;

public class AccountBO {

	public static String linkCustomer(String custid, String intialamount,
			String branchName, String accountType) {
		String accid=AccountDAO.linkCustomer(custid,intialamount,branchName,accountType);
		return accid;
		
	}

}
