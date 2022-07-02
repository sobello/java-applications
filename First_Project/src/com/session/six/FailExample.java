package com.session.six;

import java.util.*;

public class FailExample {
	public static void main(String args[]) {
		
		String[] element = new String[] {"one","two"};
		List list = new ArrayList(Arrays.asList(element));
		Iterator i = list.iterator();
		while (i.hasNext()) {
			System.out.println(i.next());
			//the below line will cause concurrent modification exception 
			//because we are trying to modify the Collection while iterating it
			list.add("one");
		}
	}
}
