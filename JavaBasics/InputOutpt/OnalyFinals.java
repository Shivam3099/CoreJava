package com.rays.InputOutpt;

import java.io.File;

public class OnalyFinals {
	

	public static void main(String[] args) {
		File Directory = new File("C:\\Users\\HP\\eclipse-workspace\\BASIC JAVA\\src\\Exercise");
      File[] list = Directory.listFiles();
		for(int i = 0; i<list.length;i++) {
		if (list[i].isFile()) {
			System.out.println((i+1)+";"+list[i].getName());
}
}
}
}
