package com.rays.exerciseoop;

import com.rays.oop.Shape;

public class Rectangle1  extends Shape1 {
    
	 private int length;
	 private int width;
	
	 public Rectangle1() {}
	public Rectangle1 (int l ,int w) {
	  
   	length= l;
   	width = w;
   	
}
	public int getLength() {
		return length;
	}
	
	public int getWidth() {
		return width;
	}
	public double area() {
		return length*width;
		
}
}


