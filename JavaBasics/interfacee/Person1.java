package com.rays.interfacee;


public class Person1 {

protected String fname ;
protected String lname ;
protected String address;


public Person1(String fn  ,String ln ,String Address){
	this(fn, ln);
	System.out.println("3 params constructor is called ");
}
public Person1(String fn,String ln){
	this();
System.out.println("2 params constructor is called ");
}
public Person1() {
	System.out.println("person default constructor");

}
 public static void main(String[] args) {
	Person1 p = new Person1("10","20","30");
}
}