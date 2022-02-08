package com.rays.oop;



public class SavingAcc {
	public static void main(String[] args) {
		Account a=new Account();
    a.setNo("991718210005164");
        System.out.println(a.getNo());
	
        a.setAccountType("Saving");	
	    System.out.println(a.getAccountType());
	
	a.setBalance(50000.00);
	System.out.println(a.getBalance());
	a.deposit(500.00);
	System.out.println(a.getBalance());
	
	a.withdraw(1000.00);
	System.out.println(a.getBalance());
	
	
	
	}
	}
	 

