package com.syntax.class09;

public class Recap {

	public static void main(String[] args) {
		for(int i=0;i<24;i++) {
			for(int j=1;j<60;j++) {
				if(j<10) {
					System.out.println(i+":0"+j);
				}else {
					
					System.out.println(i+":"+j);
				}
			}
		}
		for(int i=0;i<=9;i++) {
			for(int j=1;j<=9;j++) {
				for(int k=1;k<=9;k++) {
					for(int l=1;l<=9;l++) {
						
						System.out.println(i+" "+j+" "+k+" "+l);
					}
				}
			}
		}

	}

}
