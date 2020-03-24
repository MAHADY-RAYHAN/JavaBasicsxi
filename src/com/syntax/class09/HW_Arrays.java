package com.syntax.class09;

public class HW_Arrays {

	public static void main(String[] args) {

//		Create an array of chars and store grades into
//		it: A,B,C,D,E,F. Then print a grade B (use 2
//		different ways of creating an array).
		
//		char[] grades= {'A','B','C','D','E','F'};
//		System.out.println(grades[1]);
		
		//2nd way
//		char[] grades=new char[5];
//		grades[0]='A';
//		grades[1]='B';
//		grades[2]='C';
//		grades[3]='D';
//		grades[4]='E';
//		System.out.println(grades[1]);
		
//		Create an array of names and store all names
//		of your group. Then print your name from
//		that array. (use 2 different ways of creating
//		an array).
		
//		String[]names= {"Mahady","Sarmed","Brian","Giovanna","Farid"};
//		System.out.println(names[0]);
		
		//2nd way
//		String []names=new String[5];
//		names[0]="Mahady";
//		names[1]="Sarmed";
//		names[2]="Brian";
//		names[3]="Giovanna";
//		names[4]="Farid";
//		System.out.println(names[0]);
		
//		Create an array of words: Java, Saturday, day,
//		coding, is. Print the following sentence using
//		elements of array: “Saturday is Java coding
//		Day”.
		
		String[]words= {"Java","Saturday","day","coding","is"};
		System.out.println(words[1]+" "+words[4]+" "+words[0]+" "+words[3]+" "+words[2]);
	}

}
