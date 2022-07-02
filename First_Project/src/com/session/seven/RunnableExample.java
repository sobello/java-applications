package com.session.seven;

import java.util.Arrays;
import java.util.List;

public class RunnableExample {
	public static void main(String[] args) {
		String[] array = { " ", " ", " " };
		List<String> useList = Arrays.asList(array);
		List<List<String>> sliceList = null;
		System.out.println("main method starts");
		MyRunnable obj = new MyRunnable("pradeep");
		MyRunnable obj2 = new MyRunnable("musty");
		MyRunnable obj3 = new MyRunnable("dapo");
		MyRunnable obj4 = new MyRunnable("solomon");
		MyRunnable obj5 = new MyRunnable("parv");
		MyRunnable obj6 = new MyRunnable("gbenga");
		Thread th = new Thread(obj);
		Thread th2 = new Thread(obj2);
		Thread th3 = new Thread(obj3);
		Thread th4 = new Thread(obj4);
		Thread th5 = new Thread(obj5);
		Thread th6 = new Thread(obj6);
		th.start();
		th2.start();
		th3.start();
		th4.start();
		th5.start();
		th6.start();
		System.out.println("main method ends");
	}

}