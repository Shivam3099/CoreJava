package com.rays.jdk8;

public class TestDivison {
public static void main(String[] args) {
	Divison d = (a,b)->{
		return a/b;
	};
	int c = d.divison(50, 5);
 System.out.println(c);
 
}
}
