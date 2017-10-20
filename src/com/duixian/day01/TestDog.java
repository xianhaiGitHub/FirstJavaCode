package com.duixian.day01;

public class TestDog {
	public static void main(String[] args) {
		Dog dog = new Dog();
		
		dog.type = "Ì©µÏ";
		dog.age = 10;
		dog.color = "×ØÉ«";
		dog.sex = "¹«";
		
		dog.eat();
		dog.sleep();
		dog.show();
	}
}
