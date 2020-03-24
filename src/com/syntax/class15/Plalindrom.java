package com.syntax.class15;

public class Plalindrom {
	
	void pal(String str) {
		for(int i=str.length()-1;i>0;i--) {
			if(str.equalsIgnoreCase(str)) {
				System.out.println(str+" is palindrom");
			}else {
				System.out.println(str+" is not palindrom");
			}
		}
		
	}

}
