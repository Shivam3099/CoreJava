package com.rays.interfacee;

import com.rays.oop.Person;

public class Businessmen extends Person implements  Richman , SocialWorker  {

	
	private String name;
	private String address;
	
	
	
	public void helpToOther() {
	System.out.println("help together");
		
	}

	
	public void earnmoney() {
		System.out.println("earn money");
		
	}

	
	public void donation() {
		System.out.println("donetion");
		
	}

	
	public void party() {
	System.out.println("party");
		
	}

}
