package com.syntax.class02;

public class ArithmaticsOperations {

	public static void main(String[] args) {

		/*
		 * Declare two variables and initialize them Display result of Addition,
		 * subtraction,Multiplication and Division
		 * 
		 */
		int num1, num2;
		num1 = 20;
		num2 = 10;
		System.out.println(num1 + num2); // 30
		System.out.println(num1 - num2); // 10
		System.out.println(num1 * num2); // 200
		System.out.println(num1 / num2); // 2

		// How can i put value of num1 and num2 together
		System.out.println(num1 + "" + num2);

		int sum = num1 + num2;
		int sub = num1 - num2;
		int multiplication = num1 * num2;
		int Divition = num1 / num2;

		System.out.println(sum);
		System.out.println(sub);
		System.out.println(multiplication);
		System.out.println(Divition);

		// the addition of two numbr is__
		System.out.println("the addition of two number is " + sum);
		System.out.println("the subtraction of two number is " + sub);
		System.out.println("the multiplication of two number is " + multiplication);
		System.out.println("the Divition of two number is " + Divition);

		/*
		 * Write a Java program to add, subtract, multiply and divide 2 decimal values.
		 * Your program should say. “The _______ of 2 numbers ___ and ___ is equal to
		 * _____”
		 */
		double num11, num21, sum11, sum12, sum13, sum14;
		num11 = 12.30;
		num21 = 23.45;
		sum11 = num11 + num21;
		sum12 = num11 - num21;
		sum13 = num11 * num21;
		sum14 = num11 / num21;

		System.out.println("The adding of 2 numbers " + num11 + " and " + num21 + " is equal to " + sum11);

		/*
		 * Write a program to find the square of the number 3.9. You program should say
		 * “The square of the ____ is ____
		 */
		double squreNum, Total;
		squreNum = 3.9;
		Total = squreNum * squreNum;
		System.out.println("The square of the Number is " + Total);

		/*
		 * Write a program to print the area and perimeter of a rectangle with width = 5
		 * and height = 8. Your program should say. “The perimeter of a rectangle with
		 * width ___ and height ____ is equal to _____ and the area is __”
		 */
		int w, h, area, perimeter;
		w = 5;
		h = 8;
		area = w * h;
		perimeter = 2 * (w + h);
		System.out.println("The perimeter of a rectangle with widh " + w + " and hight " + h + " is equal to "
				+ perimeter + " and the area is " + area);

	}

}
