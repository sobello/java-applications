package com.session.six;

import java.util.Vector;

public class CloningExample {
	public static void main(String[] args) {
		int a = 5;
		System.out.println(a);
		doOperation(a);
		System.out.println("after calling method "+a);
		
		Vector<String> input = new Vector<String>();
		input.add("dappy");
		input.add("musty");
		input.add("gbenga");
		System.out.println("input "+ input);
		Vector<String> shallow1 = getShallowCopy(input);
		System.out.println("shallow1 - "+ shallow1);
		shallow1.add("solomon");
		
		doOperation(input);
		//System.out.println();
		
		System.out.println("input after caling doOperation()"+ input);
		System.out.println("shallow1 after adding to shallow "+ shallow1);
		
		
		/*System.out.println("deep1 - "+ getDeepCopy(input));
		System.out.println("shallow2 - "+ getShallowCopy(input));
		System.out.println("deep2 - "+ getDeepCopy(input));
		*/
		
	}
//copy of int a get passed
	public static void doOperation(int a) {
		a=a+1;
				
	}
	//reference of Vector<String> get passed
	public static void doOperation(Vector<String> input) {
		
		input.add("amandeep");
		
	}
		
	public static Vector<String> getShallowCopy(Vector<String> input) {

		return (Vector<String>) input.clone();

	}

	public static Vector<String> getDeepCopy(Vector<String> input) {
     Vector<String> result = new Vector<>();
     
     for (int i=0;i<input.size();i++) {
    	 
    	 result.add(input.get(i));
    	   	 
     }
     return result;

	}

}
