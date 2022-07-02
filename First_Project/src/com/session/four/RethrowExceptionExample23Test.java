package com.session.four;

public class RethrowExceptionExample23Test {

	public static void main(String[] args) {
		try {
			RethrowExceptionExample3.test2();
		} catch (Exception e) {
			System.out.println("Caught in main");
		} catch (Throwable t) {
			System.out.println("Throwable");
		}

	}
}
