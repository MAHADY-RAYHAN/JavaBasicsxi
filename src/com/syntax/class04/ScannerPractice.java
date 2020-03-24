package com.syntax.class04;

import java.util.Scanner;

public class ScannerPractice {

	public static void main(String[] args) {
		/*
		 * Ask the user to enter their age "Please enter your age" and his/her gender "Please enter your gender: M or F"

You have 2 conditions:
If age is above 25, then check if a user entered F then the output should be "Woman" otherwise it should say "Man"
If age is below 25, then check if a user entered F then the output should be "Girl" otherwise it should say "Boy"

Example Output: 
Please enter your age
Please enter your gender: M or F
Man
		 */
		
		Scanner gender=new Scanner(System.in);
		  
		  System.out.println("Please enter your age");
		  int age=gender.nextInt();

		  System.out.println("Please enter your gender");
		  char c=gender.next().charAt(0);
		  
		  char c1='F';
		  char c2='M';
		  
		  if(age>25 & c==c1) {
			System.out.println("Women");
		  }else if(age>25 & c==c2) {
			  System.out.println("Men");
		  }else if(age<25 & c==c1) {
				  System.out.println("Girl");
			  }else {
				  System.out.println("Boy");
			  }
		  
		  
		  
		 }

}
