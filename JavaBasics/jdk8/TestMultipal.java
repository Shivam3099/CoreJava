package com.rays.jdk8;

public class TestMultipal {
     public static void main(String[] args) {
		
	Multipal m =(a,b)->{
		return a * b;
	};
	 int c = m.multipl(10, 5);
	System.out.println(c);
}
}
