package com.rays.collectionfream;

import java.util.PriorityQueue;

public class  PQueue {
public static void main(String[] args) {
     PriorityQueue p = new PriorityQueue();

      p.add(20);
      p.add(10);
      p.add(23);
      p.add(34);
   System.out.println(p);
  p.poll();
    System.out.println(p);
 
   p.poll();
   System.out.println(p);
}
}
