package com.syntax.class10;

public class ForEachLoopWithTwoDimensionalArray {

	public static void main(String[] args) {

	int[][] num= {{1,34,33,32,2},
			{4,53,23,3,7}};
	for(int[]x:num) {
		for(int y:x) {
			System.out.println(y);
		}
	}
	}

}
