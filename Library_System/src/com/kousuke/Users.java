package com.kousuke;

import java.util.ArrayList;
import java.util.List;

public class Users extends Human{
	private int number;
	public List<String> userList = new ArrayList<String>();

	public Users() {

	}
	public Users(String name) {
		super(name);

	}


	//本を借りる
	public void bookRental() {

	}
	//本を返却
	public void returnBook() {

	}

	public int getNumber() {return number;}
	public void setNumber(int number) {this.number = number;}


}
