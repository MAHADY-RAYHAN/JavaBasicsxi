package com.syntax.class12;

import java.util.Scanner;

public class Test2 {

	public static void main(String[] args) {
//		Using Scanner class input string value. 
//		Print out the following: "The first 3 letters of ___ is ___"
//
//		For example, if the input is "banana", your output should be: 
//		"The first 3 letters of banana is ban".
		Scanner scan = new Scanner(System.in);
		String fruits;

		System.out.println("please enter any fruits name");
		fruits = scan.nextLine();

		System.out.print(fruits.charAt(0));
		System.out.print(fruits.charAt(1));
		System.out.println(fruits.charAt(2));
		
	    
	   
	}

}
