package com.mylibrary.storage;

import java.util.Collections;
import java.util.LinkedHashSet;
import java.util.Set;

import com.mylibrary.attributes.AnnotationToPrintedProduction;
import com.mylibrary.attributes.AuthorOfBook;
import com.mylibrary.attributes.DateOfIssueOfPrintedProduction;
import com.mylibrary.attributes.GeneralIssueOfMassMedia;
import com.mylibrary.attributes.GenreOfBook;
import com.mylibrary.attributes.LanguageOfPrintedProduction;
import com.mylibrary.attributes.NameOfPrintedProduction;
import com.mylibrary.attributes.NumberOfIssueOfMassMedia;
import com.mylibrary.attributes.PublishingOfficeOfBook;
import com.mylibrary.attributes.TextOfPrintedProduction;
import com.mylibrary.attributes.TypeOfPrintedProduction;
import com.mylibrary.printed_production.Book;
import com.mylibrary.printed_production.Magazine;
import com.mylibrary.printed_production.Newspaper;
import com.mylibrary.printed_production.PrintedProduction;

public class Storage {
	
	public static int quantityOfPrintedProductionInLibrary;
	
	private Storage(){};

	private static Set<PrintedProduction> storage = new LinkedHashSet<>();
	
	static {
		Collections.addAll(storage, 
				new Book(new NameOfPrintedProduction("The three musketeers"), 
						new AuthorOfBook("Alexandre Dumas"),
				        new PublishingOfficeOfBook("Machaon"), 
				        new GenreOfBook("Historical novel"),
				        new DateOfIssueOfPrintedProduction("01/01/2016"), 
				        new LanguageOfPrintedProduction("English"),
				        new AnnotationToPrintedProduction("---annotation---"), 
				        new TextOfPrintedProduction("---text---")),
				new Book(new NameOfPrintedProduction("The financier"), 
						new AuthorOfBook("Theodore Dreiser"),
				        new PublishingOfficeOfBook("Folio"), 
				        new GenreOfBook("Novel"),
				        new DateOfIssueOfPrintedProduction("01/01/2015"), 
				        new LanguageOfPrintedProduction("Ukrainian"),
				        new AnnotationToPrintedProduction("---annotation---"), 
				        new TextOfPrintedProduction("---text---")),
				new Book(new NameOfPrintedProduction("Kobzar"), 
						new AuthorOfBook("Taras Shevchenko"),
				        new PublishingOfficeOfBook("Old Lion"), 
				        new GenreOfBook("Poetry"),
				        new DateOfIssueOfPrintedProduction("01/01/2013"), 
				        new LanguageOfPrintedProduction("Ukrainian"),
				        new AnnotationToPrintedProduction("---annotation---"), 
				        new TextOfPrintedProduction("---text---")),
				new Book(new NameOfPrintedProduction("Core Java"), 
						new AuthorOfBook("Cay Horstmann"),
				        new PublishingOfficeOfBook("Williams"), 
				        new GenreOfBook("Manual"),
				        new DateOfIssueOfPrintedProduction("01/01/2014"), 
				        new LanguageOfPrintedProduction("Russian"),
				        new AnnotationToPrintedProduction("---annotation---"), 
				        new TextOfPrintedProduction("---text---")),
				new Book(new NameOfPrintedProduction("Java EE Cookbook"), 
						new AuthorOfBook("Mick Knutson"),
				        new PublishingOfficeOfBook("Packt Publishing"), 
				        new GenreOfBook("Manual"),
				        new DateOfIssueOfPrintedProduction("01/01/2016"), 
				        new LanguageOfPrintedProduction("English"),
				        new AnnotationToPrintedProduction("---annotation---"), 
				        new TextOfPrintedProduction("---text---")),
				new Newspaper(new NameOfPrintedProduction("Daily Mail"), 
			            new DateOfIssueOfPrintedProduction("24/11/2016"),
			            new NumberOfIssueOfMassMedia(47), 
			            new LanguageOfPrintedProduction("English"),
			            new GeneralIssueOfMassMedia(500000),
			            new AnnotationToPrintedProduction("---annotation---"), 
				        new TextOfPrintedProduction("---text---")),
				new Newspaper(new NameOfPrintedProduction("Washington Post"), 
		                new DateOfIssueOfPrintedProduction("17/11/2016"),
		                new NumberOfIssueOfMassMedia(46),
		                new LanguageOfPrintedProduction("English"),
		                new GeneralIssueOfMassMedia(600000),
		                new AnnotationToPrintedProduction("---annotation---"), 
				        new TextOfPrintedProduction("---text---")),
				new Newspaper(new NameOfPrintedProduction("Express"), 
		                new DateOfIssueOfPrintedProduction("10/11/2016"),
		                new NumberOfIssueOfMassMedia(137),
		                new LanguageOfPrintedProduction("Ukrainian"),
		                new GeneralIssueOfMassMedia(100000),
		                new AnnotationToPrintedProduction("---annotation---"), 
				        new TextOfPrintedProduction("---text---")),
				new Newspaper(new NameOfPrintedProduction("Football"), 
		                new DateOfIssueOfPrintedProduction("24/11/2016"),
		                new NumberOfIssueOfMassMedia(47),
		                new LanguageOfPrintedProduction("Russian"),
		                new GeneralIssueOfMassMedia(50000),
		                new AnnotationToPrintedProduction("---annotation---"), 
				        new TextOfPrintedProduction("---text---")),
				new Newspaper(new NameOfPrintedProduction("New York Times"), 
		                new DateOfIssueOfPrintedProduction("17/11/2016"),
		                new NumberOfIssueOfMassMedia(46),
		                new LanguageOfPrintedProduction("English"),
		                new GeneralIssueOfMassMedia(1000000),
		                new AnnotationToPrintedProduction("---annotation---"), 
				        new TextOfPrintedProduction("---text---")),
				new Magazine(new NameOfPrintedProduction("Forbes"), 
			            new DateOfIssueOfPrintedProduction("24/11/2016"),
			            new NumberOfIssueOfMassMedia(47),
			            new LanguageOfPrintedProduction("English"),
			            new GeneralIssueOfMassMedia(1000000),
			            new AnnotationToPrintedProduction("---annotation---"), 
				        new TextOfPrintedProduction("---text---")),
				new Magazine(new NameOfPrintedProduction("Vogue"), 
			            new DateOfIssueOfPrintedProduction("03/11/2016"),
			            new NumberOfIssueOfMassMedia(44),
			            new LanguageOfPrintedProduction("English"),
			            new GeneralIssueOfMassMedia(1000000),
			            new AnnotationToPrintedProduction("---annotation---"), 
				        new TextOfPrintedProduction("---text---")),
				new Magazine(new NameOfPrintedProduction("Rolling Stone"), 
			            new DateOfIssueOfPrintedProduction("10/11/2016"),
			            new NumberOfIssueOfMassMedia(45),
			            new LanguageOfPrintedProduction("English"),
			            new GeneralIssueOfMassMedia(2000000),
			            new AnnotationToPrintedProduction("---annotation---"), 
				        new TextOfPrintedProduction("---text---")),
				new Magazine(new NameOfPrintedProduction("Football"), 
			            new DateOfIssueOfPrintedProduction("24/11/2016"),
			            new NumberOfIssueOfMassMedia(47),
			            new LanguageOfPrintedProduction("Russian"),
			            new GeneralIssueOfMassMedia(200000),
			            new AnnotationToPrintedProduction("---annotation---"), 
				        new TextOfPrintedProduction("---text---")),
				new Magazine(new NameOfPrintedProduction("Krayina"), 
			            new DateOfIssueOfPrintedProduction("17/11/2016"),
			            new NumberOfIssueOfMassMedia(46),
			            new LanguageOfPrintedProduction("Ukrainian"),
			            new GeneralIssueOfMassMedia(10000),
			            new AnnotationToPrintedProduction("---annotation---"), 
				        new TextOfPrintedProduction("---text---"))
				);
	}
	
