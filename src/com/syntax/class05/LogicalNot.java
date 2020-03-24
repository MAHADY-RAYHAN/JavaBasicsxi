package com.syntax.class05;

public class LogicalNot {

	public static void main(String[] args) {

		boolean b=!true;
		boolean val=false;
		
		System.out.println(b);
		System.out.println(val);
	
		boolean isCold=false;
		if (isCold) {
			System.out.println("hello");
			
		}else {
			System.out.println("bye");
		}
	
		String day1="Monday";
		String day2="Friday";
		
		if(!day1.equals("Tuesday") && !day1.equals("Friday")){
			
		System.out.println("Find me at Syntex");
		}
	}

}
