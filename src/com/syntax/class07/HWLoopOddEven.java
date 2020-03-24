package com.syntax.class07;

public class HWLoopOddEven {

	public static void main(String[] args) {

//		1.Print numbers from 1 to 100 in 1 line
//		with space
		for (int i=1;i<=100;i++) {
			System.out.print(" "+i);
		}
//		2. Print numbers from 100 to 1
		for(int i=100;i>0;i--) {
			System.out.print(" "+i);
		}
//		3. Print even numbers from 20 to 1 (2 ways)
		for(int i=21;i>1;i--) {
			i--;
			System.out.println(i);			
		}
		//2nd way
		int i=21;
		--i;
		while(i>1) {						
			System.out.println(i);
			i--;
			i--;
		}
//		4. Print odd numbers between 20 and 50 (2
//		ways)
		for (int x = 20; x <50; x++) {
			x++;
			System.out.println(x);
		}
//		2nd way
		int num=20;
		num++;
		while (num<50) {
			System.out.println(num);
			num++;
			num++;
		}
	}

}