	public static Set<PrintedProduction> getStorage() {
		return storage;
	}

	public static String toPrint(Set<? extends PrintedProduction> setOfPP) {
		String temp = "";
		for(PrintedProduction pp:setOfPP){
			temp += pp.toString();
		}
		return temp;
	} 
	
	public static Set<Book> getAllBooksFromLibrary(){
		Set<Book> setOfBooks = new LinkedHashSet<>();
		for(PrintedProduction pp: storage){
			if(pp.getType() == TypeOfPrintedProduction.BOOK)
				setOfBooks.add((Book)pp);
		}
		return setOfBooks;
	}
	
	public static Set<Newspaper> getAllNewspapersFromLibrary(){
		Set<Newspaper> setOfNewspapers = new LinkedHashSet<>();
		for(PrintedProduction pp: storage){
			if(pp.getType() == TypeOfPrintedProduction.NEWSPAPER)
				setOfNewspapers.add((Newspaper)pp);
		}
		return setOfNewspapers;
	}
	
	public static Set<Magazine> getAllMagazinesFromLibrary(){
		Set<Magazine> setOfMagazines = new LinkedHashSet<>();
		for(PrintedProduction pp: storage){
			if(pp.getType() == TypeOfPrintedProduction.MAGAZINE)
				setOfMagazines.add((Magazine)pp);
		}
		return setOfMagazines;
	}

}
