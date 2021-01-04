package com.kousuke.library.ui;

import java.util.Scanner;

import com.kousuke.library.book.BookList;
import com.kousuke.library.user.UserList;

public class CUIRental {
	public void selectRental(int flag_rental, UserList userList, BookList bookList) {
		int select;
		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);
		while(flag_rental == CUIMainMenu.MENU_RENTAL) {
			System.out.println("本の貸借メニュー" + CUIMainMenu.LINE_SPACE);
			System.out.println(
					"1. 本を借りる" + CUIMainMenu.LINE_SPACE
					+ "2. 本を返す" + CUIMainMenu.LINE_SPACE
					+ "3. レンタル状況" + CUIMainMenu.LINE_SPACE
					+ "4. 戻る" + CUIMainMenu.LINE_SPACE
					);
			System.out.print("操作を選んでください [1,2,3,4] > ");
			select = sc.nextInt();
			switch(select) {
			case 1://本を借りる
				System.out.println("誰が借りますか？");
				int size = userList.userList.size();
				for(int i=0; i < size; i++) {
					System.out.print(i+1 + ". " + userList.userList.get(i).getName());
				}
				System.out.print("番号を入力してください > ");
				int number = sc.nextInt();









				System.out.println("---");
				break;
			case 2://本を返す

				break;
			case 3://レンタル状況

				break;
			case 4://戻る(メインメニューに遷移)
				CUIMainMenu.STATE_ON = CUIMainMenu.MENU_TOP;
				return;
			default:
				break;
			}
		}

	}
}



