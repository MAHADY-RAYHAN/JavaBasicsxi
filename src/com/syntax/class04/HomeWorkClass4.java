package com.syntax.class04;

import java.util.Scanner;

public class HomeWorkClass4 {

	public static void main(String[] args) {
		
		Scanner scan=new Scanner(System.in);
		
		System.out.println("What is the amount of loan");
		int amount=scan.nextInt();
		
		System.out.println("the amount of loan "+amount);
		
		
		if(amount>200000) {
			System.out.println("reject loan amount");
		}else {
			System.out.println("approve the loan");
		}

	}

}
