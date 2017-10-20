package com.duixian.day01;

public class VertifyCode {
	public String vertifyCode(){
		String s = "asdfghjklqwertyuiop";
		String vCode = "";// 接收验证码
		for (int i = 0; i < 4; i++) {// 四个字符
			int num = (int) (Math.random() * s.length());// 随机字符位置
			char c = s.charAt(num);// 取字符
			vCode += c;// 拼接验证码字符
		}
		return vCode;
	}
}
