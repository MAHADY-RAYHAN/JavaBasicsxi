package com.syntax.class12;

import java.util.Scanner;

public class Task3 {

	public static void main(String[] args) {
//		Write a program that reads two people’s first names and if they expecting boy or girl?
//				Based on the input suggests a name for a baby:
//				Example Output:
//				Mom’s first name? Mary
//				Dad’s first name? Daniel
//				Boy or Girl? boy
//				Suggested baby name: DANRY
//
//				Example Output:
//				Mom’s first name? Mary
//				Dad’s first name? Daniel
//				Boy or Girl? girl
//				Suggested baby name: MAIEL
		Scanner scan=new Scanner(System.in);
		String name1;
		String name2;
		String name3;
		int count=0;
		int div=0;
		int div1=0;
		
		System.out.println("pease enter your father's first name");
		name1=scan.nextLine();
		System.out.println("pease enter your mother's first name");
		name2=scan.nextLine();
		System.out.println("what are you expecting boy or girl");
		name3=scan.nextLine();
		
		if(name3.equalsIgnoreCase("boy")) {
			div=name1.length()%2;
			count=name1.charAt(div1);
			div1=name2.length()%2;
			
			System.out.println(div+div1);
		}
	}

}
