package com.rays.jdk8;

public class TestStringCon {
public static void main(String[] args) {
	StringCon sc = (a , b)->{
		return(a +" "+ b);
	};
	String s = sc.name("Shivam", "Patel");
	System.out.println(s);
	}
}
