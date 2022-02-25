package com.rays.exerciseoop;

import com.rays.oop.Shape;

public class Circle1 extends Shape1 {
    private int radius;
    
  public Circle1 () {}
public Circle1 (int i) {
	radius = i;
      }
public int getRadius() {
	return radius;
}
public double area () {
return PI*radius*radius;
}      
    }	

