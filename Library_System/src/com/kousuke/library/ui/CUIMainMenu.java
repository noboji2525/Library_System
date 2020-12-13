package com.kousuke.library.ui;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.Scanner;

import com.kousuke.library.book.BookList;
import com.kousuke.library.user.UserList;

public class CUIMainMenu {
	static boolean flag_main = true;//メインメニューのフラグ
	static boolean flag_userList = true;//利用者名簿のフラグ
	static boolean flag_bookList = true;//本棚のフラグ
	static final String LINE_SPACE = System.getProperty("line.separator");
	static Scanner sc = new Scanner(System.in);
	public static UserList userList = new UserList();
	static BookList bookList = new BookList();
//	static User user = new User();
	static int select;
	static File file = new File("./userList.dat");

	public static void main(String[] args) throws IOException, ClassNotFoundException {
//		oos.writeObject(userList);
//		oos.flush();
		//oos.close();
		if(file.exists()) {
			FileInputStream fis = new FileInputStream("./userList.dat");
			ObjectInputStream ois = new ObjectInputStream(fis);
			userList = (UserList) ois.readObject();
			ois.close();
		}
		System.out.println("図書館へようこそ！");
		while(flag_main) {
			System.out.println("---");
			System.out.println("メインメニュー");
			System.out.println();
			System.out.println(
					"1. 利用者名簿" + LINE_SPACE
					+ "2. 本棚" + LINE_SPACE
					+ "3. 貸出し" + LINE_SPACE
					+ "4. 終了" + LINE_SPACE
					);
			System.out.print("操作を選んでください [1,2,3,4] > ");
			select = sc.nextInt();
			System.out.println("---");
			clearFlag();
			switch(select) {
				case 1://利用者名簿メニューに遷移
					CUIUserList.selectUserList(flag_userList);
					break;
				case 2://本棚
					CUIBookList.selectBookList(flag_bookList);
					break;
				case 3://貸出し
					System.out.println("未実装");
					break;
				case 4://終了
					System.out.println("終了します");

					flag_main = false;
					break;
				default:
					System.out.println("入力失敗。メインメニューに戻ります");
					break;
			}

		}
		FileOutputStream fos = new FileOutputStream("./userList.dat");
		ObjectOutputStream oos = new ObjectOutputStream(fos);
		oos.writeObject(userList);
		oos.flush();
		oos.close();
		sc.close();

	}
	public static void clearFlag() {
		flag_main = true;
		flag_userList = true;
		flag_bookList = true;
	}


}
