package com.kousuke.library.rental;

import com.kousuke.library.book.BookList;
import com.kousuke.library.user.UserList;

public class Rental {
	UserList userList = new UserList();
	BookList bookList = new BookList();

	public Rental(){

	}

	public void userBookRental(UserList userList, BookList bookList, int userNumber, int bookNumber){
		userList.userList.get(userNumber).bookRental(bookList, bookNumber);;
	}

	public void userReturnBook(UserList userList, int userNumber, int userBookNumber) {
		userList.userList.get(userNumber).returnBook(userBookNumber);
	}


}
