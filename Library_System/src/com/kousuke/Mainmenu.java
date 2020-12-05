package com.kousuke;

import java.util.Scanner;

public class Mainmenu {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		boolean flag_main = true;//メインメニューのフラグ
		boolean flag_userList = true;//利用者名簿のフラグ
		final String LINE_SPACE = System.getProperty("line.separator");
		UserList userList = new UserList();

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
			int select = sc.nextInt();
			System.out.println("---");
			switch(select) {
				case 1://利用者名簿メニュー
					while(flag_userList) {
						flag_userList = true;
						System.out.println("---");
						System.out.println("利用者名簿メニュー" + LINE_SPACE);
						System.out.println(
								"1. 利用者登録" + LINE_SPACE
								+ "2.利用者削除" + LINE_SPACE
								+ "3. 利用者一覧" + LINE_SPACE
								+ "4. 戻る" + LINE_SPACE + LINE_SPACE
								);
						System.out.println("操作を選んでください [1,2,3,4] > ");
						select = sc.nextInt();
							switch(select) {
							case 1://利用者登録
								userList.userRegistration();
								break;
							case 2://利用者削除
								break;
							case 3://利用者一覧
								System.out.println("利用者一覧を開きます");
								userList.checkUserList();
								break;
							case 4://戻る
								flag_userList = false;
								break;
							default:
								break;
							}

					}




					break;
				case 2://本棚
					System.out.println("未実装");
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

}
