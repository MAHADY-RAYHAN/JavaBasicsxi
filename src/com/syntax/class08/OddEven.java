package com.syntax.class08;

import java.util.Scanner;

public class OddEven {

	public static void main(String[] args) {
//		Write a program that reads a range of integers (start and end point), 
//		provided by a user and then from that range prints the sum of the even 
//		and odd integers.

		Scanner s;
		int start = 0;
		int end = 0;
		int sum = 0;
		int sum1 = 0;		

		s = new Scanner(System.in);

		System.out.println("Pleas enter two integers nunber");
		start = s.nextInt();
		end = s.nextInt();
		for (int i = start; i <= end; i++) {

			if (i % 2 == 0) {
				sum = sum + i;

			} else {
				sum1 = sum1 + i;

			}
		}
		System.out.println("The total even between " + start + " to " + end + " is " + sum);
		System.out.println("The total odd between " + start + " to " + end + " is " + sum1);
	}

}
