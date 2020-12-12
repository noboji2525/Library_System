package com.kousuke.library.user;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

public class UserList implements Serializable{
//	User user = new User();
	private static final long serialVersionUID = 2020121123501L;
	public List<User> userList = new ArrayList<User>();
	private int counter=1;
	public UserList() {

	}
	//利用者登録
	public void userRegistration(User user) {
		userList.add(user);
		this.setCounter(this.getCounter() + 1);

	}
	//利用者削除
	public void userDelet(int listNumber) {
		userList.remove(listNumber);
	}
	public int getCounter() {
		return counter;
	}
	public void setCounter(int counter) {
		this.counter = counter;
	}




}
