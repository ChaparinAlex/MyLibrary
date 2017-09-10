package com.mylibrary.printed_production;

import com.mylibrary.attributes.AnnotationToPrintedProduction;
import com.mylibrary.attributes.AuthorOfBook;
import com.mylibrary.attributes.DateOfIssueOfPrintedProduction;
import com.mylibrary.attributes.GenreOfBook;
import com.mylibrary.attributes.LanguageOfPrintedProduction;
import com.mylibrary.attributes.NameOfPrintedProduction;
import com.mylibrary.attributes.NumberOfPrintedProductionInLibrary;
import com.mylibrary.attributes.PublishingOfficeOfBook;
import com.mylibrary.attributes.TextOfPrintedProduction;
import com.mylibrary.attributes.TypeOfPrintedProduction;
import com.mylibrary.storage.Storage;

public class Book extends PrintedProduction{
	
	private AuthorOfBook authorOfBook;
	private PublishingOfficeOfBook publishingOfficeOfBook;
	private GenreOfBook genreOfBook;
	
	{
		type = TypeOfPrintedProduction.BOOK;
		numberOfPrintedProductionInLibrary = 
				new NumberOfPrintedProductionInLibrary(
						++Storage.quantityOfPrintedProductionInLibrary);
	}
	
	public Book(NameOfPrintedProduction nameOfBook, AuthorOfBook authorOfBook,
			PublishingOfficeOfBook publishingOfficeOfBook, 
			GenreOfBook genreOfBook,
			DateOfIssueOfPrintedProduction dateOfBookIssue, 
			LanguageOfPrintedProduction languageOfBook,
			AnnotationToPrintedProduction annotationToBook, 
			TextOfPrintedProduction textOfBook) {
		nameOfPrintedProduction = nameOfBook;
		this.authorOfBook = authorOfBook;
		this.publishingOfficeOfBook = publishingOfficeOfBook;
		this.genreOfBook = genreOfBook;
		dateOfIssueOfPrintedProduction = dateOfBookIssue;
		languageOfPrintedProduction = languageOfBook;
		annotationToPrintedProduction = annotationToBook;
		textOfPrintedProduction = textOfBook;
	}

	public AuthorOfBook getAuthorOfBook() {
		return authorOfBook;
	}
	
	public void setAuthorOfBook(AuthorOfBook authorOfBook) {
		this.authorOfBook = authorOfBook;
	}
	
	public PublishingOfficeOfBook getPublishingOfficeOfBook() {
		return publishingOfficeOfBook;
	}

	public void setPublishingOfficeOfBook(PublishingOfficeOfBook publishingOfficeOfBook) {
		this.publishingOfficeOfBook = publishingOfficeOfBook;
	}

	public GenreOfBook getGenreOfBook() {
		return genreOfBook;
	}

	public void setGenreOfBook(GenreOfBook genreOfBook) {
		this.genreOfBook = genreOfBook;
	}
	
	@Override
	public String toString() {
		return "Number in library: " + numberOfPrintedProductionInLibrary + "\n"
	            + type + ":\nName: " + nameOfPrintedProduction + "\nAuthor: " 
	           + authorOfBook + "\nPublishing office: " + publishingOfficeOfBook 
	            + "\nGenre: " + genreOfBook + "\nDate of issue: " + 
	            dateOfIssueOfPrintedProduction + "\nLanguage: " + 
	            languageOfPrintedProduction + "\nAnnotation to book: " + 
	            annotationToPrintedProduction + "\n\n";
	}

	@Override
	public void toRead() {
		System.out.println("Number in library: " + 
	                            this.getNumberOfPrintedProductionInLibrary());
		System.out.println(this.getAuthorOfBook());
		System.out.println(this.getNameOfPrintedProduction());
		System.out.println();
		System.out.println(this.getTextOfPrintedProduction());
		System.out.println();
	}	
	
}
