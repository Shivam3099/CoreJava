package com.rays.collectionfream;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Iterator;

import Exercise.ArrayLargest;

public class Question1 {

	public static void main(String[] args) {
		ArrayList a = new ArrayList();
	
	a.add("rays");
	a.add("Technology");
	a.add("Indore");
	System.out.println(a);
	Iterator it = a.iterator();
	while (it.hasNext()) {
		Object o = (Object) it.next();
		System.out.println(o);
     }	
     }
     }
