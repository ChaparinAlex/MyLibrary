package com.mylibrary.attributes;

public class PublishingOfficeOfBook implements Attribute{
	
	private String publishingOfficeOfBook;
	
	public PublishingOfficeOfBook(String publishingOfficeOfBook) {
		this.publishingOfficeOfBook = publishingOfficeOfBook;
	}

	public String getPublishingOfficeOfBook() {
		return publishingOfficeOfBook;
	}


	public void setPublishingOfficeOfBook(String publishingOfficeOfBook) {
		this.publishingOfficeOfBook = publishingOfficeOfBook;
	}


	@Override
	public String toString() {
		return "" + publishingOfficeOfBook;
	}
	
}
