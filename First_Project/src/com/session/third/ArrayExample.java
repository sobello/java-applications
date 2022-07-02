package com.session.third;

import java.util.Scanner;

public class ArrayExample {
	public void getInformation() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number of information you want to feed : ");
		int no = Integer.parseInt(sc.nextLine());
		String[] info = new String[no];
		
		for (int i = 0; i < info.length; i++) {
			System.out.println("Enter " + (i + 1) + " information");
			info[i] = sc.nextLine();
		}// end for loop i
		
		System.out.println("You have entered ");
        
		//Iterating the array
		for (int j = 0; j < info.length; j++) {
			System.out.println(info[j]);
		}//end for loop j
		sc.close();
	}//end method getInformation

}//end class
