package com.syntax.class15;

public class Main {
	 String censorLetter(String censorLetter1, char charecter){
		 censorLetter1 =censorLetter1.replace('e', '*');
		    return censorLetter1;
		  }
	 public static void main(String[] args) {
		Main obj=new Main();
		String objj=obj.censorLetter("computer", ' ');
		System.out.println(objj);
	}
}
	

