package com.bank.day01;
/*
 * 生成银行卡号
 */
public class CardId {
	public  String cardid(){
		String s = "0123456789";
		String cCode = "";
		for(int i = 0;i<19;i++){
		int num =(int)( Math.random()*s.length());
			char c = s.charAt(num);
			cCode +=c;
		}
		return cCode;
	}
}
