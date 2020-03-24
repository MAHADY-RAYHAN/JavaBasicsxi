package com.syntax.class05;

public class LogicalAnd {

	public static void main(String[] args) {
		int a=1;
		
		if((a>=1)&&(a<=10)) {
			System.out.println("This number is small");
		}else if((a>10)&&(a<=100)){
		System.out.println("This is a big number");	
		}else if((a>100)&&(a<=1000)){
			System.out.println("This is a large nunber");
		}else {
			System.out.println("Nunber is super large");
		}
	}

}
