package com.syntax.class12;

public class StringReverse {

	public static void main(String[] args) {
//		Create a String and print it in reverse order (Sunday → yadnuS).
		String day="Sunday";
		char reverse;
		for (int i=day.length()-1;i>=0;i--) {
			reverse=day.charAt(i);
			System.out.print(reverse+" ");
		}
		System.out.println();
	}

}
