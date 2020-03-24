package com.syntax.class12;

public class Task4 {

	public static void main(String[] args) {

//		Create a String that will hold a sentence. Write a program to get a new 
//		String without any spaces.
		
		String java="I love java";
		
		java=java.replaceAll(" ", "");
		System.out.println(java);
		
//		Create a String that should be combination of letters, numbers and special characters.
//		Find out how many alpha characters are there in the String.
		String letters="Hello World 1232@@#$$%I Love Java=-009863";
		letters=letters.replaceAll("[^A-Z0-9]", "");
		System.out.println(letters);
		

//		You have a String a=“Is it saturday? Is it raining? Do we have a Java Class today?
//		” How would you find out how many sentences are in that String?
//		String str="Is it saturday? Is it raining? Do we have a Java Class today?";
//		String[] words=str.split("?");
//		for(String word:words) {
////			for(String x:word) {
//				System.out.println(word);
//			}
//		}
	}

}
