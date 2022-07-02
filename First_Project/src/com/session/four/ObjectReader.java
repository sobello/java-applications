package com.session.four;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.util.List;

public class ObjectReader {
	public static void main(String[] args) {

		try {

			FileInputStream fi = new FileInputStream(new File("myObjects.txt"));

			ObjectInputStream oi = new ObjectInputStream(fi);
			// Read objects
			
			Person pr1 = (Person) oi.readObject();
			Person pr2 = (Person) oi.readObject();
			System.out.println(pr1.toString());
			System.out.println(pr2.toString());
			System.out.println("");
			System.out.println("Name \tAge \tGender");
			//System.out.println(pr1.get(0).toString());
		
			oi.close();
			fi.close();
		} catch (FileNotFoundException e) {
			System.out.println("File not found");
		} catch (IOException e) {
			System.out.println("Error initializing stream");
		} catch (ClassNotFoundException e) { // TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
