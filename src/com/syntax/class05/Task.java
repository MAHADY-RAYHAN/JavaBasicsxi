package com.syntax.class05;

import java.util.Scanner;

public class Task {

	public static void main(String[] args) {
		
		Scanner scan=new Scanner(System.in);

		System.out.println("Plese enter your height in inches");
		int height=scan.nextInt();
		
		if(height<60) {
			System.out.println("short");
		}else if(height>=60 && height<=72) {
			System.out.println("medium");
			
		}else {
			System.out.println("Tall");
		}
	
	}

}
