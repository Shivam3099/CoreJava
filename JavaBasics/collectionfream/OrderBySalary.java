package com.rays.collectionfream;

import java.util.Comparator;

public class OrderBySalary implements Comparator<Employee1> {

	
	
	public int compare(Employee1 o1, Employee1 o2) {
		
		
		if (o1.Salary >o2.Salary) {
		 return -1;	
		} else if (o1.Salary==o2.Salary() {
         return 0;
		}else {
			return 1;
			}
	}
	}


