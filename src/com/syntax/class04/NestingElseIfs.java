package com.syntax.class04;

public class NestingElseIfs {

	public static void main(String[] args) {

		// if student completed a quize we will check for a score
		// if score is>90--> great job
		// if score is>80-->well done
		// if score is>70--> you couls have done better
		// if student did not complete the quize --> not good please do home work on
		// time
		/*
		 * boolean quize=true; int score=90;
		 * 
		 * if(quize) { System.out.println("Lets check for score");
		 * 
		 * }else{ System.out.println("Please do your home work in time"); }
		 */
		/*
		boolean diploma = true;
		double gpascore = 4;

		if (diploma) {
			System.out.println("congratulations");
			if (gpascore > 3.5) {
				System.out.println("you are eligible for scholership");
			} else {
				System.out.println("you should have study harder");
			}
		} else {
			System.out.println("get a degree");
		}

		int price = 120000;
		double rate = 3.5;

		if (rate > 4.5) {
			System.out.println("user will not buy a house");

		} else {
			System.out.println("user will consider buying");

			if (price > 200000) {
				System.out.println("I need mortgage");

			} else {
				System.out.println("I pay cash");

			}
		}

		int a = 10;
		int b = 5;
		int c = 5;

		if (a > b & a > c) {
			System.out.println("a is the greatest" + a);

		} else {
			System.out.println("a is not the greatest");

		}

		if (b > c & b > c) {
			System.out.println("b is the greatest" + b);
		} else {
			System.out.println("c is the greatest");
		}

*/
		
			/* if student completed a quiz we will check for a score
			 * if score >90 --> great job
			 * if score > 80 --> well done
			 * if score > 70 --> you could have done better
			 * 
			 * if student did not completed the quiz --> not good
			 * please do homework ontime
			 */
		boolean quiz=true;
		int score=60;
		
		if(quiz) {
			System.out.println("we will check for a score");
			if(score>90) {
				System.out.println("great job");
				}else if (score>80){
				System.out.println("well done");
			}else if(score>70){
				System.out.println("you could have done better");
			}else {
				System.out.println("you failed");
			}
		}else {
			System.out.println("not good please do homework ontime");
		}
		
	}
}
