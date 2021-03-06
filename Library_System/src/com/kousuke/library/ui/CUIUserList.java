package com.kousuke.library.ui;

import java.util.Scanner;

import com.kousuke.library.user.User;
import com.kousuke.library.user.UserList;

public class CUIUserList {
	CUIUserList(){

	}

	public void selectUserList(int flag_userList, UserList userList) {
		int select;
		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);
		while(flag_userList == CUIMainMenu.MENU_USERLIST) {
			System.out.println("利用者名簿メニュー" + CUIMainMenu.LINE_SPACE);
			System.out.println(
					"1. 利用者登録" + CUIMainMenu.LINE_SPACE
					+ "2. 利用者削除" + CUIMainMenu.LINE_SPACE
					+ "3. 利用者確認" + CUIMainMenu.LINE_SPACE
					+ "4. 戻る" + CUIMainMenu.LINE_SPACE
					);
			System.out.print("操作を選んでください [1,2,3,4] > ");
			select = sc.nextInt();
				switch(select) {
				case 1://利用者登録
					System.out.println("利用者の登録をします");
					System.out.print("名前を入力してください：");
					String name = sc.next();
					User user = new User(name, userList);
					userList.userRegistration(user);
					System.out.println(String.format("『%s』の登録を致しました",name));
					System.out.println(String.format("登録番号は【%1$03d】です",user.getNumber()));
					System.out.println("---");
					break;
				case 2://利用者削除
					System.out.println("登録済みの利用者を削除します");
					int size = userList.userList.size();//userListの配列の長さ
					for(int i=0; i < size; i++) {
						System.out.println(i+1 + ". " + userList.userList.get(i).getName());
					}
					System.out.println("削除したい利用者の番号を入力してください");
					int number = sc.nextInt();
					int listNumber = number -1;
					System.out.println(String.format("『%s』を削除しました",userList.userList.get(listNumber).getName()));
					userList.userDelet(listNumber);
					System.out.println("---");
					break;
				case 3://利用者確認
					System.out.println("登録されている利用者を確認します");
					size = userList.userList.size();
					for(int i=0; i < size; i++) {
						System.out.print(String.format("番号【%1$03d】",
								userList.userList.get(i).getNumber()));
						System.out.println(String.format("利用者名【%s】",
								userList.userList.get(i).getName()));
					}
					break;
				case 4://戻る(メインメニューに遷移)
					CUIMainMenu.STATE_ON = CUIMainMenu.MENU_TOP;
					return;

				default:
					return;
				}
		}


	}

}
