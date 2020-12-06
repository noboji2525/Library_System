package com.kousuke.library.ui;

public class CUIBookList {

	public static void selectBookList(boolean flag_bookList) {

		while(flag_bookList) {
			System.out.println("本棚メニュー" + CUIMainMenu.LINE_SPACE);
			System.out.println(
					"1. 本の登録" + CUIMainMenu.LINE_SPACE
					+ "2. 本の削除" + CUIMainMenu.LINE_SPACE
					+ "3. 戻る" + CUIMainMenu.LINE_SPACE
					);
			System.out.print("操作を選んでください [1,2,3] > ");
			CUIMainMenu.select = CUIMainMenu.sc.nextInt();
				switch(CUIMainMenu.select) {
				case 1://本の登録
					System.out.println("本の登録をします");
					System.out.print("名前を入力してください：");
					String name = CUIMainMenu.sc.next();
					System.out.print("著者を入力してください");
					String author = CUIMainMenu.sc.next();
					System.out.println(
							"1. 雑誌" + CUIMainMenu.LINE_SPACE
							+ "2. 文庫本" + CUIMainMenu.LINE_SPACE
							+ "3. 単行本" + CUIMainMenu.LINE_SPACE
							);
					System.out.print("ジャンルを選んでください [1,2,3] >");
					String genre = CUIMainMenu.sc.next();
					CUIMainMenu.bookList.bookRegistration(name,author,genre);
					System.out.println(String.format("『%s』の登録を致しました",name));
					System.out.println("---");
					break;
				case 2://利用者削除
					System.out.println("登録済みの利用者を削除します");
					int size = CUIMainMenu.userList.userList.size();//userListの配列の長さ
					for(int i=0; i < size; i++) {
						System.out.println(i+1 + ". " + CUIMainMenu.userList.userList.get(i));
					}
					System.out.println("削除したい利用者の番号を入力してください");
					int number = CUIMainMenu.sc.nextInt();
					int listNumber = number -1;
					System.out.println(String.format("『%s』を削除しました",CUIMainMenu.userList.userList.get(listNumber)));
					CUIMainMenu.userList.userDelet(listNumber);
					System.out.println("---");
					break;
				case 3://戻る(メインメニューに遷移)
					flag_bookList = false;
					break;
				default:
					break;
				}
		}

	}
}