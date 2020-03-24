package com.syntax.class05;

import java.util.Scanner;

public class HomeWork1 {

	public static void main(String[] args) {
//		Write a program that will read three inputs of scores (quiz, mid term, 
//		and final scores) and determine the grade based on the following rules: 
//		if the average score >=90 → grade=A
//		if the average score >= 70 and <90 → grade=B
//		if the average score>=50 and <70 → grade=C
//		if the average score<50 → grade=F
		Scanner results=new Scanner(System.in);
		
		System.out.println("What is your quiz score");
		int quiz=results.nextInt();
		
		System.out.println("what is your mid term socre");
		int midTerm=results.nextInt();
		
		System.out.println("What is your final score");
		int finalScore=results.nextInt();
		
		double score = (quiz+midTerm+finalScore)/3;
		
		System.out.println("Your average score is "+score);
		
		
		if(score>=90) {
			System.out.println("Your grade A");
		}else if(score>=70 && score<90) {
			System.out.println("Your grade B");
		}else if(score>=50 && score<70) {
			System.out.println("Your grade C");
		}else if(score<50) {
			System.out.println("Your mgrade F");
		}else {
			System.out.println("score is very poor");
		}

	}

}
