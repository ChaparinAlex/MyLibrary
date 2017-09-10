package com.mylibrary.attributes;

public class GenreOfBook implements Attribute{
	
	private String genreOfBook;
	
	public GenreOfBook(String genreOfBook) {
		this.genreOfBook = genreOfBook;
	}

	public String getGenreOfBook() {
		return genreOfBook;
	}

	public void setGenreOfBook(String genreOfBook) {
		this.genreOfBook = genreOfBook;
	}

	@Override
	public String toString() {
		return "" + genreOfBook;
	}	

}
