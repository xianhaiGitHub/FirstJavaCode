package com.duixian.day01;

import java.util.Scanner;

public class BookSystem {
	String[] bookName = new String[1024];
	String[] bookAuthor = new String[1024];
	double[] bookPress = new double[1024];
	int index = -1;
	Scanner input =  new Scanner(System.in);
	/*
	 * 初始化界面
	 */
	public void bookInit(){
		System.out.println("========图书管理系统===========");
		System.out.println("\t1.添加图书信息");
		System.out.println("\t2.删除书信息");
		System.out.println("\t3.修改图书信息");
		System.out.println("\t4.查询所有图书信息");
		System.out.println("\t5.模糊查询图书信息");
		System.out.println("\t6.退出系统");
		System.out.println("\t请输入操作:");
		int choice = input.nextInt();
		switch(choice){
		case 1:
			add();
			break;
		case 2:
			delete();
			break;
		case 3:
			update();
			break;
		case 4:
			showAll();
			break;
		case 5:
			showByCondition();
			break;
		case 6:
			break;
		default :
			System.out.println("输入错误");
			break;
		}
	}
	/*
	 * 添加图书信息
	 */
	public void add(){
		String choice;//接收是否继续添加的字符
		do{
			index++;
			System.out.println("请输入图书名称");
			bookName[index] = input.next();
			System.out.println("请输入图书作者");
			bookAuthor[index] = input.next();
			System.out.println("请输入图书价格");
			bookPress[index] = input.nextDouble();
			System.out.println("是否继续添加(Y/N)");
			choice = input.next();
		}while(choice.equalsIgnoreCase("Y"));
	}
	/*
	 * 删除书信息
	 */
	public void delete(){
		System.out.println("请输入需要删除的图书的序号");
		int id = input.nextInt();
		bookName[id-1] = null;
		bookAuthor[id-1] = null;
		bookPress[id-1] = 0.0;
	}
	/*
	 * 修改图书信息
	 */
	public void update(){
		showAll();
		System.out.println("请输入需要删除的图书的序号");
		int id = input.nextInt();
		System.out.println("请输入图书名称");
		bookName[id-1] = input.next();
		System.out.println("请输入图书作者");
		bookAuthor[id-1] = input.next();
		System.out.println("请输入图书价格");
		bookPress[id-1] = input.nextDouble();
	}
	/*
	 * 查询所有图书信息
	 */
	public void showAll(){
		System.out.println("序号\t图书名称\t图书作者\t图书价格");
		for(int i = 0; i<bookName.length;i++){
			if(bookName[i]!=null){
				System.out.println((i+1)+"\t" +bookName[i]+"\t"+bookAuthor[i]+"\t"+bookPress[i]);
			}else{
				continue;
			}
		}
	}
	/*
	 * 模糊查询
	 */
	public void showByCondition(){
		System.out.println("请输入搜索内容");
		String s = input.next();
		System.out.println("序号\t图书名称\t图书作者\t图书价格");
		for(int i = 0;i<bookName.length;i++){
			if(bookName[i] != null){	
				if(bookName[i].contains(s)){
					System.out.println((i+1)+"\t" +bookName[i]+"\t"+bookAuthor[i]+"\t"+bookPress[i]);
				}
			}else{
				continue;
			}
		}
	}
	//////////////////
	
}
