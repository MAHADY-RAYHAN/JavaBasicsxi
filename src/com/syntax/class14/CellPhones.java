package com.syntax.class14;

public class CellPhones {

	public static void main(String[] args) {

		Phone iphone=new Phone();
		iphone.name="iphone";
		iphone.category="Smart phone";
		iphone.TouchScreen="Touch Screen";
		iphone.price=999;
		iphone.color="gold";		
		
		
		Phone androit=new Phone();
		androit.name="sumsung";
		androit.category="Smart phone";
		androit.TouchScreen="Touch Screen";
		androit.price=999;
		androit.color="gold";
		
		Phone nokia=new Phone();
		nokia.name="Nokia";
		nokia.category="Smart phone";
		nokia.TouchScreen="Touch Screen";
		nokia.price=500;
		nokia.color="white";
		
		iphone.call();
		iphone.talk();
		iphone.smart();
		iphone.calculatro();
		
		androit.call();
		androit.talk();
		androit.smart();
		androit.calculatro();
		
		nokia.call();
		nokia.talk();
		nokia.smart();
		nokia.calculatro();
	}

}
