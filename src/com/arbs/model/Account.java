package com.arbs.model;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import org.hibernate.annotations.Cascade;

@Entity
@Table(name="Account_master")
public class Account {
	@Id
	@Column(name="acc_id")
	private String account_id;
	@Column(name="branch_code")
	private String branch_code;
	@Column(name="balance")
	private double balance;
	@Column(name="acc_type")
	private String acc_type;
	@OneToOne
	@JoinColumn(name="cust_id")
	private Customer customer;
	//private List<Transaction> transactionList=null;
	public Account() {
		super();
		//transactionList=new ArrayList<Transaction>();
	}
	public String getAccount_id() {
		return account_id;
	}
	public void setAccount_id(String account_id) {
		this.account_id = account_id;
	}
	public String getBranch_code() {
		return branch_code;
	}
	public void setBranch_code(String branch_code) {
		this.branch_code = branch_code;
	}
	public double getBalance() {
		return balance;
	}
	public void setBalance(double balance) {
		this.balance = balance;
	}
	/*@OneToMany
	@JoinColumn(name="acc_id")
	public List<Transaction> getTransactionList() {
		return transactionList;
	}
	public void setTransactionList(List<Transaction> transactionList) {
		this.transactionList = transactionList;
	}*/
	public String getAcc_type() {
		return acc_type;
	}
	public void setAcc_type(String acc_type) {
		this.acc_type = acc_type;
	}
	public Customer getCustomer() {
		return customer;
	}
	public void setCustomer(Customer customer) {
		this.customer = customer;
	}
	
	

}
