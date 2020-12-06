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
		bookList_genre.add(genre);
		bookList_allUpdate();
	}
	//本の削除
	public void bookDelet(int number) {
		bookList_name.remove(number);
		bookList_author.remove(number);
		bookList_genre.remove(number);
		bookList_allUpdate();
	}
	//多次元リスト更新
	public void bookList_allUpdate() {
		bookList_all.clear();
		bookList_all.add(bookList_name);
		bookList_all.add(bookList_author);
		bookList_all.add(bookList_genre);
//		System.out.println(bookList_all);//デバッグ
	}

	//本の一覧確認
	public void checkBookList() {

	}


	}




