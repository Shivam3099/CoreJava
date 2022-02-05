package com.rays.basics;

public class CountCharAt {
public static void main(String[] args) {
	String s ="Shivam patel";
    int s1=0;
    int s2=0;	
   int s3=0;
    
    char c='a';
	char d ='v';
    char z='m';
	
	for (int i = 0; i < s.length(); i++) {
	if (c==s.charAt(i)) {
	s1++;	
	}

if(d==s.charAt(i)) {
	s2++;
	}

if(z==s.charAt(i)) {
s3++;
}
}
System.out.println("for cha a="+s1);
System.out.println("for cha v="+s2);
System.out.println("for cha m="+s3);


}
}
