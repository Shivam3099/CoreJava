package com.rays.oop;

public class Triangle extends Shape {
    private int base;
    private int hight;

    public Triangle() {}
    public Triangle(int b,int h) {
    	
    	base = b;
    	hight = h;
}
	public int getBase() {
		return base;
	}
		
	public int getHight() {
		return hight;
	}
	
   public void area () {
    
     double area =(double) 1/2*base*hight;
      System.out.println("area of Triangle " +area);

   }
}