package com.syntax.class10;

public class Task {

	public static void main(String[] args) {

//		String[] Animals= {"Tiger","Mahady","Birds","Cow","Dog","Fish"};
//		for(int i=0;i<Animals.length;i++) {
//			System.out.println(Animals[i]);
//		}
//		System.out.println("-------------");
//		for(String Animal:Animals) {
//			System.out.println(Animal);
//		

//		int[] numbers = { 12, 33, 2, 11, 45 };
//		int sum = 0;
//		for (int number : numbers) {
//			sum += number;
//
//		}
//		System.out.println(sum);

//		String[] countries = { "USA", "Bangladesh", "India" };
//		for (String country : countries) {
//			if (country.equalsIgnoreCase("USA"))
//				System.out.println("The Capital of USA is Washington DC");
//			if (country.equalsIgnoreCase("Bangladesh"))
//				System.out.println("The Capital of USA is Dhaka");
//			if (country.equalsIgnoreCase("India")) {
//				System.out.println("The Capital of USA is New Dehlli");
//			}
//
//		}
		
		int[]nums= {200,30,-1,900,56,787};
		int largest=nums[0];
		for(int num:nums) {
			if(num>largest) {
				largest=num;
			}
		}
		System.out.println("The largest number is "+largest);
	}
}
