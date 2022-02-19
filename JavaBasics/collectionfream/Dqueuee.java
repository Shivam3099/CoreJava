package com.rays.collectionfream;

import java.util.ArrayDeque;
import java.util.Deque;

public class Dqueuee {
public static void main(String[] args) {
	
	 Deque d = new ArrayDeque<>();
	    d.add(56);
	    d.add(34);
	    d.add('a');
	    d.add("nishil"); 
	
	
	    d.addFirst("ram");
	    d.addLast("gurjar");
	    
	    System.out.println(d);
}
}
