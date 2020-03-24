package com.syntax.class03;

public class IfCondition {

	public static void main(String[] args) {
		System.out.println("Starting Coding");
		
		//Declaire number and compare if number is larger than 100
		//If number is larger than 100--> my number is large
		
		int num=78;
		
		if(num>1000) {
			System.out.println("my number is large");
		}else{
			System.out.println("My number is small");
		}
		System.out.println("End of the program");
		
		int expectedHours=15;
		int actualHours=40;
		
		if(actualHours>expectedHours) {
			System.out.println("You will love Java");
		}else{
			System.out.println("You dont love Java");
		}
			
		System.out.println("____________");
		
		double budget=10000;
		double carPrice=12000;
		
		if(budget>carPrice) {
		System.out.println("I will bye this car today");
		System.out.println("I am Happy");
		}else{
			System.out.println("I will not bye this car today"+" and I will go learn Java");
			System.out.println("I am not happy");
		}
		/*
		 * reate a Java program and name it Double Comparison. 
		 * Declare 2 double values and if value of first variable is 
		 * higher then the second, print “Double value __ is larger 
		 * than __ .” Otherwise print...


Create a Java program and name it Temperature Check. 
Create variable to store temperature. Your program should 
check if temperature is below 32 then it should print “Water will 
freeze with temperature __“, otherwise “Water will NOT freeze with 
temperature __“.
		 */
		double a=10.77;
		double b=12.88;
		
		if(a>b) {
			System.out.println("Double value"+a+" is larger than "+b);
			
		}else {
			System.out.println("a is not the greatest");
		}
		
		int i=32;
		int t=34;
		if(i<t) {
			System.out.println("water will not freez the temparature"+i);
		}else {
			System.out.println("water will freez"+t);
		}
		
		}
	}
