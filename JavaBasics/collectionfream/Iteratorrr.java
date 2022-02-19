package com.rays.collectionfream;

import java.util.ArrayList;
import java.util.Iterator;

public class Iteratorrr {
public static void main(String[] args) {
	ArrayList v  = new ArrayList();
  
     v.add("ram");
     v.add("shyam");
     v.add("mohan");
     v.add("sohan");

    Iterator it =  v.iterator();

   while(it.hasNext()){
	 Object o = it.next();   
  
	 
   System.out.println(it.next());
   
   }   
   }  
}
