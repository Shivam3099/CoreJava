package com.rays.collectionfream;

import java.util.ArrayList;

public class ArrayListtt {
public static void main(String[] args) {
	ArrayList a =new ArrayList();
	
	a.add("Rays");
	a.add("Tecnology");
	a.add("indore");
    a.add("NCS");
   int size =a.size();
for (int i = 0; i < size; i++) {
	System.out.println(i +";"+ a.get(i) +":--"+ size + ":---"+a.clone());
}
}
}
