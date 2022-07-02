package com.session.four;

public class StringExample {
public static void main(String[] args) {
	String x = "Java";
	String y = x.concat("Rule");
	System.out.println(y);
	System.out.println(x);
	x=null;
	y=null;
	System.out.println(y);
	System.out.println(x);
}
}
