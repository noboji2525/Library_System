package com.kousuke.library.ui;

import java.util.Scanner;

import com.kousuke.library.book.BookList;
import com.kousuke.library.rental.Rental;
import com.kousuke.library.user.UserList;

public class CUIRental {
	Rental rental = new Rental();

	public void selectRental(int flag_rental, UserList userList, BookList bookList) {
		int select;
		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);
		while (flag_rental == CUIMainMenu.MENU_RENTAL) {
			System.out.println("本の貸借メニュー" + CUIMainMenu.LINE_SPACE);
			System.out.println(
					"1. 本を借りる" + CUIMainMenu.LINE_SPACE
							+ "2. 本を返す" + CUIMainMenu.LINE_SPACE
							+ "3. レンタル状況" + CUIMainMenu.LINE_SPACE
							+ "4. 戻る" + CUIMainMenu.LINE_SPACE);
			System.out.print("操作を選んでください [1,2,3,4] > ");
			select = sc.nextInt();
			System.out.println("----");
			switch (select) {
			case 1://本を借りる
					//登録者一覧を表示
				System.out.println("誰が借りますか？");
				int userSize = userList.userList.size();
				for (int i = 0; i < userSize; i++) {
					System.out.println(i + 1 + ". " + userList.userList.get(i).getName());
				}
				System.out.print("番号を入力してください > ");
				int userNumber = sc.nextInt();

				//本の一覧を表示
				bookList.checkBookList();
				userNumber--;
				System.out.print(userList.userList.get(userNumber).getName() + "さんはどの本を借りますか？>");
				int bookNumber = sc.nextInt();
				bookNumber--;
				rental.userBookRental(userList, bookList, userNumber, bookNumber);
				System.out.println(userList.userList.get(userNumber).getName() + "さんは、" +
						bookList.bookList_all.get(0).get(bookNumber) + "を借りました");
				System.out.println("---");
				break;
			case 2://本を返す
				System.out.println("誰が返却をしますか？");
				userSize = userList.userList.size();
				for (int i = 0; i < userSize; i++) {
					System.out.println(i + 1 + ". " + userList.userList.get(i).getName());
				}
				System.out.print("番号を入力してください > ");
				userNumber = sc.nextInt();
				userNumber--;
				int userBookSize = userList.userList.get(userNumber).userBookList.size();
				if (userList.userList == null || userBookSize == 0) {
					System.out.println("レンタルしているものはありません");
				} else {
					System.out.println();
					System.out.println("レンタルしているものを表示します");
					if (userBookSize == 0) {
						System.out.println(userList.userList.get(userNumber).userBookList.get(0));
					} else {
						for (int i = 0; i < userBookSize; i++) {
							System.out.println(i+1 + "." +userList.userList.get(userNumber).userBookList.get(i));
						}
					}
					System.out.print("返却したい番号を入力してください>");
					int userBookNumber = sc.nextInt();
					userBookNumber --;
					rental.userReturnBook(userList, userNumber, userBookNumber);
					System.out.println(userList.userList.get(userNumber).getName() + "さんは"
							+ bookList.bookList_all.get(0).get(userBookNumber) +
							"を返却しました");
				}
				break;
			case 3://レンタル状況
				System.out.println("誰のレンタル状態を確認しますか？");
				userSize = userList.userList.size();
				for (int i = 0; i < userSize; i++) {
					System.out.println(i + 1 + ". " + userList.userList.get(i).getName());
				}
				System.out.print("番号を入力してください > ");
				userNumber = sc.nextInt();
				userNumber--;
				userBookSize = userList.userList.get(userNumber).userBookList.size();
				if (userList.userList == null || userBookSize == 0) {
					System.out.println("レンタルしているものはありません");
				} else {
					System.out.println();
					System.out.println("レンタルしているものを表示します");
					System.out.println("+++++++++++++");
					if (userBookSize == 0) {
						System.out.println(userList.userList.get(userNumber).userBookList.get(0));
					} else {
						for (int i = 0; i < userBookSize; i++) {
							System.out.println(userList.userList.get(userNumber).userBookList.get(i));
						}
					}
					System.out.println("+++++++++++++");
				}
				System.out.println("------------");

				break;
			case 4://戻る(メインメニューに遷移)
				CUIMainMenu.STATE_ON = CUIMainMenu.MENU_TOP;
				return;
			default:
				System.out.println("入力エラー：>>");
				break;
			}
		}

	}
}
