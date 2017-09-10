package com.mylibrary.service;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Scanner;
import java.util.Set;
import com.mylibrary.attributes.AnnotationToPrintedProduction;
import com.mylibrary.attributes.Attribute;
import com.mylibrary.attributes.AuthorOfBook;
import com.mylibrary.attributes.DateOfIssueOfPrintedProduction;
import com.mylibrary.attributes.GenreOfBook;
import com.mylibrary.attributes.LanguageOfPrintedProduction;
import com.mylibrary.attributes.NameOfPrintedProduction;
import com.mylibrary.attributes.NumberOfPrintedProductionInLibrary;
import com.mylibrary.attributes.PublishingOfficeOfBook;
import com.mylibrary.attributes.TextOfPrintedProduction;
import com.mylibrary.attributes.TypeOfPrintedProduction;
import com.mylibrary.printed_production.Book;
import com.mylibrary.printed_production.PrintedProduction;
import com.mylibrary.storage.Storage;

public class BookServiceImpl implements PrintedProductionService{

	@Override
	public void addPrintedProductionToLibrary() {
		String tempName, tempAuthor, tempPublOffice, tempGenre, tempDateOfIssue,
		       tempLanguage, tempAnnotation, tempText;
		
		@SuppressWarnings("resource")
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("Please, input name of book: ");
		tempName = scanner.nextLine();
		System.out.println();
		System.out.print("Please, input author of book: ");
		tempAuthor = scanner.nextLine();
		System.out.println();
		System.out.print("Please, input publishing office of book: ");
		tempPublOffice = scanner.nextLine();
		System.out.println();
		System.out.print("Please, input genre of book: ");
		tempGenre = scanner.nextLine();
		System.out.println();
		System.out.print("Please, input date of issue of book (dd/mm/yyyy): ");
		tempDateOfIssue = scanner.nextLine();
		System.out.println();
		System.out.print("Please, input language of book: ");
		tempLanguage = scanner.nextLine();
		System.out.println();
		System.out.print("Please, input annotation to book: ");
		tempAnnotation = scanner.nextLine();
		System.out.println();
		System.out.print("Please, input text of book: ");
		tempText = scanner.nextLine();
		System.out.println();
		Storage.getStorage().add(
			   new Book(new NameOfPrintedProduction(tempName), 
						new AuthorOfBook(tempAuthor),
				        new PublishingOfficeOfBook(tempPublOffice), 
				        new GenreOfBook(tempGenre),
				        new DateOfIssueOfPrintedProduction(tempDateOfIssue), 
				        new LanguageOfPrintedProduction(tempLanguage),
				        new AnnotationToPrintedProduction(tempAnnotation), 
				        new TextOfPrintedProduction(tempText)
				        ));
	}

	@Override
	public void removePrintedProductionFromLibrary(PrintedProduction 
			                                             printedProduction) {
		if(Storage.getStorage().contains(printedProduction)){
			Storage.getStorage().remove(printedProduction);
		}
		Storage.quantityOfPrintedProductionInLibrary--;
		int newNumberInLibrary = 1; 
		for(PrintedProduction pp:Storage.getStorage()){
			pp.getNumberOfPrintedProductionInLibrary().
			                        setNumberInLibrary(newNumberInLibrary++);
		}
	}

	@Override
	public void readPrintedProduction(PrintedProduction printedProduction) {
		printedProduction.toRead();		
	}

