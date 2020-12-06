package com.kousuke.library.ui;


public class CUIUserList {

	public static void selectUserList(boolean flag_userList) {

		while(flag_userList) {
			System.out.println("利用者名簿メニュー" + CUIMainMenu.LINE_SPACE);
			System.out.println(
					"1. 利用者登録" + CUIMainMenu.LINE_SPACE
					+ "2. 利用者削除" + CUIMainMenu.LINE_SPACE
					+ "3. 戻る" + CUIMainMenu.LINE_SPACE
					);
			System.out.print("操作を選んでください [1,2,3,4] > ");
			CUIMainMenu.select = CUIMainMenu.sc.nextInt();
				switch(CUIMainMenu.select) {
				case 1://利用者登録
					System.out.println("利用者の登録をします");
					System.out.print("名前を入力してください：");
					String name = CUIMainMenu.sc.next();
					CUIMainMenu.userList.userRegistration(name);
					System.out.println(name + "の登録を致しました");
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
					System.out.println(CUIMainMenu.userList.userList.get(listNumber) + "を削除しました");
					CUIMainMenu.userList.userDelet(listNumber);
					System.out.println("---");
					break;
				case 3://戻る(メインメニューに遷移)
					flag_userList = false;
					break;
				default:
					break;
				}
		}


	}

}
