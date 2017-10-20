package com.duixian.day01;

public class Calc {
/**
 *¼ÆËãÆ÷
 */
	public  double calcolate(double a,double b,String type){
		double result = 0.0;
		if(type.equals("+")){
			result = a+b;
		}else if(type.equals("-")){
			result = a-b;
		}else if(type.equals("*")){
			result =a*b;
		}else if(type.equals("/")){
			if(a!=0 && b!=0){
				result = a/b;
			}
		}
		return result;
	}

}
