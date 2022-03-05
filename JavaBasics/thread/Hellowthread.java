package com.rays.thread;

public class Hellowthread extends Thread {
	private String name;
    public Hellowthread() {}
    public  Hellowthread(String name) {
    	this.name=name;
    	}
    	public void run(){
    	for (int i = 0; i <10; i++) {
    		try {
				sleep(1000);
			} catch (InterruptedException e) {
}
			System.out.println(i+ " "+name);
		}
    }
    }

