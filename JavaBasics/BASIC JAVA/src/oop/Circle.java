package com.rays.oop;

      public class Circle extends Shape {
      private int radius;

      public int getRadius() {
	   return radius;
}

     public void setRadius(int radius) {
	   this.radius = radius;
}
	
	  public void area() {
     double area = Math.PI*radius*radius;
     System.out.println("area of circle" + area);
}
}      
	