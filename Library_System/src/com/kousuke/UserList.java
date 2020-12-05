package com.kousuke;
import java.util.Scanner;


public class UserList {
	Scanner sc = new Scanner(System.in);
	Users users = new Users();

	public UserList() {

	}


	//利用者登録
	public void userRegistration() {
		System.out.println("利用者の登録を致します");
		System.out.print("名前を入力してください：");
		String name = sc.next();
//		Users users = new Users(name);
		users.setName(name);
		users.userList.add(users.getName());
		System.out.println(users.getName() + "の登録を致しました");
		System.out.println("---");
	}
	//利用者一覧表示
	public void checkUserList() {
		System.out.println("利用者の一覧を表示します");
		System.out.println(users.userList);
		System.out.println("---");

	}

}
