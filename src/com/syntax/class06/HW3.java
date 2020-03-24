package com.syntax.class06;

import java.util.Scanner;

public class HW3 {
	public static void main(String[] args) {
//		HomeWork: Using scanner class create
//		calculator. Allow user to enter 2 numbers and
//		operator(+,-,*,/). Based on operator provide the
//		result to user
		Scanner scan;
		int a;
		int b;
		int results = 0;
		char operators;
		char enteredOpe;
		
		scan=new Scanner(System.in);
		
		System.out.println("please enter first number");
		a=scan.nextInt();
		System.out.println("please enter second number");
		b=scan.nextInt();
		System.out.println("please enter your desired operator");
		operators=scan.next().charAt(0);
		enteredOpe=operators;
		
		switch (operators){
		case '+':
			results=a+b;
			break;
		case '-':
			results=a-b;
			break;
		case '*':
			results=a*b;
			break;
		case '/':
			results=a/b;
			break;
			default:
				System.out.println("invalid operator");
		}
		System.out.println("Based on your operator "+enteredOpe+" your result is "+results);
		//System.out.println("Based on your operator your result is "+operators);
		//if(results!=0) {
			//System.out.println("Based on your operator "+enteredOpe+" your result is "+results);
		//}
	}

}
