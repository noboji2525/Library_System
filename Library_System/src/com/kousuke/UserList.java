package com.kousuke;
import java.util.Scanner;


public class UserList {
	Scanner sc = new Scanner(System.in);

	public UserList() {

	}

	public void UserRegistration() {
		System.out.println("利用者の登録を致します");
		System.out.print("名前を入力してください：");
		String name = sc.next();
		Users users = new Users(name);
		users.userList.add(users.getName());
		System.out.println(users.getName() + "の登録を致しました");
	}

}
