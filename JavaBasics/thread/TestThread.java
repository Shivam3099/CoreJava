package com.rays.thread;

public class TestThread {
	public static void main(String[] args) {
		
	
	Hellowthread t1 = new Hellowthread("Shivam");
	Hellowthread t2 = new Hellowthread("Nishil");
	
	t1.start();
	t2.start();
}
}