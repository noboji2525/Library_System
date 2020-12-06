package com.kousuke.library.book;

import java.util.ArrayList;

public class BookList {
	Magazine magazine = new Magazine();
	Paperback paperback = new Paperback();
	SpecialBook specialBook = new SpecialBook();

//	public String bookList[][][];//雑誌

	public ArrayList<String> bookList_name = new ArrayList<String>();//名前
	public ArrayList<String> bookList_author = new ArrayList<String>();//著者
	public ArrayList<String> bookList_genre= new ArrayList<String>();//ジャンル
	public ArrayList<ArrayList<String>> bookList_all = new ArrayList<ArrayList<String>>();//多次元リスト

	public BookList(){

	}

	//本の登録
	public void bookRegistration(String name, String author, String genre) {
			bookList_name.add(name);
			bookList_author.add(author);
			switch(genre) {
				case("1")://雑誌
					bookList_genre.add(magazine.getGenre());
					break;
				case("2")://文庫本
					bookList_genre.add(paperback.getGenre());
					break;
				case("3")://単行本
					bookList_genre.add(specialBook.getGenre());
					break;
			}

			bookList_all.add(bookList_name);
			bookList_all.add(bookList_author);
			bookList_all.add(bookList_genre);
			System.out.println(bookList_all);//デバッグ
		}

	}




