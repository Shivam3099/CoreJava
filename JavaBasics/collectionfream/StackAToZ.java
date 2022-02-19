package com.rays.collectionfream;

import java.util.Stack;

public class StackAToZ {
public static void main(String[] args) {
	Stack s =new Stack ();
	
	for (char i ='a';i<='z';i++) {
	
	//System.out.println(i);
   s.push(i);
}
   System.out.println("Stack 1st is:-" +s);
   
   
   Stack s1 = new Stack();
   
   char value;

   for (char i ='a';i<='z';i++) {
    value = (char)s.peek();
   s1.push(value);
   s.pop();
   
   }
   System.out.println("Stack 2nd is:-"+ s1); 
   
 /*  Stack s2 = new Stack();
   for (char i ='a';i<='z';i++) {
	   value = (char) s1.peek();
	   s2.push(value);
   }
       System.out.println("Stack 3rd is :-" +s2);*/
   }
}
