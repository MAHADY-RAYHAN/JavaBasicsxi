package com.syntax.class07;

public class Loops {

	public static void main(String[] args) {
		
//		for (int i=10;i>0;++i) {
//			System.out.println(i);
//		}
//		
//		int num=1;
//		while(num<5) {
//			num++;
//			System.out.println(num);
//		}
		
//		Create a boolean variable workDay and assign true create int variable day and assign it to 1
//
//		As long as it is workDay print “I need a day off” and increase day.
//		Once day is 6 print “I do not need a day off any more”
		
		boolean workDay =true;
		int day=1;
		
		 while(workDay){
			 if(day<6) {
				 System.out.println("I need a day off "+day);
 
			 }else {
				 System.out.println("I dont need day off "+day);
				 workDay=false;
			 }
			 day++;

		}
	}
}
