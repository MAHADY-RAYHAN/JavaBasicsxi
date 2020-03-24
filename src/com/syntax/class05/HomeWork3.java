package com.syntax.class05;

import java.util.Scanner;

public class HomeWork3 {

	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
//		Write a program to find largest of three double values using
//		if-else..if and logical operators provided by 
//		a user (numbers must be distinct)
		System.out.println("Please enter First decimal Number");
		double firstNum=input.nextDouble();
		
		System.out.println("Please enter 2nd decimal Number");
		double secondNum=input.nextDouble();
		
		System.out.println("Please enter 3rd decimal Number");
		double thirdNum=input.nextDouble();
		double number;
		
		if(firstNum>secondNum && firstNum>thirdNum) {
			number=firstNum;
		}else if(secondNum>firstNum && secondNum>thirdNum){
			number=secondNum;
		}else {
			number=thirdNum;
		}
		System.out.println("The largest number is the "+number);

	}

}
