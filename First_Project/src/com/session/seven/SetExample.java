package com.session.seven;

import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class SetExample {
	public static void main(String[] args) {
		Set<String> set = new HashSet<>();
		set.add("dapo");
		set.add("parv");
		set.add("gbenga");
		set.add("musty");
		set.add("solomon");
		set.add("pradeep");
		set.add("dapo");
		System.out.println("Set after adding duplicates : " + set);
		System.out.println("Set size after adding duplicates : " + set.size());
		String[] names = { "dapo", "parv", "gbenga", "musty", "pradeep", "solomon", "apple" };
		Set<String> set2 = new HashSet<>(Arrays.asList(names)); // another way of declaring collection
		System.out.println("Another hashset : " + set2);
		set2.add("ontario");
		System.out.println("Another hashset : " + set2);
		if (set2.add("gbenga")) {
			System.out.println("After trying to add duplicates ");
		} else {
			System.out.println("Else part of adding duplicates to set");
		}
//order of adding elements plus duplicates
		Set<String> set3 = new LinkedHashSet<>(Arrays.asList(names));
		set3.add("ontario");
		System.out.println("LinkedHashSet 3: " + set3);
		String[] name2 = { "dapo", "grape" };
		Set<String> set4 = new HashSet<>(Arrays.asList(name2));
		set2.retainAll(set4);
		System.out.println("Base Set after retaining set4 :" + set2);
		set2.removeAll(set4);
		System.out.println("Base Set after removing set4 :" + set2);
//iterating elements
		Iterator<String> it = set.iterator();
		while (it.hasNext()) {
			System.out.println(it.next());
		}
		Set<String> treeSet = new TreeSet<>();
		treeSet.add("dapo");
		treeSet.add("parv");
		treeSet.add("gbenga");
		treeSet.add("musty");
		treeSet.add("solomon");
		treeSet.add("pradeep");
		treeSet.add("dapo");
		System.out.println("TreeSet : " + treeSet);
		treeSet.add("ontario");
		treeSet.add("1musty");
		System.out.println("TreeSet after adding new element: " + treeSet);
		Set<String> treeSet2 = new TreeSet<>(Collections.reverseOrder());
		treeSet2.add("dapo");
		treeSet2.add("parv");
		treeSet2.add("gbenga");
		treeSet2.add("musty");
		treeSet2.add("solomon");
		treeSet2.add("pradeep");
		treeSet2.add("dapo");
		System.out.println("TreeSet 2 : " + treeSet2);
	}

}
