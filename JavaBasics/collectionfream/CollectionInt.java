package com.rays.collectionfream;

import java.util.ArrayList;
import java.util.List;

public class CollectionInt {
public static void main(String[] args) {	
	List list = new ArrayList<>();
	
      list.add(56);
	  list.add(34);
	  list.add('a');
	  list.add("nishil");
	 
	  for (Object o : list) {
		System.out.println(o);
	} 
	  
	  System.out.println(list);
	  
	  System.out.println(list.remove(3));
	  System.out.println(list.removeAll(list));
	  
	  List l = new ArrayList<>();
	  l.add(34);
	  l.add(56);
	  l.add("nishil");
	  l.add('a');
	  l.add(7089);
	  //l.addAll(list);
	//  System.out.println(l);
//	  l.clear();
	  //System.out.println(l);
	 
	  //System.out.println(list.contains("1000"));
	  //System.out.println(l.containsAll(list));
	  //System.out.println(l.isEmpty());
	  //System.out.println(l.remove("nishil"));
     System.out.println(l.retainAll(list));



}
}
