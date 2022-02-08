package com.rays.oop;

public class TextPerson {

public static void main(String[] args) {
 	
     Person p = new Person();

      p.setName("Shivam patel");
      System.out.println(p.getName());
       
       p.setDob("30/06/1999");
       System.out.println(p.getDob());

       p.setAddress("Bholaram ustad marg,indore(m.p)452014");
       System.out.println(p.getAddress());

      System.out.println(Person.age);
       

}
}
