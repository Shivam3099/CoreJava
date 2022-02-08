package com.rays.oop;


import java.text.SimpleDateFormat;
import java.util.Date;

public class Person {
private String name = null;
Date d= new Date();

SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
String dob = sdf.format(d);
private String address =null;

public static final int age = 23;
     
public String getName() {
	return name;
}

public void setName(String name) {
	this.name = name;
}

public String getDob() {
	return dob;
}

public void setDob(String dob) {
	this.dob = dob;
}

public String getAddress() {
	return address;
}

public void setAddress(String address) {
	this.address = address;

}

}




