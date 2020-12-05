package com.kousuke;

import java.util.ArrayList;
import java.util.List;

public class UserList {
	Users users = new Users();
	public List<String> userList = new ArrayList<String>();
	public UserList() {

	}
	//利用者登録
	public void userRegistration(String name) {
		users.setName(name);
		userList.add(users.getName());
	}
	//利用者削除
	public void userDelet(int listNumber) {
		userList.remove(listNumber);
	}


}
