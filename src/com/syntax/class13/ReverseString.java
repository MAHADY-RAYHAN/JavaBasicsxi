package com.syntax.class13;

public class ReverseString {

	public static void main(String[] args) {
//		Write a Java Program to print first 10 numbers of Fibonacci series.
		
		int a=0;
		int b=1;
		
		for(int i=0;i<10;i++) {
			int c=a+b;
			a=b;
			b=c;
			System.out.print(c+" ");
		}
	}

}
