package com.kousuke.library.ui;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.Scanner;

import com.kousuke.library.book.BookList;
import com.kousuke.library.user.User;
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
		User user = new User();
		UserList userList = new UserList();
		BookList bookList = new BookList();
		CUIUserList CUIUser_List = new CUIUserList();
		CUIBookList CUIBook_List = new CUIBookList();
		CUIRental CUI_Rental = new CUIRental();
		File userFile = new File("./user.dat");
		File userListFile = new File("./userList.dat");
		File bookFile = new File("./bookList.dat");
		Scanner sc = new Scanner(System.in);
		if(userFile.exists()) {
			FileInputStream fis_u = new FileInputStream("./user.dat");
			ObjectInputStream ois_u = new ObjectInputStream(fis_u);
			user = (User) ois_u.readObject();
			ois_u.close();
		}

		if(userListFile.exists()) {
			FileInputStream fis_ul = new FileInputStream("./userList.dat");
			ObjectInputStream ois_ul = new ObjectInputStream(fis_ul);
			userList = (UserList) ois_ul.readObject();
			ois_ul.close();
		}
		if(bookFile.exists()) {
			FileInputStream fis_b = new FileInputStream("./bookList.dat");
			ObjectInputStream ois_b = new ObjectInputStream(fis_b);
			bookList = (BookList) ois_b.readObject();
			ois_b.close();
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
		FileOutputStream fos_u = new FileOutputStream("./user.dat");
		ObjectOutputStream oos_u = new ObjectOutputStream(fos_u);

		FileOutputStream fos_ul = new FileOutputStream("./userList.dat");
		ObjectOutputStream oos_ul = new ObjectOutputStream(fos_ul);

		FileOutputStream fos_b = new FileOutputStream("./bookList.dat");
		ObjectOutputStream oos_b = new ObjectOutputStream(fos_b);

		oos_u.writeObject(user);
		oos_u.flush();

		oos_ul.writeObject(userList);
		oos_ul.flush();

		oos_b.writeObject(bookList);
		oos_b.flush();

		oos_u.close();
		oos_ul.close();
		oos_b.close();
		sc.close();

	}
	public static void clearFlag() {
		STATE_ON = MENU_TOP;
	}


}
