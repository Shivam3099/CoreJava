package com.rays.basics;

public class StringReverse2 {
public static void main(String[] args) {
	String s1="Shivam patel";
	System.out.println();		
String[] s2=s1.split(" ");
for(String k:s2) {
System.out.println(k);
}
for(String k :s2) {
for (int i = k.length();i>=1; i--) {
	System.out.print(k.charAt(i-1));
}
}
}
}