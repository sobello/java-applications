package com.session.four;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

import com.session.six.PropertyExample;

public class ObjectWriter {
	public static void main(String[] args) {
		Person p1 = new Person("Johnson", 30, "Male");
		Person p2 = new Person("Rachel", 25, "Female");
		try {
			String filePath = PropertyExample.getProperty("object.file");
			System.out.println(filePath);
			//FileOutputStream f = new FileOutputStream(new File("myObjects.txt"));
			FileOutputStream f = new FileOutputStream(new File(filePath));
			
			ObjectOutputStream o = new ObjectOutputStream(f); // Write objects to file
			o.writeObject(p1);
			o.writeObject(p2);
			o.close();
			f.close();
		} catch (FileNotFoundException e) {
			System.out.println("File not found");
		} catch (IOException e) {
			System.out.println("Error initializing stream");
		}
		/*
		 * catch (ClassNotFoundException e) { // TODO Auto-generated catch block
		 * e.printStackTrace(); } }
		 */
	}
}
