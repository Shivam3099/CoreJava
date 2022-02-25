package com.rays.exerciseoop;

import com.rays.oop.Shape;

public class Triangle1 extends Shape1 {
    private int base;
    private int hight;

    public Triangle1() {}
    public Triangle1(int b,int h) {
    	
    	base = b;
    	hight = h;
}
	public int getBase() {
		return base;
	}
		
	public int getHight() {
		return hight;
	}
	
   public double area () {
    
    return 1/2*base*hight;
     

   }
}


