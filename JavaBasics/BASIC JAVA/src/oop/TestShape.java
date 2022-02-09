package com.rays.oop;

public class TestShape {
public static void main(String[] args) {
  	
  Shape s = new Shape(); 
   s.setBorderwidth(5);
   s.setColor("yello");
   System.out.println(s.getBorderwidth());
   System.out.println(s.getColor());
   System.out.println();
}
}
