package com.kousuke.library.user;

import java.util.ArrayList;
import java.util.List;

public class UserList {
	User user = new User();
	public List<String> userList = new ArrayList<String>();
	public UserList() {

	}
	//利用者登録
	public void userRegistration(String name) {
		user.setName(name);
		userList.add(user.getName());
	}
	//利用者削除
	public void userDelet(int listNumber) {
		userList.remove(listNumber);
	}


}
