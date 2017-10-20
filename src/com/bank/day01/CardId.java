package com.bank.day01;
/**
 * 随机生成银行卡
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
