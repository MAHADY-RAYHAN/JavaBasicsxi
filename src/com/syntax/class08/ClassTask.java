package com.syntax.class08;

import java.util.Scanner;

public class ClassTask {

	public static void main(String[] args) {

//		Print numbers from 1 to 50 except those that are divisible by 3

//		for (int i = 1; i < 51; i++) {
//			if (i % 3 == 0) {
//				continue;
//			}
//			System.out.println(i);
//
//		}

//		Create a program that will be asking user to apply for a credit 
//		card 10 times. As soon you get an “yes” from a user program should 
//		stop asking.
		Scanner s;
		String response;

		s = new Scanner(System.in);

		for (int i = 1; i <= 10; i++) {
			System.out.println("Do you want to apply for a credit card");
			response = s.nextLine();
			if (response.equalsIgnoreCase("yes")) {
				break;
			}

		}
		System.out.println("Congratulations");

	}

}
