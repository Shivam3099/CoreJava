package com.rays.oop;

public class SevingAccConst {
public static void main(String[] args) {
	
	AccountConst s = new AccountConst("HF12435490", "Seving",5000);
	System.out.println(s.getAccountNum());
    System.out.println(s.getAccountType());
    System.out.println ( s.getBalance());

   AccountConst s1 = new AccountConst("BOI17182876","current",10000);
   System.out.println(s1.getAccountNum());
  System.out.println(s1.getAccountType());
   System.out.println(s1.getBalance());

}
}
