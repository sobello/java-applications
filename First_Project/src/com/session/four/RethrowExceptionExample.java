package com.session.four;

public class RethrowExceptionExample {   
	public static void test1() throws Exception {
		System.out.println("The Exception in test1() method");       
		throw new Exception("thrown from test1() method");
		}    
	public static void test2() throws Throwable {
			try {
				test1();
			} catch(Exception e) {
					System.out.println("Inside test2() method");
					//throw e;  
					}
			}  
	public static void main(String[] args) {
				try {
					test2();
					} catch(Exception e) {
						System.out.println("Caught in main");
						} catch(Throwable t) {
							System.out.println("Throwable");
						}
		
				}
			}

