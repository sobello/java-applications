package com.session.first;

import com.session.second.MethodExample;

public class HelloWorld {
	public static void main(String[] args) {
		System.out.println("Hi Solomon");

		// System.out.println("hi Solomon - Add1 "+ doAdd(3,3));

		// Instantiating class or creating object or class HelloWorld
		HelloWorld helloWorld = new HelloWorld();

		// Instantiating class or creating object of MethodExample
		MethodExample methodExample = new MethodExample();

		// calling static method using class name
		System.out.println("hi Solomon2 - Add " + HelloWorld.doAdd(9, 5));

		// calling non-static method using class reference
		System.out.println("hi Solomon3 - Subtract " + helloWorld.doSubtract(9, 5));

		// calling static method using class reference/object
		System.out.println("hi Solomon4 - Add " + helloWorld.doAdd(9, 5));

		// calling static method inside static method
		System.out.println("hi Solomon5 - Add " + doAdd(9, 5));

		// calling non-static method from another package (com.session.second)
		System.out.println("calling  doMultiply method " + methodExample.doMultiply(9, 5));

	}

	public static int doAdd(int a, int b) {
		return a + b;
	}

	public static int doSubtract(int a, int b) {
		return a - b;
	}

}
