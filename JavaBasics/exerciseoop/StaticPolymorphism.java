package com.rays.exerciseoop;

public class StaticPolymorphism {
    
	int a;
	int b;
    int c;
    public void sum (int a, int b) {
    System.out.println( a + b );
    }
    public void sum(int a,String s,int b) {
    System.out.println( a + s + b );
    }
    public void sum(int a,int b,double d,String s) {
        System.out.println( a + b + d +s );
        }
    
    public static void main(String[] args) {
    	StaticPolymorphism p=new StaticPolymorphism();
//    	p.sum(10, 20, 10.53, "shivam");
//    	p.sum(10,20);
    p.sum(10, "sagar", 10);
    }    
}
