package com.kousuke;
import java.util.Scanner;


public class UserList {
	Scanner sc = new Scanner(System.in);
	Users users = new Users();

	public UserList() {

	}


	//利用者登録
	public void userRegistration() {
//		System.out.println("利用者の登録を致します");
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
//		System.out.println("利用者の一覧を表示します");
		int size = users.userList.size();//userListの配列の長さ
		for(int i=0; i < size; i++) {
			System.out.println(i+1 + ". " + users.userList.get(i));
		}
		System.out.println("---");
	}
	//利用者削除
	public void userDelet() {
//		System.out.println("登録済みの利用者を削除します");
		checkUserList();
		System.out.println("削除したい利用者の番号を入力してください");
		int number = sc.nextInt();
		int listNumber = number -1;
		System.out.println(users.userList.get(listNumber) + "を削除しました");
		users.userList.remove(listNumber);
		System.out.println("---");
	}

}
