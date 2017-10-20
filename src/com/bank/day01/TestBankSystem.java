package com.bank.day01;
/**
 * 测试银行系统
 * @author zhaoxianhai
 *
 */
public class TestBankSystem {
	public static void main(String[] args) {
		RegistAndLogin banksystem = new RegistAndLogin();
		while(true){
			banksystem.init();
		}
	}
}
