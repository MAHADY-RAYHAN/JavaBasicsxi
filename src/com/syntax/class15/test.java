package com.syntax.class15;

public class test {

	boolean isprime(int num) {
		boolean isprime = true;
		for (int i = 2; i <= num; i++) {
			if (num >= 1 && num % i == 0) {

				isprime = false;
				break;
			}else {
			}
			isprime=true;
			
		}
		return isprime;
	}

	public static void main(String[] args) {

		test obj = new test();
		boolean objj = obj.isprime(5);
		System.out.println(objj);

//		System.out.println(isprime);
	}

}
