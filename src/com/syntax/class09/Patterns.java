package com.syntax.class09;

import java.util.Scanner;

public class Patterns {

	public static void main(String[] args) {

//		for(int i=5;i>0;i--) {
//			//System.out.println(i);
//			for(int j=5;j>0;j--) {
//				System.out.print(j);
//			}
//			System.out.println();
//		}
//		System.out.println("-----------------");
//		for(int i=5;i>0;i--) {
//			//System.out.println(i);
//			for(int j=5;j>0;j--) {
//				System.out.print(i);
//			}
//			System.out.println();
//		}
		Scanner scan;
		int input;
		//int input1;
		scan=new Scanner(System.in);
		System.out.println("Please input a number"); 
		input=scan.nextInt();
		//System.out.println("Please input end number"); 
		//input1=scan.nextInt();
		for (int i = 1; i <= input; i++) {
			// System.out.println(i);
			for (int j = 1; j <= i; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		// i++;
		for (int i = input; i >= 1; i--) {
			// System.out.println(i);
			for (int j =i; j <= input+1; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}

}
