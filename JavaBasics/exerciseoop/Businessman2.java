package com.rays.exerciseoop;

public class Businessman2 implements Richman2 {

	
	public void donation() {
	System.out.println("Get a Donation");
		
	}

	
	public void party() {
	System.out.println("Vote for Party");	
		
	}

	public static void main(String[] args) {
		Richman2 r = new Businessman2();
	r.donation();
    r.party();
}
}