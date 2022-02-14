package com.rays.Exceptionhendling;

public class ClassAsingment4 {
      
	public static void main(String[] args) {
		
		int i = 10 ;
		int j = 0;
	
	try {	
		int k = i/j ;
				
		System.out.println(k);
	} catch (ArithmeticException s) {
		System.out.println(s.getMessage());
	
	   System.exit(2222);
	}
	finally {
		
		System.out.println("ok");
		
		
		
	}
	}	
}
