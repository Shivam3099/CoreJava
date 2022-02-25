package com.rays.collectionfream;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;

public class TestEmployee1 {
	public static void main(String[] args) {
		
		ArrayList a =new   ArrayList(); 
		 a.add(new Employee1("Vimal","kushwah",2500));
		 a.add(new Employee1("Ram","solanki",2800));
		 a.add(new Employee1("Syam","verma",2600));
		 
		 
		 
	      Collections.sort(a);

	      for (Object o : a) {
			System.out.println(o);
		}
	}
}