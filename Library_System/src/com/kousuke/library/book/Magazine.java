package com.kousuke.library.book;

public class Magazine extends Book{
	private String genre = "雑誌";

	public Magazine(){

	}
	public Magazine(String name, String author){
		super(name, author);
	}
	public String getGenre() {
		return genre;
	}
	public void setGenre(String genre) {
		this.genre = genre;
	}

}
