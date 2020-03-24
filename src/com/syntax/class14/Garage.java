package com.syntax.class14;

public class Garage {

	public static void main(String[] args) {
		
		Car car1=new Car();
		car1.make="Lamborghini";
		car1.model="Galardo";
		car1.year=2020;
		car1.speed=400;
		
		Car car2=new Car();
		car2.make="BMW";
		car2.model="m5";
		car2.year=2019;
		car2.speed=300;
		
		Car car3=new Car();
		car3.make="toyota";
		car3.model="camry";
		car3.year=2018;
		car3.speed=100;
		
		Dog dog1=new Dog();
		dog1.breed="Shih txh";
		dog1.color="yellow";
		dog1.name="Lucy";
		dog1.age=2;
		
		Dog dog2=new Dog();
		dog2.breed="hunting boars";
		dog2.color="black";
		dog2.name="Lui";
		dog2.age=3;
		
		dog1.eat();
		dog1.bark();
		dog1.run();
		
		dog2.eat();
		dog2.bark();
		dog2.run();
		
		car1.drive();
		car1.accelerate();
		car1.makeNoise();
		car1.stop();
		
		car2.drive();
		car2.accelerate();
		car2.makeNoise();
		car2.stop();
		
		car3.drive();
		car3.accelerate();
		car3.makeNoise();
		car3.stop();
	}

}
