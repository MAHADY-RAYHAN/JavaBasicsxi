package com.syntax.class06;

import java.util.Scanner;

public class HW1 {

	public static void main(String[] args) {
//		Ask user to enter their country and capture it. 
//		Once values are captured print which language user speaks.
		Scanner scan;
		String country;
		String language=null;
		scan=new Scanner(System.in);
		
		System.out.println("Where are you from");
		country=scan.nextLine();
		
		switch (country) {
		case "Spain":
			language="spanish";
			break;
		case"England":
			language="English";
			break;
			default:
			System.out.println("Invalid country");
			
		
		}
		System.out.println("Your language is "+ language);

	}

}
