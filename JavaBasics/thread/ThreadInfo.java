package com.rays.thread;

public class ThreadInfo {
public static void main(String[] args) {
	
	Thread t = new Thread("Sagar");
}
    public static void log(String i,Thread t) {
    	System.out.println(i+"Thread Name: "+ t.getName());
    	System.out.println(t.getId());
}
}
