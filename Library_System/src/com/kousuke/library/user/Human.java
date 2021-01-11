package com.kousuke.library.user;

import com.kousuke.library.book.BookList;

public interface Human {
	void returnBook(int userBookNumber);
	void bookRental(BookList bookList, int bookNumber);




}
