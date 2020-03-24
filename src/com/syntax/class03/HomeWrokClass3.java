package com.syntax.class03;

public class HomeWrokClass3 {

	public static void main(String[] args) {

		/*
		 Create a Java program and declare int variable that will
		 hold a month. Based on the value of the variable 
		 your program should print the name of the month.
		 */
		int month=13;
		
		if(month==1) {
			System.out.println("Number is positive and month is January");
		}else if(month==2){
			System.out.println("Number is positive and month is February");
		}else if(month==3) {
			System.out.println("Number is positive and month is March");
		}else if(month==4) {
			System.out.println("Number is positive and month is April");
		}else if(month==5) {
			System.out.println("Number is positive and month is May");
		}else if(month==6) {
			System.out.println("Number is positive and month is June");
		}else if(month==7){
			System.out.println("Number is positive and month is July");
		}else if(month==8){
			System.out.println("Number is positive and month is August");
		}else if(month==9){
			System.out.println("Number is positive and month is September");
		}else if(month==10){
			System.out.println("Number is positive and month is October");
		}else if(month==11){
			System.out.println("Number is positive and month is November");
		}else if(month==12){
			System.out.println("Number is positive and month is December");
		}else {
			System.out.println("Invalid Output");
		}
		
		//Write a program to check whether number is positive or negative.

		int a=0;
		
		if(a>0) {
			System.out.println("Number is positive "+a);
		}else if (a<0){
			System.out.println("Number is negetive "+a);
			
		}else {
			System.out.println("your number is 0 ");
		}
		
		/*
		 * Interview Question
		   Write a Java Program to check whether number is Even or Odd
		 */
		int x=10;
		int y=x%2;
		System.out.println(y);
		if(y==0) {
			System.out.println("This number "+x+" is even");
		}else if(y!=0) {
			System.out.println("This number "+x+" is Odd");
		}else {
			System.out.println("the number is 0");
		}
		
	}

}
