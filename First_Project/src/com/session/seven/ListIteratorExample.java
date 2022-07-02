package com.session.seven;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;

public class ListIteratorExample {
	public static void main(String[] args) {
		String[] names = { "dapo", "parv", "gbenga", "musty", "pradeep", "solomon", "apple" };
		List<String> list = new LinkedList<>(Arrays.asList(names));
		ListIterator<String> iter = list.listIterator();
		while (iter.hasNext()) {
			System.out.println(iter.next());
		}
		ListIterator iter1 = list.listIterator(list.size());
		while (iter1.hasPrevious()) {
			System.out.println(iter1.previous());
		}

	}

}
