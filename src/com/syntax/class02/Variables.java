package com.syntax.class02;

public class Variables {
	
	public static void main (String[]args){
	
		String studentName="John";
		String studentlastName= "Mike";
		char studentGrade= 'A';
		String studentCity="Chantily";
		String studentState="VA";
		long studentPhoneNumber=2029990491l;
		
		System.out.println(studentName);
		System.out.println(studentlastName);
		System.out.println(studentGrade);
		System.out.println(studentCity);
		System.out.println(studentState);
		System.out.println(studentPhoneNumber);
		
		studentCity="Lorton";
		studentState="GA";
		studentPhoneNumber=2029990492l;
		studentGrade='B';
		
		System.out.println(studentCity);
		System.out.println(studentState);
		System.out.println(studentPhoneNumber);
		System.out.println(studentGrade);
		
		System.out.println("My name is "+studentName);
		System.out.println("I live in city of "+studentCity);
		System.out.println("My phone number is "+studentPhoneNumber);
		
	}

}
