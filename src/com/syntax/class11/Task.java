package com.syntax.class11;

public class Task {

	public static void main(String[] args) {
//		Create an array of cars : american, german, korean, italian
//		. Then retrieve all values from that array using 2 different loops
		String[] cars = { "american", "german", "korean", "italian" };

		for (int r = 0; r < cars.length; r++) {
			System.out.print(cars[r] + " ");
		}
		System.out.println();

		for (String car : cars) {
			System.out.print(car + " ");
		}
//		Create an array of countries: north america countries, south america countries,
//		europe countries, asian countries, african countries. Then print all values from 
//		that array using 2 different loops and calculate how many total countries been stored.
		String[][] countries = {{ "north america countries","USA"},
								{ "south america countries","Brazil","Argentina" },
								{"europe countries","Englang","Finland"}, 
								{"asian countries","China","India"}, 
								{"african countries","South Africa","cameroon"}};
int sum=0;
		for (int i = 0; i < countries.length; i++) {
			for(int j=0;j<countries[i].length;j++) {
				System.out.println(countries[i][j]+" ");
				sum++;
			}
		}
		System.out.println();
int sum1=0;
		for (String[] country : countries) {
			for(String x:country) {
			sum1++;	
				System.out.print(x+" ");
				System.out.println(sum1);
			}
		}
//		System.out.println(sum);
		System.out.println(sum1);
	}
}

//	        System.out.println("-- GETTING ELEMENTS USING ADVANCED FOR LOOP --");
//	        //loops through all arrays
//	        for(String[] array:groceries) {
//	            //loop through each single array
//	            for(String items:array) {
//	                System.out.print(items+" ");
//	            }
//	            System.out.println();
//	        }
//
//	}
//
//}
