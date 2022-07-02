package com.session.second;

public class FinalExampleTest {
	public static void main(String[] args) {
		
		System.out.println("Calling final class "+ FinalExample2.business_unit);
	    
		//instant of FinalExample2
		FinalExample2 obj = new FinalExample2();
		
		FinalExample2.doSomething("Solomon ");
	    FinalExample2.doSomething("Dapo ");
	    obj.doSomething("kola ");
	  //  Math obj = new Math();
	    for (int i=0;i<10;i++) {
	    System.out.println(Math.E);
	    }
	}
}
