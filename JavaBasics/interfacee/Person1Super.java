package com.rays.interfacee;

public class Person1Super extends Person1 {

	private String designatin = null;
	
	public Person1Super() { 
		
	System.out.println("Default constructor");
	}
	
	public Person1Super( String fn,String ln ) { 
		//super();
		System.out.println("2 parameter constructer");
		}
	
	public Person1Super( String fn,String ln ,String adress) { 
		super(fn,ln);
		System.out.println("3 parameter constructer ");
		}
	
   public static void main(String[] args) {
	   Person1Super ps = new Person1Super("pp","aa","vv");
	   System.out.println();
	   }
   
	   }

