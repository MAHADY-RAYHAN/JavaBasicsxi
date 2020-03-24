package com.syntax.class03;

public class MoreNestedIf {

	public static void main(String[] args) {

		// declare date and a day.
		// if day is Friday__> if date is 13__> watch a scary movie
		// if date is not 13__> watch a comedy

		// check if patient has any allergies
		// if not allergies __> you are healthy
		// otherwise check if patient has:
		// orange allergy__>do not eat orange
		// apple allergy--> do not eat apples
		// kiwi allergy--> do not eat kiwis

		/*
		 * boolean allergy=true; boolean orangeAllergy=false; boolean appleAllergy=true;
		 * boolean kiwiAllergy=false;
		 * 
		 * if(allergy) { System.out.println("answer below");
		 * 
		 * if(orangeAllergy) { System.out.println("do not eat orange"); if(appleAllergy)
		 * { System.out.println("do not eat apple"); if(kiwiAllergy) {
		 * System.out.println("do not eat kiwi"); }else {
		 * System.out.println("you are not healthy");} }else {
		 * System.out.println("you are healthy");}
		 * 
		 * }else { System.out.println("you are healthy");}
		 * 
		 * }else { System.out.println("you are healthy");}
		 * 
		 */

		// check if patient has any allergies
		// if no allergies --> you are healthy
		// othewise check if patient has:
		// orange allergy --> do not eat oranges
		// apple allergy --> do not eat apples
		// kiwi allergy --> do not eat kiwis

		boolean allergies = true;
		boolean orangeAllergies = true;
		boolean appleAllergies = true;
		boolean kiwiAllergies = true;

		if (allergies) {
			System.out.println("You are not healthy");
			if (orangeAllergies) {
				System.out.println("do not eat orange");
				if (appleAllergies) {
					System.out.println("do not eat apple");
					if (kiwiAllergies) {
						System.out.println("do not eat kiwis");
					}
				}
			}
		} else {
			System.out.println("You are healthy");
		}
	}

}
