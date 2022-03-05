package com.rays.thread;



public class TestAccount extends Thread {
    public static Account a = new Account ();
      String name;
 
 public TestAccount(String name) {
	this.name=name;
}
public void run () {
	 
	 for (int i = 0; i <5; i++) {
  
a.deposit(name, 1000);	
	 } 
	
}
 public static void main(String[] args) {
  
	 TestAccount t1 = new TestAccount("Ram");
	 TestAccount t2 = new TestAccount("Syam");
	 
    t1.start();
	t2.start();

 }
	
}
