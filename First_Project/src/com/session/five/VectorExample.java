package com.session.five;

import java.util.Collection;
import java.util.Collections;
import java.util.Enumeration;
import java.util.List;
import java.util.Vector;

public class VectorExample {
	public static void main(String[] args) {
//Collection<String> vector = new Vector<>();
//Vector<String> vector1 = new Vector<>();
		List<String> vector = new Vector<>();
		vector.add("dapy");
		vector.add("musty");
		vector.add("parv");
		System.out.println(vector);
		Vector<String> vector2 = new Vector<>();
		vector2.add("class");
		vector2.add("23");
		vector2.add("solo");
		vector.addAll(vector2);
		System.out.println(vector);
		List<String> vector3 = new Vector<>();
//vector3.add(2); //Auto Boxing, that is (new Integer(2));
//vector3.add(new Integer(2));
		vector3.add("23");
		vector3.add("solo");

//vector2.removeAll(vector3);
		System.out.println(vector2);
//vector2.retainAll(vector3);//vector2 retain all elements of vector3 if common(present)
//System.out.println(vector2);
		vector2.set(0, "april");
		System.out.println(vector2);
//size
		System.out.println(vector2.size());
		System.out.println(vector.size());
		System.out.println(vector3.size());
//capacity
		System.out.println(vector2.capacity());
//trim
//vector2.trimToSize();
		System.out.println(vector2.capacity());
		for (int i = 4; i <= 10; i++) {
			vector2.add("gbenga" + i);
		}
		vector2.add("apple");
		vector2.add("Samsung");
		System.out.println(vector2.capacity());
//System.out.println(vector.size());
//System.out.println(vector3.size());
		for (int i = 0; i < vector.size(); i++) {
			System.out.print(vector.get(i) + " ");
		}
		System.out.println("\nFirst Element : " + vector2.firstElement());
		System.out.println("Last Element : " + vector2.lastElement());
//Collections.sort(vector2);
		System.out.println(vector2);
		Enumeration e = vector2.elements();
		while (e.hasMoreElements()) {
			System.out.print(e.nextElement() + " ");
		}
//comparing one collection with specific element
		if (vector2.contains("musty")) {
			System.out.println("\n\nfound");
		} else {
			System.out.println("\n\nnot found");
		}
//comparing one collection with another collection
		if (vector2.containsAll(vector3)) {
			System.out.println("\n\nfound");
		} else {
			System.out.println("\n\nnot found");
		}
		System.out.println("Before Sort : " + vector2);
//copying entire data of vector2 to vlast
		Vector vlast = (Vector) vector2.clone(); // casting (Vector)
		Collections.sort(vlast);
		System.out.println("After Sort : " + vlast);
	}

}
