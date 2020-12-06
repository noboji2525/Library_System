package com.kousuke.library.book;

public class SpecialBook extends Book{
	private String genre = "単行本";

	public SpecialBook() {

	}
	public SpecialBook(String name, String author){
		super(name, author);
	}
	public String getGenre() {
		return genre;
	}
	public void setGenre(String genre) {
		this.genre = genre;
	}

}
