package com.duixian.day01;

public class TestCalc {
	public static void main(String[] args) {
		Calc calc =  new Calc();
	/*	calc.a = 12;
		calc.b = 13;
		int x1 = calc.plus();
		int x2 =calc.jian();
		int x3 =calc.modify();
		int x4 =calc.chu();
		System.out.println("和为："+x1+"差为："+x2+"积为："+x3+"商为："+x4);
		*/
		double x1 = calc.calcolate(3, 4, "+");
		double x2 = calc.calcolate(3, 4, "-");
		double x3 = calc.calcolate(3, 4, "*");
		double x4 = calc.calcolate(3, 4, "/");
		System.out.println("和为："+x1+"\t"+"差为："+x2+"\t"+"积为："+x3+"\t"+"商为："+x4);
	}
}
