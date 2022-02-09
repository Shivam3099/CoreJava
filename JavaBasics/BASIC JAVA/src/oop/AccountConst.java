package com.rays.oop;

public class AccountConst {
private String accountNum = "null";
private String accountType = "null";
private double balance = 0.00;

public AccountConst() {}

public AccountConst(String s,String y, double d) {
       this.accountNum = s;
	  this .accountType=y;
	this.balance = d; 
}
	
public String getAccountNum() {
	return accountNum;
}

public String getAccountType() {
	return accountType;
}

public double getBalance() {
	return balance;

}

}