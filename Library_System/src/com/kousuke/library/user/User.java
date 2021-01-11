package com.kousuke.library.user;

import java.io.Serializable;
import java.util.ArrayList;

import com.kousuke.library.book.BookList;

public class User implements Human, Serializable{
//	public final int count=1;
	private int number=0;
	private String name;
	public ArrayList<String> userBookList = new ArrayList<String>();


	public User() {

	}
	public User(String name, UserList userList) {
		this.name = name;
		this.number = userList.getCounter();
	}


	//本を借りる
	@Override
	public void bookRental(BookList bookList, int bookNumber) {
		userBookList.add(bookList.bookList_all.get(0).get(bookNumber));
//		System.out.println("ブックリスト表示：" + userBookList);

	}
	//本を返却
	@Override
	public void returnBook(int userBookNumber) {
		userBookList.remove(userBookNumber);
	}

	public String getName() {return name;}
	public void setName(String name) {this.name = name;}

	public int getNumber() {return number;}
	public void setNumber(int number) {this.number = number;}


}
