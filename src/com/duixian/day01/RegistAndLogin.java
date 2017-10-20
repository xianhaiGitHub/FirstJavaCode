package com.duixian.day01;

import java.util.Scanner;

public class RegistAndLogin {
	// 新建数组用于存储用户信息
	String[] username = new String[10];
	String[] password = new String[10];
	
	
	Scanner input = new Scanner(System.in);
	static VertifyCode VertifyCode = new VertifyCode();
	static int index = -1;

	/*public static void main(String[] args) {
		RegistAndLogin registandlogin = new RegistAndLogin();
		while (true) {
			registandlogin.init();//
		}
	}
	*/
	/**
	 * 主界面
	 */
	public  void init() {
		System.out.println("\t1.注册");
		System.out.println("\t2.登陆");
		System.out.println("请输入操作");
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

	/**
	 * 注册
	 */
	public  void regist() {
		while (true) {
			index++;// ////
			System.out.println("请输入用户名:");
			String name = input.next();
			if (name.length() >= 16) {
				if (!name.endsWith("@qq.com")) {
					System.out.println("请输入正确的邮箱格式");
				} else {
					username[index] = name;// ///////////
					while (true) {
						System.out.println("请设置密码:");
						String pswd = input.next();
						if (pswd.length() < 6) {
							System.out.println("您输入的密码小于6为,请重新输入");
						} else {
							password[index] = pswd;
							
							String vCode = VertifyCode.vertifyCode();
							System.out.println(vCode);
							System.out.println("请输入验证码");
							String yzm = input.next();
							if (yzm.equalsIgnoreCase(vCode)) {
								// ///////////////////////////////////////
								System.out.println("恭喜您注册成功,请登陆");
								break;
							} else {
								System.out.println("验证码错误请重新输入");
							}
						}// 格式正确
					}
					for(int i = 0; i<username.length;i++){
						System.out.println(username[i]+"\t"+password[i]);
					}
				}
				break;
			} else {
				System.out.println("用户名低于16位");
			}
		}
	}

	/**
	 * 登陆
	 */
	public  void login() {
		System.out.println("请输入用户名:");
		String userName = input.next();
		System.out.println("请输入密码:");
		String passWord = input.next();
		for (int i = 0; i < username.length; i++) {
			if(username[i] != null){
				if (username[i].equals(userName) && password[i].equals(passWord)) {
					System.out.println("登陆成功");//有问题
/*				while(true){
						booksystem.bookInit();
					}*/
					
				} else {
					continue;
				}
			}
		}
	}

}
