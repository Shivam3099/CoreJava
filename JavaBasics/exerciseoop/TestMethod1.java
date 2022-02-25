package com.rays.exerciseoop;

public class TestMethod1 {
public static void main(String[] args) {
	Shape1 [] s = new Shape1[3];
	s[0] =  new Circle1(10);
	s[1] = new Triangle1(12,14);
	s[2] = new Rectangle1(14,18);
	
	double totalArea = calcArea(s);
	System.out.println(totalArea);
}

public static double calcArea(Shape1[] s) {
	
	double totalArea =0;
	for (int i = 0; i < s.length; i++) {
		totalArea = totalArea + s[i].area();
		System.out.println(s[i].area());
	}
	
	return totalArea;
	
}
}

