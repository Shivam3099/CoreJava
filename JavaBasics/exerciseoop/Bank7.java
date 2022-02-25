package com.rays.exerciseoop;

public class Bank7 {
   private static String name;
   private static int branchCode;
   public Bank7() {}
   public Bank7(String n, int br) {
	name =n;
	branchCode = br;
	

}
public static String getName() {
	return name;
}

public static String adress() {
	return (name+branchCode);
	
}
}