package com.session.six;

import java.util.Stack;

public class StackExample {
	public static void main(String args[]) {
		Stack s = new Stack();
		s.push("Autumnal Tints");
		s.push("A Week on the Concord and Merrimack Rivers");
		s.push("The Maine Woods");
// Check out what's next to read
		System.out.println("Top element: " + s.peek());
		s.push("Civil Disobedience, Solitude and Life Without Principle"); // Read a book
		System.out.println(s.pop());
		s.push("Walden");
		s.push("The Natural Man");
// Find that other book
		int count = s.search("Walden");
		System.out.println(count + " " + s  );
		while (count != -1 && count > 1) {
			System.out.println(s.pop()); 
			count--;
		}
// Read a book System.out.println(s.pop()); // Anything left? 
		System.out.println(s.empty());
	}
}
