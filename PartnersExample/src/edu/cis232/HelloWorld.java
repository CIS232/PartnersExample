package edu.cis232;

import java.util.Scanner;

public class HelloWorld {

	public static void main(String[] args) {
		Scanner keyboard = new Scanner(System.in);
		System.out.println("What is your name?");
		String name = keyboard.nextLine();
		
		System.out.printf("Hello %s!%n", name);
		System.out.println("Goodbye Earth!");
	}

}
