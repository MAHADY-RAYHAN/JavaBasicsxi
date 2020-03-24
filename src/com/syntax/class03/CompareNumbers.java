package com.syntax.class03;

public class CompareNumbers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		double a=10;
		double b=10;
		
		if(a>b) {
			System.out.println("number one is larger than number 2");
			
		}else if(a<b) {
			System.out.println("number one is smaller than number 2");
		}else {
			System.out.println("Numbers are equal");
		}
		System.out.println("___________");
		//declaire variable for aday and then based on value wr will provide output
		
		int day=14;
		
		if(day==1) {
			System.out.println("Its Monday No class today");
		}else if(day==2){
			System.out.println("Its Tuesday we have SDLC class today");
		}else if(day==3) {
			System.out.println("Its Wednesday we have SDLC class today");
		}else if(day==4) {
			System.out.println("Its Thursday we have SDLC review class today");
		}else if(day==5) {
			System.out.println("Its Friday we have no class today");
		}else if(day==6) {
			System.out.println("Its Saterday we have Java class today");
		}else if(day==7){
			System.out.println("Its Sunday we have Java class today");
		}else {
			System.out.println("No week day");
		}
		/*
		 * Create a Java program and declare int variable that will
		 *  hold a month. Based on the value of the variable 
		 *  your program should print the name of the month.
Write a program to check whether number is positive or negative.
Interview Question
Write a Java Program to check whether number is Even or Odd
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
		
	}
}
