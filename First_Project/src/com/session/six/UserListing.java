package com.session.six;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.util.List;

public class UserListing {
	public static void main(String[] args) {
		userList();
	}

	public static String userList() {
		try {
			// FileOutputStream outputStream = new
			// FileInputStream fi = new FileInputStream("userDetails2.txt");
			ObjectOperation obj = new ObjectOperation("userDetails2.txt");
			obj.readFile();

			System.out.println("REGISTERED USERS LIST");
			System.out.println("---------------------");
			System.out.println("First Name" + "\t\tLast Name" + "\t\tUser Id" + "\t\t\tPassword");
			System.out.println("----------" + "\t\t---------" + "\t\t-------" + "\t\t\t--------");

			
			List<UserDetails> outList = obj.readFile();
		//	System.out.println(outList);
			for (int m = 0; m < outList.size(); m++) {
				 System.out.println(outList.get(m).getFirstName()+ "\t\t\t" + outList.get(m).getLastName() + "\t\t\t"+ outList.get(m).getUserId()+ "\t\t\t"+ outList.get(m).getPassword());
			}
			

		} catch (FileNotFoundException e) {
			System.out.println("File not found");
		} catch (IOException e) {
			System.out.println("Error initializing stream " + e);

		} catch (ClassNotFoundException e) { // TODO Auto-generated catch block
			e.printStackTrace();
		}

		return null;
	}

}// end class
