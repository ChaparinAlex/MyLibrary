package com.mylibrary.attributes;

public class AuthorOfBook implements Attribute{
	
	private String authorOfBook;
	
	public AuthorOfBook(String authorOfBook) {
		this.authorOfBook = authorOfBook;
	}	

	public String getAuthorOfBook() {
		return authorOfBook;
	}


	public void setAuthorOfBook(String authorOfBook) {
		this.authorOfBook = authorOfBook;
	}


	@Override
	public String toString() {
		return "" + authorOfBook;
	}	

}
