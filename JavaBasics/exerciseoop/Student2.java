package com.rays.exerciseoop;

public class Student2 implements Richman2{


	public void donation() {
		System.out.println("Get a donation" );
		
	}

	
	public void party() {
	System.out.println("Vote for party");
		
	}
	public static void main(String[] args) {
		Richman2 r1 = new Student2();
		r1.donation();
	    r1.party();
	}
	}


