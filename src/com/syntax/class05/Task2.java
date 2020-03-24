package com.syntax.class05;

public class Task2 {

	public static void main(String[] args) {

		int day=-6;
		
		if (day>=1 && day<=5) {
			System.out.println("Weekday");
		}else if(day>=6 && day<=7){
			System.out.println("Weekend");
		}else {
			System.out.println("Invalid day");
		}
	}

}
