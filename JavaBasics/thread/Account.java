package com.rays.thread;

public class Account {
private int balance;

public synchronized  void deposit(String message,int amount) {
 
	
	int bal = getBalance();	
 setBalance(bal+amount);
 System.out.println(message+" "+getBalance());
 
}

public void setBalance(int balance) {
	try {
		Thread.sleep(200);
	} catch (InterruptedException e) {
	}
	this.balance = balance;
	
}
public int getBalance() {
try {
	Thread.sleep(200);
} catch (InterruptedException e) {
}
return balance;

}




}
