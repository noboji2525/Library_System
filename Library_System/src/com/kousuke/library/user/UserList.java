package com.kousuke.library.user;

import java.util.ArrayList;
import java.util.List;

public class UserList {
//	User user = new User();
	public List<User> userList = new ArrayList<User>();
	public UserList() {

	}
	//利用者登録
	public void userRegistration(User user) {
		userList.add(user);
	}
	//利用者削除
	public void userDelet(int listNumber) {
		userList.remove(listNumber);
	}




}
