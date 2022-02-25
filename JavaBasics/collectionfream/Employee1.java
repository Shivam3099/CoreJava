package com.rays.collectionfream;

import java.util.Comparator;

public class Employee1 implements Comparable < Employee1> {
 
public String fName;
public String lName;
public int salary;

public Employee1() {}

public  Employee1(String s,String s1,int i) {
this.fName=s;
this.lName=s1;
this.salary=i;
}


@Override
public int compareTo(Employee1 o) {

	return fName.compareTo(o.fName);
	
}
public String toString() {
return fName+" "+lName+", "+ salary;
}
}
