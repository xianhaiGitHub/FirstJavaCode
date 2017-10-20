package com.bank.day01;

import java.util.Scanner;

import com.duixian.day01.VertifyCode;
/**
 *  注册登录主界面
 * @author zhaoxianhai
 *
 */
public class RegistAndLogin {
	// 新建数组用于存储用户信息
	String[] username = new String[10];
	String[] password = new String[10];
	VertifyCode v = new VertifyCode();//创建验证码
	BankSystem bankSystem = new BankSystem();
	Scanner input = new Scanner(System.in);
	 int index = -1;
	public void init(){
		System.out.println("=================银行管理系统=========================");
		System.out.println("\t\t1.注册");
		System.out.println("\t\t2.登陆");
		System.out.println("请输入操作：");
		int choice = input.nextInt();
		switch (choice) {
		case 1:
			regist();
			break;
		case 2:
			login();
			break;
		default:
			System.out.println("输入错误");
			break;
		}
	}
	/*
	 * 登陆
	 * 
	 */
	public void login() {
		System.out.println("请输入用户名:");
		String userName = input.next();
		System.out.println("请输入登陆密码:");
		String passWord = input.next();
		for(int i = 0; i<username.length;i++ ){
			if(username[i] != null){
				if(username[i].equals(userName) && password[i].equals(passWord)){
					System.out.println("恭喜您登陆成功~");//需要重复显示银行系统界面代码//
					while(true){
						bankSystem.bankinit();
					}
				}		
			}else{
				continue;
			}
		}
	}
	/*
	 * 注册
	 * 
	 */
	public void regist() {
		while(true){
			index++;
			System.out.println("请输入用户名:");
			String name = input.next();
			if(name.length() >=11){
				if(!name.endsWith("qq.com")){
					System.out.println("您输入的邮箱格式不正确");
					index--;
				}else{
					username[index] = name;
					break;
				}
			}else{
				System.out.println("用户名不能低于11位");
				index--;
			}
		}
		while(true){
			System.out.println("请设置登录密码");
			String pwd = input.next();
			if(pwd.length() >= 6){
				password[index] = pwd;
				break;
			}else{
				System.out.println("您输入的密码位数小于6位,请重新输入");
			}
		}
		while(true){
			String vCode=v.vertifyCode();
			System.out.println(vCode);//产生验证码
			System.out.println("请输入验证码");
			String code = input.next();
			if(code.equalsIgnoreCase(vCode)){
				System.out.println("恭喜您注册成功,快去登陆吧~");
				break;
			}else{
				System.out.println("验证码错误,请重新输入");
			}
		}
		for(int i = 0;i<username.length;i++){
			System.out.println(username[i] + "\t" +password[i]);
		}
	}
}
