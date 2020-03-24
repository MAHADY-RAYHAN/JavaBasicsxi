package com.syntax.class06;

import java.util.Scanner;

public class HW2 {

	public static void main(String[] args) {
//		Allow user to enter grade and then provide
//		explanation: A-Excellent, B-Good, C-Average,
//		D-Bad, any other grade --> Not Acceptable. At the
//		end your program should print which grade was
//		entered by a user with explanation

		Scanner scan;
		String grade;
		String userEntry;
		scan = new Scanner(System.in);

		System.out.println("Please enter your grade");
		grade = scan.nextLine();
		userEntry = "User entered grade is " + grade;

		switch (grade) {
		case "A":
			grade = "Excellent";
			break;
		case "B":
			grade = "Good";
			break;
		case "C":
			grade = "Average";
			break;
		case "D":
			grade = "Bad";
			break;
		default:
			grade = "Not acceptable";

		}
		System.out.println(userEntry + " " + "which is " + grade);
	}

}
