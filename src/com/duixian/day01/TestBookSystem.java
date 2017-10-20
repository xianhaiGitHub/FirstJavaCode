package com.duixian.day01;

public class TestBookSystem {
	public static void main(String[] args) {
		RegistAndLogin registandlogin = new RegistAndLogin();
		registandlogin.init();
		
		BookSystem booksystem = new BookSystem();
		booksystem.bookInit();
	}
}
