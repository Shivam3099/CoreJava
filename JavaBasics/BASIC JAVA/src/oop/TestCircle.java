package com.rays.oop;

public class TestCircle {
public static void main(String[] args) {
	Circle c = new Circle();
   c.setColor("red");
    System.out.println(c.getColor());

   c.setBorderwidth(5);
   System.out.println(c.getBorderwidth());

     c.setRadius(7);
     System.out.println(c.getRadius());

    c.area();
}
}
