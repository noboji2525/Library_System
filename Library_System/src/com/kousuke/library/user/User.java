package com.kousuke.library.user;

public class User extends Human{
	private int number;

	public User() {

	}
	public User(String name) {
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
