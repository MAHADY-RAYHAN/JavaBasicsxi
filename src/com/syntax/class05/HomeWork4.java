package com.syntax.class05;

import java.util.Scanner;

public class HomeWork4 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
//		Program to find largest number among three numbers using nested if 
//		provided by a user (numbers must be distinct)
		System.out.println("Please enter First Number");
		double firstNum = input.nextDouble();

		System.out.println("Please enter 2nd Number");
		double secondNum = input.nextDouble();

		System.out.println("Please enter 3rd Number");
		double thirdNum = input.nextDouble();
		double number;

		if (firstNum > secondNum || firstNum > thirdNum) {
			number = firstNum;

		} else {
			if (secondNum > firstNum && secondNum > thirdNum) {
				number = secondNum;
			} else {
				number = thirdNum;
			}

		}
		System.out.println("The largest number is the " + number);

//		int a=10;
//		int b=20;
//		int c=30;
//		if (a>b & b>c);{
			
//		}
	}
}
