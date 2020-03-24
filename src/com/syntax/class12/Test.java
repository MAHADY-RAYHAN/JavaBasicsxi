package com.syntax.class12;

public class Test {

	public static void main(String[] args) {
//		String str1="Hello1234789";
//		str1=str1.replaceAll("[A-Z0-9]", "");
//		System.out.println(str1);
//		String str2="Hello123^&^&^&*^!";
//		str2=str2.replaceAll("[^A-Z0-9]", "");
//		System.out.println(str2);
		
		String given = "I love Java classes at Syntax";
		System.out.println(given.length());
		System.out.println(given.substring(12));
		System.out.println(given.substring(0, 11));
//		
//		Validate if the string ends with "u" prints the boolean value accordingly.
//		Validate if the string ends with "world" prints the boolean value accordingly.
//		Validate if the string ends with "are" prints the boolean value accordingly.
//		Validate if the string ends with "you" prints the boolean value accordingly.
		
		String s1="hello how are you";
		boolean a=s1.endsWith("u");
		System.out.println(a);		
		boolean b=s1.endsWith("world");
		System.out.println(b);
		boolean c=s1.endsWith("are");
		System.out.println(c);
		boolean d=s1.endsWith("you");
		System.out.println(d);
		
	}

}
