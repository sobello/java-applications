package com.session.four;

public class RethrowExceptionExample2 {   
	public static void test1() throws Exception {
		System.out.println("The Exception in test1() method");       
		throw new Exception("thrown from test1() method");
		}    
}
