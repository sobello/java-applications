package com.session.six;

import java.util.Stack;

public class StackExample2 {
public static void main(String[] args) {
	
	Stack<String> stack = new Stack<String>();
	stack.push("sol");
	stack.push("mandeep");
	stack.push("kiran");
	stack.push("musty");
	stack.push("dappy");
	stack.push("gbenga");
	//stack.push("parv");
	stack.push(PropertyExample.getProperty("stack.value"));
	
	/*System.out.println("remove "+ stack.pop());
	System.out.println("after pop " + stack);
	System.out.println("remove "+stack.pop());
	System.out.println("after pop " + stack);
	System.out.println("remove "+stack.pop());
	System.out.println("after pop " + stack);
	System.out.println("remove "+stack.pop());
	System.out.println("after pop " + stack);
	System.out.println("remove "+stack.pop());
	System.out.println("after pop " + stack);
	System.out.println("remove "+stack.pop());
	System.out.println("after pop " + stack);
	System.out.println("remove "+stack.pop());
	*/
	//System.out.println("remove "+stack.pop());
	while(!stack.isEmpty()) {
		System.out.println("remove "+stack.pop());
		
	}
	
	
}
}
