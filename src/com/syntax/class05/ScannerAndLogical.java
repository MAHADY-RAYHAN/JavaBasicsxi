package com.syntax.class05;

import java.util.Scanner;

public class ScannerAndLogical {

	public static void main(String[] args) {

		Scanner scan=new Scanner(System.in);
		double sales;
		double commission;
		
		System.out.println("Please enter your sales amount");
		sales=scan.nextDouble(); 
		
		if(sales>=1 && sales<=100) {
			//System.out.println("Based on your sales your commission is "+commission);
			commission=sales*0.10;
			//System.out.println("Commission should be 10%");
		}else if (sales>100 && sales<=200) {
			commission=sales*0.2;
			
		}else if(sales>200 && sales<=500) {
			commission= sales*0.3;
		}else {
			commission=sales*0.5;
		}if(commission>100) {
			System.out.println("you are a awesome seller");
		}else {
			System.out.println("you are not a good seller");
		}
		System.out.println("Based on your sales your commission is = "+commission);
	}

}
