package com.rays.thread;

public class Runimp extends Hellowthread implements Runnable {
	private String name;
    public Runimp() {}
    public  Runimp(String name) {
    	this.name=name;
    	}
    	public void run(){
    	for (int i = 0; i <10; i++) {
    		try {
				sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			System.out.println(name);
		}
    }
    }


