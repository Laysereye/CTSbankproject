package com.arbs.model;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="transaction_master")
public class Transaction {
	@Id
	@Column(name="transaction_id")
	private String transaction_id;
	@Column(name="transaction_type")
	private String transaction_type;
	@Column(name="transaction_date")
	private Date transaction_date;
	@Column(name="transaction_amount")
	private Double transaction_amount;
	public String getTransaction_id() {
		return transaction_id;
	}
	public void setTransaction_id(String transaction_id) {
		this.transaction_id = transaction_id;
	}
	public String getTransaction_type() {
		return transaction_type;
	}
	public void setTransaction_type(String transaction_type) {
		this.transaction_type = transaction_type;
	}
	public Date getTransaction_date() {
		return transaction_date;
	}
	public void setTransaction_date(Date transaction_date) {
		this.transaction_date = transaction_date;
	}
	public Double getTransaction_amount() {
		return transaction_amount;
	}
	public void setTransaction_amount(Double transaction_amount) {
		this.transaction_amount = transaction_amount;
	}
	
	
	

}
