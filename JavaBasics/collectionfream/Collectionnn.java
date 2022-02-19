package com.rays.collectionfream;

import java.util.ArrayList;
import java.util.Collection;
import java.util.LinkedList;
import java.util.List;

public class Collectionnn {
 public static void main(String[] args) {
  List l = new ArrayList<>();
       l.add(10);
       l.add(15);
       l.add("Sagar");
       l.add("Mandloi");
      // l.add(3, "Shreeom");
      //  System.out.println(l);
     
      //  System.out.println(l.get(3));
      //  System.out.println(l.remove(1));
      //  l.set(3, "raju");
      // System.out.println(l);
       
     //  System.out.println(l.subList(1, 3));
    // System.out.println(l.indexOf("Mandloi"));
     //   System.out.println(l.lastIndexOf("Mandloi"));
 
 List s =new LinkedList<>(); 
 
     s.add("saikhediya");
     s.add("sagar");
     s.add("Badya maharaj");
     s.add("shreom");
 
      System.out.println(s.addAll(4, l));
 
 
 
 }
 }