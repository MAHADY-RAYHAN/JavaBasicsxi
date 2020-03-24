package com.syntax.class09;

public class NestedLoops {

	public static void main(String[] args) {

		for(int i=1;i<=5;i++) {
			System.out.println(i);
			for(int j=5;j<=1;j++) {
				System.out.println(j);
			}	
		}
		for(int i=1;i<=5;i++) {
			System.out.print(i);
			for(int j=5;j<=1;j++) {
				System.out.println(j);
			}
		
		}
//		System.out.println("---printing pattern using nested loop---");
//		for(int i=1;i<=5;i++) {
//			System.out.println("*"+"*");
//			for(int j=5;j<=1;j++) {
//			}
//			System.out.print("*"+"*");
		//}
	}

}
