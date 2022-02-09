package com.rays.oop;

public class TestTriangle {
	 public static void main(String[] args) {
		
		 Triangle t  = new Triangle(5,9);
         
         System.out.println(t.getBase());
        System.out.println(t.getHight());

        t.area();
	 }
}
