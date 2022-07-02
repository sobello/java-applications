package com.session.first;

import com.session.second.MethodExample;

public class HelloWorld2 extends MethodExample {
	public static void main(String[] args) {
		// Instantiating class or creating object or class HelloWorld
		HelloWorld2 helloWorld2 = new HelloWorld2();

		System.out.println("Hi Everyone");
		System.out.println("Hi Dappy");
		System.out.println("Hi Parv");

		// calling another class method using inheritance
		System.out.println("calling  doMultiply using inheritance " + helloWorld2.doMultiply(9, 5));
	}
}
