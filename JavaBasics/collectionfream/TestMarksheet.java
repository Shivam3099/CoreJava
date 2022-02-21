package com.rays.collectionfream;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;

public class TestMarksheet {
public static void main(String[] args) {
	
	Marksheet m1 = new Marksheet();
	m1.setRollNo("3");
	m1.setFname("Divya");;
	m1.setlName("Sharma");
    m1.setPhy(75);
    m1.setChem(68);
    m1.setMaths(98);

    
    Marksheet m2 = new Marksheet();
	m2.setRollNo("3");
	m2.setFname("Shruti");;
	m2.setlName("Bhide");
    m2.setPhy(67);
    m2.setChem(93);
    m2.setMaths(85);
    
    Marksheet m3 = new Marksheet();
	m3.setRollNo("5");
	m3.setFname("Divya");;
	m3.setlName("Sharma");
    m3.setPhy(92);
    m3.setChem(72);
    m3.setMaths(99);
    
    
    
    Marksheet m4 = new Marksheet();
	m4.setRollNo("1");
	m4.setFname("Nikhil");;
	m4.setlName("Kanva");
    m4.setPhy(57);
    m4.setChem(76);
    m4.setMaths(68);
    
    
    
    Marksheet m5 = new Marksheet();
	m5.setRollNo("4");
	m5.setFname("Nikhil");;
	m5.setlName("Verma");
    m5.setPhy(68);
    m5.setChem(74);
    m5.setMaths(71);
    
    ArrayList a =new   ArrayList(); 
      a.add(m1);
      a.add(m2);
      a.add(m3); 
      a.add(m4);
      a.add(m5);
      
      
      Collections.sort(a,new OrderByName());

     Iterator it = a.iterator();
     
     while (it.hasNext()) {
		Marksheet m = (Marksheet) it.next();
		
		System.out.println(m.getRollNo()+" "+m.getFname()+" "+m.getlName()+" "+m.getPhy()+" "+m.getChem()+" "+m.getMaths());
	}



}
}
