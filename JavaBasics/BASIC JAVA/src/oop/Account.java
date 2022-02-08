package com.rays.oop;

public class Account {
	private String no = null;
	private String accountType = null;
	private Double balance = 0.00;
	
	
	public String getNo() {
		return no;
	}
	public void setNo(String no) {
		this.no = no;
	}
	public String getAccountType() {
		return accountType;
	}
	public void setAccountType(String accountType) {
		this.accountType = accountType;
	}
	public Double getBalance() {
		return balance;
	}
	public void setBalance(Double balance) {
		this.balance = balance;
	}
	public double deposit(double d) {
		balance = balance+d;
		return balance;
}
	public double withdraw(double w) {
		balance =balance -w;
		return balance;
	}
	
	
	
	
	
	
	
	
	
	}	
