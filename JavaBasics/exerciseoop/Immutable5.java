package com.rays.exerciseoop;

public  class Immutable5 {

	private final int a;
	private final String b;
	

    public Immutable5(int a,String b) {
    	this.a =a;
    	this.b=b;
    }


	public int getA() {
		return a;
	}


	public String getB() {
		return b;
	}

	public static void main(String[] args) {
		Immutable5 i = new Immutable5(10,"shivam");
	System.out.println(i.getA()+i.getB());
	}	
}
