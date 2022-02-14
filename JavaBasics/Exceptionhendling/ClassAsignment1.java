package com.rays.Exceptionhendling;

public class ClassAsignment1 {
  public static void main(String[] args) {
	
	try {  String s = null;

      System.out.println(s.length());
	
	try { 
		String d = "ram";
	System.out.println(d.charAt(3));
	}catch (StringIndexOutOfBoundsException e) {
	   System.out.println("index out of bond");
  } finally {
	System.out.println("done!!!!");
  }
	
	}catch(NullPointerException n) {
  
		System.out.println(n.getMessage());
	}finally {
		System.out.println("done");
		
	}	
		
  }
  }
