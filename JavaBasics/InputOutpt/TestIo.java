package com.rays.InputOutpt;

import java.io.File;
import java.security.acl.LastOwnerException;
import java.util.Date;

public class TestIo {   
 public static void main(String[] args) {
	
	File f = new File("C:\\Users\\HP\\eclipse-workspace\\BASIC JAVA\\src\\Exercise");
	if(f.exists()) {
       System.out.println("name " + f.getName());
     System.out.println("Absolute path " +f.getAbsolutePath());
     System.out.println("is writable " + f.canWrite());
     System.out.println("is redable "+f.canRead());
     System.out.println("is file " +f.isFile());
     System.out.println("is directory "+ f.isDirectory());
     System.out.println("Last modified at "+new Date(f.lastModified()));
     System.out.println("length  " +f.length()+ "byte long.");
     System.out.println("Delete " +f.delete());
    System.out.println("rename "+f.renameTo(f));
    System.out.println("mkdir "+f.mkdirs());
    System.out.println("String " +f.toString());
    System.out.println("File is "+f.list());
    System.out.println("File is "+f.listFiles());
    System.out.println("Name is "+f.getName());
	System.out.println("Exists "+f.exists());
	System.out.println("Modified "+f.lastModified() );
	
	
	}
 } 
}
