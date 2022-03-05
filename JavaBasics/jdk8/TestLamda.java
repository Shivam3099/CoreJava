package com.rays.jdk8;

public class TestLamda {
public static void main(String[] args) {
	LamdaExp s = (a , b)->{
		System.out.println(a+b);
	};
	s.sum(90,120 );
}
}
