package com.rays.exerciseoop;

public class Person3 {

	protected String fname;
	protected String lname;
	
	public Person3() {}
	public Person3(String fn,String ln) {
		fname =fn;
		lname = ln;
}
	public String getFname() {
		return fname;
	}
	
	public String getLname() {
		return lname;
	}
	public String toString() {
		return this.fname +this.lname;
		
	}
	
	
	
}
