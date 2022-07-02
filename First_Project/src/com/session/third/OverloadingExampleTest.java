package com.session.third;

public class OverloadingExampleTest {
	public static void main(String[] args) {
		OverloadingExample obj = new OverloadingExample();
		System.out.println("add with two parameters : " + obj.add(4, 8));
		System.out.println("add with three parameters : " + obj.add(5, 8, 5));
	}

}
