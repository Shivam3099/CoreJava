package com.rays.Exceptionhendling;

public class ClassAssignement2 {
public static void main(String[] args) {
	
	int i = 12 ;
	int j = 0 ;
	try {
	      System.out.println(i/j);
    
	}catch (ArithmeticException e) {
	
		System.out.println("zero");
    
      try {
          String s = null;
          
           System.out.println(s.length());
    
      } catch (NullPointerException n) {
        
    	  System.out.println("00000");
      } finally {
             
    	     System.out.println("doneeeee!!!!");
      }
         } finally {
	        
        	 System.out.println("ok");
	         
	         try {
	        	 String a = "syam";
	         
	        	 System.out.println(a.charAt(4));
	         
	         } catch (StringIndexOutOfBoundsException s) {
	         
	         System.out.println(s.getMessage());
	         
	         } finally {
	         
	         System.out.println("oooppp!!!");
    }
	
	
	
         }
}
}