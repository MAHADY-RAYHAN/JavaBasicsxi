package com.syntax.class09;

public class ArraysIntro {

	public static void main(String[] args) {

		int[]array=new int[4];
		array[0]=10;
		array[1]=20;
		array[2]=30;
		array[3]=40;
		
		System.out.println(array[1]);
		
		//2nd way
		String[]carArray;
		String carArray1[];
		
		carArray=new String[1000];
		carArray[0]="BMW";
		carArray[1]="Honda";
		carArray[2]="Toyota";
		System.out.println("i am driving "+carArray[7]);
	}

}
