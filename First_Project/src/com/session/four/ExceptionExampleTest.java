package com.session.four;

public class ExceptionExampleTest {
  public static void main(String[] args) {
	  
	  
	  ExceptionExample obj = new ExceptionExample();
	  try {
	  System.out.println(obj.doDivide(5, 0));
	  }catch(Exception e) {
		  //do not comment below two lines,otherwise it is called eating an exception
		  
		 System.out.println("exception "+e.getMessage());
		 e.printStackTrace();
	  }
	  ExceptionExample obj2 =  null;
	  System.out.println(obj2.doDivide(5, 0));
}
}
