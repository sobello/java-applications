package com.session.third;

import java.util.Scanner;

public class SwitchExample {

	public void doOperation() {
		printMenu();
		Scanner sc = new Scanner(System.in);
		String input = "";
		do {
			System.out.println("Enter your choice: ");
			input = sc.next();

			switch (input.toUpperCase()) {
			case "A":
				System.out.println("Enter first Number ");
				int a = Integer.parseInt(sc.next());
				System.out.println("Enter first Number ");
				int b = Integer.parseInt(sc.next());
				int result = CalculatorOperations.doAdd(a, b);
				System.out.println("Sum= " + result);
				break;
			case "B":
				System.out.println("Enter first Number ");
				int a1 = Integer.parseInt(sc.next());
				System.out.println("Enter first Number ");
				int b1 = Integer.parseInt(sc.next());
				int result1 = CalculatorOperations.doSubtract(a1, b1);
				System.out.println("Difference = " + result1);
				break;
			case "C":
				System.out.println("Enter first Number ");
				int a2 = Integer.parseInt(sc.next());
				System.out.println("Enter first Number ");
				int b2 = Integer.parseInt(sc.next());
				int result2 = CalculatorOperations.doMultiply(a2, b2);
				System.out.println("Multiplication = " + result2);
				break;
			case "D":
				System.out.println("Enter first Number ");
				int a3 = Integer.parseInt(sc.next());
				System.out.println("Enter first Number ");
				int b3 = Integer.parseInt(sc.next());
				double result3 = CalculatorOperations.doDivide(a3, b3);
				System.out.println("Division = " + result3);
				break;
			case "?":
				printMenu();
				break;
			case "Q":
				System.out.println("Exiting Caluclator...");
				break;
			default:
				System.out.println("Invalid option");
			}
		}while(!input.toUpperCase().equals("Q") || input.length() !=1);
		
		sc.close();
	} // end method doOperation()

	public void printMenu() {
		System.out.println("Welcome to Client-Server Chat! ");
		System.out.println("Please Select below Options");
		System.out.print("Choice\t\tAction\n" +
		"------\t\t------\n" +
		"A\t\tAdd\n" + 
		"B\t\tSubstract\n" +
		"C\t\tMultiply\n" +
		"D\t\tDivide\n" +
		"Q\t\tQuit\n" + 
		"?\t\tDisplay Help\n");
	}
}
