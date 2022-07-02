package com.session.third;

public class OverloadingExample {
	public int add(int a, int b) {
		return a + b;
	}

//Overloading add method
	public int add(int a, int b, int c) {
//
		return add(a, b) + c;
	}

}