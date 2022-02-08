package com.rays.oop;

public class TextAutoMobile {
public static void main(String[] args) {
	
	AutoMobile m = new AutoMobile(); 
	
	System.out.println(AutoMobile.Gears);
	
	
	m.setColor("blue");
	System.out.println(m.getColor());
	
	m.setSpeed(40);
	System.out.println(m.getSpeed());
	
    m.setMake("hero");
    System.out.println(m.getMake());
    
    m.brake();
}
}
