package com.rays.collectionfream;

import java.util.Vector;

public class VectorElement {
public static void main(String[] args) {
	Vector v = new Vector();
	
	v.add("one");
	v.add("two");
	v.add("three");
	v.add("for");
	Integer i =new Integer(5);
	v.add(i);
  System.out.println(v);

	Integer j = (Integer)v.get(4);

System.out.println(j);
}
}
