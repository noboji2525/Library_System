package com.kousuke.library.user;

import java.io.Serializable;

public class User implements Human, Serializable{
//	public final int count=1;
	private int number=0;
	private String name;


	public User() {

	}
	public User(String name, UserList userList) {
		this.name = name;
		this.number = userList.getCounter();
	}


	//本を借りる
	@Override
	public void bookRental() {

	}
	//本を返却
	@Override
	public void returnBook() {

	}

	public String getName() {return name;}
	public void setName(String name) {this.name = name;}

	public int getNumber() {return number;}
	public void setNumber(int number) {this.number = number;}


}
