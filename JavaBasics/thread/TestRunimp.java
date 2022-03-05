package com.rays.thread;

public class TestRunimp {
	public static void main(String[] args) {
			Runimp r1 =new Runimp("Pavan");
			Runimp r2 =new Runimp("Rajesh");
			Thread th = new Thread(r1);	
			Thread th1 = new Thread(r2);
			th.start();
			th1.start();
}
}