package com.kousuke.library.user;

public class User implements Human{
	public static int count=0;
	private int number;
	private String name;


	public User() {

	}
	public User(String name) {
		this.name = name;
		count++;
		this.number = count;
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
