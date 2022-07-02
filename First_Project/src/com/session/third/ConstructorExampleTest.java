package com.session.third;

public class ConstructorExampleTest {
   public static void main(String[] args) {
	
	   ConstructorExample obj = new ConstructorExample(); 
	   
	   System.out.println(obj.getSession());
	   System.out.println(obj.getNoOfPersons());
	   
	   ConstructorExample obj2 = new ConstructorExample("kola",12);
	   System.out.println("session= "+ obj2.getSession());
	   System.out.println("no of persons= "+ obj2.getNoOfPersons());
	   System.out.println("object= "+ obj2);
   }
   
}
