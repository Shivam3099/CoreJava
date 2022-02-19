package com.rays.collectionfream;

import java.util.Enumeration;
import java.util.Vector;

public class TestEnumeration {
public static void main(String[] args) {
	Vector v = new Vector<>();

   v.add(10);
   v.add(20);
   v.add(25);

   Enumeration e = v.elements();
   while (e.hasMoreElements()) {
	Object o = (Object) e.nextElement();
	System.out.println(o);
}
}
}
