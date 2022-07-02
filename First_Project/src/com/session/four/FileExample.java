package com.session.four;

import java.io.*; // classes from java.io 
class FileExample {
	public static void main(String[] args) {
		File file = new File("fileWrite1.txt"); // There's no // file yet!
System.out.println(file.exists());
try {
	file.createNewFile();
	
} catch (IOException fnfe) {
	fnfe.printStackTrace();
}
System.out.println("After createNewFile "+file.exists());
	}
}
