package com.kousuke;

import java.util.ArrayList;
import java.util.List;

public class Users extends Human{
	private int number;
	public List<String> userList = new ArrayList();

	public Users() {

	}
	public Users(String name) {
		super(name);

	}



	public void bookRental() {

	}

	public void returnBook() {

	}

	public int getNumber() {return number;}
	public void setNumber(int number) {this.number = number;}


}