	@Override
	public Set<PrintedProduction> findPrintedProductionByAttributes(Attribute 
			attribute, String attributeValue) {
		Set<PrintedProduction> books = new LinkedHashSet<>();
		
		if (attribute.getClass().getName().contains(
				NumberOfPrintedProductionInLibrary.class.getName()) ||  
				NumberOfPrintedProductionInLibrary.class.getName().
				contains(attribute.getClass().getName())){
			for(Book book:Storage.getAllBooksFromLibrary()){
			  if(book.getNumberOfPrintedProductionInLibrary().toString().
					  equals(attributeValue)){
				  books.add(book);					
			  }
			}			
		}
		
		if (attribute.getClass().getName().contains(TypeOfPrintedProduction.
				class.getName()) ||  TypeOfPrintedProduction.class.getName().
				contains(attribute.getClass().getName())){
			for(Book book:Storage.getAllBooksFromLibrary()){
			  if(book.getType().toString().equalsIgnoreCase(attributeValue)){
				  books.add(book);					
			  }
			}			
		}
		
		if (attribute.getClass().getName().contains(NameOfPrintedProduction.
				class.getName()) ||  NameOfPrintedProduction.class.getName().
				contains(attribute.getClass().getName())){
			for(Book book:Storage.getAllBooksFromLibrary()){
			  if(book.getNameOfPrintedProduction().toString().toLowerCase().
					                    contains(attributeValue.toLowerCase())){
				  books.add(book);					
			  }
			}			
		}
		
		if (attribute.getClass().getName().contains(AuthorOfBook.
				class.getName()) ||  AuthorOfBook.class.getName().
				contains(attribute.getClass().getName())){
			for(Book book:Storage.getAllBooksFromLibrary()){
			  if(book.getAuthorOfBook().toString().toLowerCase().
					                   contains(attributeValue.toLowerCase())){
				  books.add(book);					
			  }
			}			
		}
		
		if (attribute.getClass().getName().contains(GenreOfBook.
				class.getName()) ||  GenreOfBook.class.getName().
				contains(attribute.getClass().getName())){
			for(Book book:Storage.getAllBooksFromLibrary()){
			  if(book.getGenreOfBook().toString().toLowerCase().
					                   contains(attributeValue.toLowerCase())){
				  books.add(book);					
			  }
			}			
		}
		
		if (attribute.getClass().getName().contains(PublishingOfficeOfBook.
				class.getName()) ||  PublishingOfficeOfBook.class.getName().
				contains(attribute.getClass().getName())){
			for(Book book:Storage.getAllBooksFromLibrary()){
			  if(book.getPublishingOfficeOfBook().toString().toLowerCase().
					                   contains(attributeValue.toLowerCase())){
				  books.add(book);					
			  }
			}			
		}
		
		if (attribute.getClass().getName().contains(LanguageOfPrintedProduction.
				class.getName()) ||  LanguageOfPrintedProduction.class.getName().
				contains(attribute.getClass().getName())){
			for(Book book:Storage.getAllBooksFromLibrary()){
			  if(book.getLanguageOfPrintedProduction().toString().toLowerCase().
					                    contains(attributeValue.toLowerCase())){
				  books.add(book);					
			  }
			}			
		}
		
		return books;
	}

	public static Set<Book> sortPrintedProductionByAttributes(
			Set<Book> printedProduction, Attribute attribute) {
		List<Book> sortedListOfBooks = new ArrayList<>(
				                            Storage.getAllBooksFromLibrary());
		Collections.sort(sortedListOfBooks, new Comparator<Book>(){
	            public int compare(Book o1, Book o2){
		                
		              if (attribute.getClass().getName().contains(
			            	NumberOfPrintedProductionInLibrary.class.getName()) ||  
		            		  NumberOfPrintedProductionInLibrary.class.getName().
			       			contains(attribute.getClass().getName())){
			         		   return o1.getNumberOfPrintedProductionInLibrary().
			         		   toString().compareTo(
			         		o2.getNumberOfPrintedProductionInLibrary().toString());
			          }
			         		
		            	 
		               if (attribute.getClass().getName().contains(
		            		   NameOfPrintedProduction.class.getName()) ||  
		            		   NameOfPrintedProduction.class.getName().
		       				contains(attribute.getClass().getName())){
		         		    return o1.getNameOfPrintedProduction().toString().
		         			compareTo(o2.getNameOfPrintedProduction().toString());
		         	   }
		         		
		         	   if (attribute.getClass().getName().contains(
		            		   AuthorOfBook.class.getName()) ||  
		            		   AuthorOfBook.class.getName().
		       				contains(attribute.getClass().getName())){
		         		    return o1.getAuthorOfBook().toString().
		    	         		compareTo(o2.getAuthorOfBook().toString());
		         	   }
		         		
		         		if (attribute.getClass().getName().contains(
			            		   GenreOfBook.class.getName()) ||  
			            		   GenreOfBook.class.getName().
			       				contains(attribute.getClass().getName())){
		         			return o1.getGenreOfBook().toString().
			    	         	compareTo(o2.getGenreOfBook().toString());		
		         		}
		         		
		         		if (attribute.getClass().getName().contains(
			            		   PublishingOfficeOfBook.class.getName()) ||  
			            		   PublishingOfficeOfBook.class.getName().
			       				contains(attribute.getClass().getName())){
		         		 return o1.getPublishingOfficeOfBook().toString().
				    	 compareTo(o2.getPublishingOfficeOfBook().toString());		
		         		}
		         		
		         		if (attribute.getClass().getName().contains(
			            		   LanguageOfPrintedProduction.class.getName()) ||  
			            		   LanguageOfPrintedProduction.class.getName().
			       				contains(attribute.getClass().getName())){
		         		 return o1.getLanguageOfPrintedProduction().toString().
		    	          compareTo(o2.getLanguageOfPrintedProduction().toString());		
		         		}
		            	 
		            	 return 100;
		             }
	       });
		
		return new LinkedHashSet<Book>(sortedListOfBooks);
		
	}

	@Override
	public String foundPrintedProductionToString(Collection<PrintedProduction> collection) {
		String temp = "";
	    for(PrintedProduction pp:collection){
	    temp += pp.toString();
		}
				
	    return temp;			
    }
		
}
