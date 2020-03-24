package com.syntax.class04;

import java.util.Scanner;

public class ScannerExample {

	public static void main(String[] args) {
		
		//Capture name from a user and 
		//print in the format
		//My name is____
		Scanner name1=new Scanner(System.in);
		String name=name1.nextLine();
		System.out.println("My name is "+name);
		
		int age=name1.nextInt();
		System.out.println("your name is "+name+" your age is "+age);
		
		
	}

}
