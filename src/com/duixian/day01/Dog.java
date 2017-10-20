package com.duixian.day01;

public class Dog {
	String type;
	int age;
	String sex;
	String color;
	public void eat(){
		System.out.println("狗吃骨头");
	}
	public void sleep(){
		System.out.println("狗睡觉");
	}
	public void show(){
		System.out.println("我是一条"+"颜色为"+color+","+"年龄为"+age+"岁"+"的公狗");
	}
}
