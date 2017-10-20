package com.bank.day01;

import java.util.Scanner;
/**
 * 申请银行卡,取钱和存钱
 * @author zhaoxianhai
 *
 */
public class BankSystem {
	/*
	 * 主界面
	 */
	String[] userName = new String[20];
	String[] bankId = new String[20];
	double[] money = new double[20];
	int index = -1;
	CardId cd = new CardId();
	Scanner input =  new Scanner(System.in);
	public void bankinit(){
		System.out.println("\t1.申请银行卡");
		System.out.println("\t2.存钱:");
		System.out.println("\t3.取钱");
		System.out.println("请输入选择:");
		int choice = input.nextInt();
		switch(choice){
		case 1:
			add();
			break;
		case 2:
			saveMoney();
			break;
		case 3:
			qumoney();
			break;
		default :
			System.out.println("对不起,输入错误");
			break;
		}
	} 
	public void qumoney() {
		System.out.println("请输入银行卡号:");
		String card = input.next();
		if(bankId[index].equals(card)){
			System.out.println("请输入取款金额:");
			double money1 = input.nextDouble();
			money[index] -= money1;
			System.out.println("您的余额为:"+money[index]);
		}else{
			System.out.println("您输入的的卡号错误，请重新输入");
		}
	}
	/*
	 * 存钱
	 */
	public void saveMoney() {
		System.out.println("请输入银行卡号:");
		String card = input.next();
		if(bankId[index].equals(card)){
			System.out.println("请输入存款金额:");
			double money2 = input.nextDouble();
			money[index] += money2;
			System.out.println("您的余额为:"+money[index]);
		}else{
			System.out.println("您输入的的卡错误,请重新输入");
		}
	
		
	}
	/*
	 *申请银行卡
	 */
	public void add(){
		String choice;
		do{
			index++;
			System.out.println("请输入姓名:");
			userName[index] = input.next();
			String x =cd.cardid();//随机生成银行卡
			System.out.println("您的卡号为:"+x);
			//System.out.println(x);
			bankId[index] = x;
			System.out.println("请输入金额:");
			money[index] = input.nextDouble();
			System.out.println("是否继续申请(Y/N)");
			choice = input.next();//
		}while(choice.equalsIgnoreCase("Y/N"));
		for(int i = 0;i<userName.length;i++){
			System.out.println(userName[i]+"\t"+bankId[i]+"\t"+money[i]);
		}
	}
}
