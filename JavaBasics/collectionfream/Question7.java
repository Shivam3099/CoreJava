package com.rays.collectionfream;

import java.util.LinkedList;

public class Question7 {
  public static void main(String[] args) {
	
	  LinkedList ll= new LinkedList();
	  
	  ll.add(1);
	  ll.add(3);
	  ll.add(5);
	  ll.add(6);
	  ll.add(13);
	  
	  System.out.println("Linkedlist" +ll);
	  
	  
	  
	  int middle = (int) ll.get(ll.size()/2);
	  System.out.println("Middle Element:-"+middle);
}
  
}
