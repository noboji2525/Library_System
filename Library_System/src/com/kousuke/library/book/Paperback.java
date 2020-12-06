package com.kousuke.library.book;

public class Paperback extends Book{
	private String genre = "文庫本";

	public Paperback() {

	}
	public Paperback(String name, String author){
		super(name,author);
	}

	public String getGenre() {
		return genre;
	}
	public void setGenre(String genre) {
		this.genre = genre;
	}
}
