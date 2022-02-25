package com.rays.collectionfream;

import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.TreeSet;

public class Question6 {
 public static void main(String[] args) {
	HashSet h=new HashSet();
     h.add("one");
     h.add("two");
     h.add("three");
     h.add("four");
     h.add("five");
     h.add("six");
     h.add("seven");
     h.add("eight");
     h.add("nine");
     h.add("ten");
     
     Iterator it = h.iterator();
     while (it.hasNext()) {
		Object ob = (Object) it.next();
		
	
     System.out.println("Hashset :-" +ob);
     }
 
     TreeSet t = new TreeSet();
     
     t.add("one");
     t.add("two");
     t.add("three");
     t.add("four");
     t.add("five");
     t.add("six");
     t.add("seven");
     t.add("eight");
     t.add("nine");
     t.add("ten");
     Iterator it1 = t.iterator();
     while (it1.hasNext()) {
		Object o = (Object) it1.next();
		System.out.println("Treeset :-" +o);
     }
		LinkedHashSet lh=  new LinkedHashSet();
		 lh.add("one");
	     lh.add("two");
	     lh.add("three");
	     lh.add("four");
	     lh.add("five");
	     lh.add("six");
	     lh.add("seven");
	     lh.add("eight");
	     lh.add("nine");
	     lh.add("ten");
       
	     Iterator it2 = t.iterator();
	     while (it2.hasNext()) {
			Object obj = (Object) it2.next();
			
			System.out.println("LinkedHashSet :- " +obj);
		
     }
 }	
}
	
	
	

