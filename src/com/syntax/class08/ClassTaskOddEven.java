package com.syntax.class08;

public class ClassTaskOddEven {

	public static void main(String[] args) {
		int sum=0;
		int sum2=0;

		for (int x = 0; x <99; x++) {
			x++;
			sum=sum+x;
			
			//System.out.println(x);
			//System.out.println(sum);
		}
		
		for(int i=1;i<99;i++) {
			i++;
			sum2=sum2+i;
			//System.out.println(sum);			
		}
		System.out.println("sum of evens = "+sum2);

		System.out.println("sum of odd = "+sum);
	}

}
