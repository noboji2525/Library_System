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
	static final int MENU_TOP = 0;//メインメニューのフラグ
	static final int MENU_USERLIST = 1;//利用者名簿のフラグ
	static final int MENU_BOOKLIST = 2;//本のフラグ
	static final int MENU_RENTAL = 3; //レンタルのフラグ
	static int STATE_ON = -1;
	static final String LINE_SPACE = System.getProperty("line.separator");

	public static void main(String[] args) throws IOException, ClassNotFoundException {
//		oos.writeObject(userList);
//		oos.flush();
		//oos.close();
		int select;//sc格納
		UserList userList = new UserList();
		BookList bookList = new BookList();
		CUIUserList CUIUser_List = new CUIUserList();
		CUIBookList CUIBook_List = new CUIBookList();
		CUIRental CUI_Rental = new CUIRental();
		File file = new File("./userList.dat");
		Scanner sc = new Scanner(System.in);

		if(file.exists()) {
			FileInputStream fis = new FileInputStream("./userList.dat");
			ObjectInputStream ois = new ObjectInputStream(fis);
			userList = (UserList) ois.readObject();
			ois.close();
		}
		System.out.println("図書館へようこそ！");
		STATE_ON  = MENU_TOP;
		while(STATE_ON == 0) {
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
					STATE_ON = MENU_USERLIST;
					CUIUser_List.selectUserList(STATE_ON, userList);
					break;
				case 2://本棚
					STATE_ON = MENU_BOOKLIST;
					CUIBook_List.selectBookList(STATE_ON, bookList);
					break;
				case 3://貸出し
					STATE_ON = MENU_RENTAL;
					CUI_Rental.selectRental(STATE_ON, userList, bookList);
					break;
				case 4://終了
					System.out.println("終了します");
					STATE_ON = -1;
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
		STATE_ON = MENU_TOP;
	}


}
