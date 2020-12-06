package com.kousuke.library.ui;

import java.util.Scanner;

import com.kousuke.library.book.BookList;
import com.kousuke.library.user.User;
import com.kousuke.library.user.UserList;

public class CUIMainMenu {
	static boolean flag_main = true;//メインメニューのフラグ
	static boolean flag_userList = true;//利用者名簿のフラグ
	static boolean flag_bookList = true;//本棚のフラグ
	static final String LINE_SPACE = System.getProperty("line.separator");
	static Scanner sc = new Scanner(System.in);
	static UserList userList = new UserList();
	static BookList bookList = new BookList();
	static User user = new User();
	static int select;
	public static void main(String[] args) {

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
		sc.close();

	}
	public static void clearFlag() {
		flag_main = true;
		flag_userList = true;
		flag_bookList = true;
	}


}
