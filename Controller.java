package com.mylibrary.controller;

import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Scanner;
import java.util.Set;

import com.mylibrary.attributes.Attribute;
import com.mylibrary.attributes.AuthorOfBook;
import com.mylibrary.attributes.DateOfIssueOfPrintedProduction;
import com.mylibrary.attributes.GenreOfBook;
import com.mylibrary.attributes.LanguageOfPrintedProduction;
import com.mylibrary.attributes.NameOfPrintedProduction;
import com.mylibrary.attributes.NumberOfIssueOfMassMedia;
import com.mylibrary.attributes.PublishingOfficeOfBook;
import com.mylibrary.attributes.TypeOfPrintedProduction;
import com.mylibrary.menu.Menu;
import com.mylibrary.printed_production.PrintedProduction;
import com.mylibrary.service.BookServiceImpl;
import com.mylibrary.service.MagazineServiceImpl;
import com.mylibrary.service.NewspaperServiceImpl;
import com.mylibrary.storage.Storage;

public class Controller {
	
	public static void start(){
		Menu.showMainMenu();
		int chooseValue = -1;
		System.out.print("Please, choose your option: ");
		Scanner sc = new Scanner(System.in);
		while(true){
			if(sc.hasNextInt())
			chooseValue = sc.nextInt();
			if(chooseValue >= 0 && chooseValue <=3) break;
			else System.out.print("\nYou entered wrong data. Try again: ");
		}
		System.out.println();
		switch(chooseValue){
		  case 0: {
			         Menu.showAddingMenu();
			         addingController();
			         break;
		
		          }
		  case 1: {
			         Menu.showSeekingMenu();
			         seekingController();
			         break;
		          }
		  case 2: {
		             Menu.showMenuToSeeAllPrintedProduction();
		             displayingController();
		             break;
	              }
		  case 3: {
			         System.out.println("Library is closed. Good bye!");
			         System.exit(0);
		          }
		}
		sc.close();
	}
	
	public static void addingController(){
		int chooseValue = -1;
		System.out.print("Please, choose your option: ");
		Scanner sc = new Scanner(System.in);
		while(true){
			if(sc.hasNextInt())
			chooseValue = sc.nextInt();
			if(chooseValue >= 0 && chooseValue <= 4) break;
			else System.out.print("\nYou entered wrong data. Try again: ");
		}
		System.out.println();
		switch(chooseValue){
		  case 0: {
			         addPrintedProductionController(
			        		                     TypeOfPrintedProduction.BOOK);
			         break;		
		          }
		  case 1: { 
			         addPrintedProductionController(
			        		                TypeOfPrintedProduction.NEWSPAPER);
			         break;
		          }
		  case 2: {
			         addPrintedProductionController(
			        		                 TypeOfPrintedProduction.MAGAZINE);
		             break;
	              }
		  case 3: {
			         start();
			         break;
		          }
		  case 4: {
			         System.out.println("Library is closed. Good bye!");
		             System.exit(0);
		          }
		}
		sc.close();
    }
	
	public static void addPrintedProductionController(TypeOfPrintedProduction 
			                                                             type){
		
		if(type.name() == "BOOK") 
			new BookServiceImpl().addPrintedProductionToLibrary();
		if(type.name() == "NEWSPAPER") 
			new NewspaperServiceImpl().addPrintedProductionToLibrary();
		if(type.name() == "MAGAZINE") 
			new MagazineServiceImpl().addPrintedProductionToLibrary();
		System.out.println("Operation complete successfully!\n");
		Menu.showAfterAddingMenu();
		int chooseValue = -1;
		System.out.print("Please, choose your option: ");
		Scanner sc = new Scanner(System.in);
		while(true){
			if(sc.hasNextInt())
			chooseValue = sc.nextInt();
			if(chooseValue >= 0 && chooseValue <= 2) break;
			else System.out.print("\nYou entered wrong data. Try again: ");
		}
		System.out.println();
		switch(chooseValue){
		  case 0: {
			         Menu.showAddingMenu();
			         addingController();
			         break;		
		          }
		  case 1: {
			         start();
			         break;
		          }
		  case 2: {
			         System.out.println("Library is closed. Good bye!");
		             System.exit(0);
		          }
		 }
		sc.close();
	}
	
	public static void displayingController(){
		int chooseValue = -1;
		System.out.print("Please, choose your option: ");
		Scanner sc = new Scanner(System.in);
		while(true){
			if(sc.hasNextInt())
			chooseValue = sc.nextInt();
			if(chooseValue >= 0 && chooseValue <= 5) break;
			else System.out.print("\nYou entered wrong data. Try again: ");
		}
		System.out.println();
		switch(chooseValue){
		  case 0: {
			         showPrintedProductionController(
			        	                       TypeOfPrintedProduction.BOOK);
			         break;		
		          }
		  case 1: {
			         showPrintedProductionController(
			        		                 TypeOfPrintedProduction.NEWSPAPER);
			         break;
		          }
		  case 2: {
			         showPrintedProductionController(
			        		                 TypeOfPrintedProduction.MAGAZINE);
		             break;
	              }
		  case 3: {
			         System.out.println(Storage.toPrint(Storage.getStorage()));
				     showAllPrintedProductionController();
			         break;
		          }
		  case 4: {
			         start();
			         break;
		          }
		  case 5: {
			         System.out.println("Library is closed. Good bye!");
		             System.exit(0);
	              }
		}
		sc.close();
	}
	
	public static void showAllPrintedProductionController(){
		Menu.showMenuAfterDisplayingAllPrintedProduction();
		int chooseValue = -1;
		System.out.print("Please, choose your option: ");
		Scanner sc = new Scanner(System.in);
		while(true){
			if(sc.hasNextInt())
			chooseValue = sc.nextInt();
			if(chooseValue >= 0 && chooseValue <= 4) break;
			else System.out.print("\nYou entered wrong data. Try again: ");
		}
		System.out.println();
		switch(chooseValue){
		  case 0: {
	                readByNumberController();
                    break;	
                  }
		  case 1: {
	                removeByNumberController();
                    break;	
                  }
		  case 2: {
			         Menu.showMenuToSeeAllPrintedProduction();
	                 displayingController();
	                 break;	
		          }
		  case 3: {
			         start();
			         break;
		          }
		  case 4: {
			         System.out.println("Library is closed. Good bye!");
		             System.exit(0);
	              }
		 }
		sc.close();
	}
	
	public static void showAfterSearchingController(){
		Menu.showMenuAfterDisplayingAllPrintedProduction();
		int chooseValue = -1;
		System.out.print("Please, choose your option: ");
		Scanner sc = new Scanner(System.in);
		while(true){
			if(sc.hasNextInt())
			chooseValue = sc.nextInt();
			if(chooseValue >= 0 && chooseValue <= 4) break;
			else System.out.print("\nYou entered wrong data. Try again: ");
		}
		System.out.println();
		switch(chooseValue){
		  case 0: {
	                readByNumberController();
                    break;	
                  }
		  case 1: {
	                removeByNumberController();
                    break;	
                  }
		  case 2: {
			         Menu.showSeekingMenu();
			         seekingController();
	                 break;	
		          }
		  case 3: {
			         start();
			         break;
		          }
		  case 4: {
			         System.out.println("Library is closed. Good bye!");
		             System.exit(0);
	              }
		 }
		sc.close();
	}
	
	public static void seekingController(){
		int chooseValue = -1;
		System.out.print("Please, choose your option: ");
		Scanner sc = new Scanner(System.in);
		while(true){
			if(sc.hasNextInt())
			chooseValue = sc.nextInt();
			if(chooseValue >= 0 && chooseValue <= 4) break;
			else System.out.print("\nYou entered wrong data. Try again: ");
		}
		System.out.println();
		switch(chooseValue){
		  case 0: {
			         Menu.showSeekingOptionsForBook();
			         findPrintedProductionController(
			        		                     TypeOfPrintedProduction.BOOK);
			         break;		
		          }
		  case 1: { 
			         Menu.showSeekingOptionsForMassMedia();
			         findPrintedProductionController(
			        		                TypeOfPrintedProduction.NEWSPAPER);
			         break;
		          }
		  case 2: { 
			         Menu.showSeekingOptionsForMassMedia();
			         findPrintedProductionController(
			        		                 TypeOfPrintedProduction.MAGAZINE);
		             break;
	              }
		  case 3: {
			         start();
			         break;
		          }
		  case 4: {
			         System.out.println("Library is closed. Good bye!");
		             System.exit(0);
		          }
		}
		sc.close();
	}
	
	public static void findPrintedProductionController(TypeOfPrintedProduction 
                                                                        type){
		Scanner sc = new Scanner(System.in);
		
		if(type.name() == "BOOK"){
			int chooseValue = -1;
			BookServiceImpl bsiObject = new BookServiceImpl();
			System.out.print("Please, choose your option: ");
			while(true){
				if(sc.hasNextInt())
				chooseValue = sc.nextInt();
				if(chooseValue >= 0 && chooseValue <= 7) break;
				else System.out.print("\nYou entered wrong data. Try again: ");
			}
			System.out.println();
			switch(chooseValue){
			  case 0: {
				         String searchingResult = bsiObject.
				        		 foundPrintedProductionToString(
					        seekingProcedureByAttributes(TypeOfPrintedProduction.BOOK,
		        		              new NameOfPrintedProduction("")));
				         if(searchingResult.length() == 0){
				        	 System.out.println();
				        	 Menu.showAfterSearchingMenu();
				        	 afterSearchClosingController();
				         }else{
				        	 System.out.println(searchingResult);
				        	 showAfterSearchingController();				        	 
				         }
				         				   
				          break;		
			          }
			  case 1: { 
				          String searchingResult = bsiObject.
			        		 foundPrintedProductionToString(
				        seekingProcedureByAttributes(TypeOfPrintedProduction.BOOK,
				        		new AuthorOfBook("")));
			             if(searchingResult.length() == 0){
			        	    System.out.println();
			        	    Menu.showAfterSearchingMenu();
			        	    afterSearchClosingController();
			             }else{
			        	    System.out.println(searchingResult);
			        	    showAfterSearchingController();				        	 
			             }
				         break;	
			          }
			  case 2: { 
				           String searchingResult = bsiObject.
			        		 foundPrintedProductionToString(
				        seekingProcedureByAttributes(TypeOfPrintedProduction.BOOK,
				        		new GenreOfBook("")));
			             if(searchingResult.length() == 0){
			        	    System.out.println();
			        	    Menu.showAfterSearchingMenu();
			        	    afterSearchClosingController();
			             }else{
			        	    System.out.println(searchingResult);
			        	    showAfterSearchingController();				        	 
			             }
				         break;					        	
		              }
			  case 3: {
				          String searchingResult = bsiObject.
			        		 foundPrintedProductionToString(
				        seekingProcedureByAttributes(TypeOfPrintedProduction.BOOK,
				        		new PublishingOfficeOfBook("")));
			             if(searchingResult.length() == 0){
			        	    System.out.println();
			        	    Menu.showAfterSearchingMenu();
			        	    afterSearchClosingController();
			             }else{
			        	    System.out.println(searchingResult);
			        	    showAfterSearchingController();				        	 
			             }
				         break;					        	
			          }
			  case 4: {
				         String searchingResult = bsiObject.
			        		 foundPrintedProductionToString(
				        seekingProcedureByAttributes(TypeOfPrintedProduction.BOOK,
				        		new LanguageOfPrintedProduction("")));
			             if(searchingResult.length() == 0){
			        	    System.out.println();
			        	    Menu.showAfterSearchingMenu();
			        	    afterSearchClosingController();
			             }else{
			        	    System.out.println(searchingResult);
			        	    showAfterSearchingController();				        	 
			             }
				         break;			            	
		              }
			  case 5:
			          {
			        	 Menu.showSeekingMenu();
					     seekingController();
					     break;
			          }
			  case 6: {
				         start();
			             break;
			          }
				  
			  case 7: {
				         System.out.println("Library is closed. Good bye!");
			             System.exit(0);
			          }
			}
			
		}
                      
        if(type.name() == "NEWSPAPER"){ 
        	int chooseValue = -1;
		    NewspaperServiceImpl nsiObject = new NewspaperServiceImpl();
		    System.out.print("Please, choose your option: ");
		  while(true){
			if(sc.hasNextInt())
			chooseValue = sc.nextInt();
			if(chooseValue >= 0 && chooseValue <= 6) break;
			else System.out.print("\nYou entered wrong data. Try again: ");
		   }
		  System.out.println();
		  switch(chooseValue){
		  case 0: {
			         String searchingResult = nsiObject.
		        		 foundPrintedProductionToString(
			        seekingProcedureByAttributes(TypeOfPrintedProduction.NEWSPAPER,
     		              new NameOfPrintedProduction("")));
		         if(searchingResult.length() == 0){
		        	 System.out.println();
		        	 Menu.showAfterSearchingMenu();
		        	 afterSearchClosingController();
		         }else{
		        	 System.out.println(searchingResult);
		        	 showAfterSearchingController();				        	 
		         }		         				   
		          break;			         		
		          }
		  case 1: { 
			          String searchingResult = nsiObject.
		        		 foundPrintedProductionToString(
			        seekingProcedureByAttributes(TypeOfPrintedProduction.NEWSPAPER,
			        		new DateOfIssueOfPrintedProduction("0/0/0")));
		         if(searchingResult.length() == 0){
		        	 System.out.println();
		        	 Menu.showAfterSearchingMenu();
		        	 afterSearchClosingController();
		         }else{
		        	 System.out.println(searchingResult);
		        	 showAfterSearchingController();				        	 
		         }		         				   
		          break;			        	
		          }
		  case 2: { 
			         String searchingResult = nsiObject.
		        		 foundPrintedProductionToString(
			        seekingProcedureByAttributes(TypeOfPrintedProduction.NEWSPAPER,
			        		new NumberOfIssueOfMassMedia(0)));
		         if(searchingResult.length() == 0){
		        	 System.out.println();
		        	 Menu.showAfterSearchingMenu();
		        	 afterSearchClosingController();
		         }else{
		        	 System.out.println(searchingResult);
		        	 showAfterSearchingController();				        	 
		         }		         				   
		          break;			        	
	              }
		  case 3: {
			         String searchingResult = nsiObject.
		        		 foundPrintedProductionToString(
			        seekingProcedureByAttributes(TypeOfPrintedProduction.NEWSPAPER,
			        		new LanguageOfPrintedProduction("")));
		         if(searchingResult.length() == 0){
		        	 System.out.println();
		        	 Menu.showAfterSearchingMenu();
		        	 afterSearchClosingController();
		         }else{
		        	 System.out.println(searchingResult);
		        	 showAfterSearchingController();				        	 
		         }		         				   
		          break;		            	
	              }
		  case 4:
		          {
		        	 Menu.showSeekingMenu();
				     seekingController();
				     break;
		          }
		  case 5: {
			         start();
		             break;
		          }
			  
		  case 6: {
			         System.out.println("Library is closed. Good bye!");
		             System.exit(0);
		          }
		  }
        }
        
        if(type.name() == "MAGAZINE"){ 
        	int chooseValue = -1;
		    MagazineServiceImpl msiObject = new MagazineServiceImpl();
		    System.out.print("Please, choose your option: ");
		  while(true){
			if(sc.hasNextInt())
			chooseValue = sc.nextInt();
			if(chooseValue >= 0 && chooseValue <= 6) break;
			else System.out.print("\nYou entered wrong data. Try again: ");
		   }
		  System.out.println();
		  switch(chooseValue){
		  case 0: {
			        String searchingResult = msiObject.
		        		 foundPrintedProductionToString(
			        seekingProcedureByAttributes(TypeOfPrintedProduction.MAGAZINE,
  		              new NameOfPrintedProduction("")));
		         if(searchingResult.length() == 0){
		        	 System.out.println();
		        	 Menu.showAfterSearchingMenu();
		        	 afterSearchClosingController();
		         }else{
		        	 System.out.println(searchingResult);
		        	 showAfterSearchingController();				        	 
		         }		         				   
		          break;			         		
		          }
		  case 1: { 
			        String searchingResult = msiObject.
		        		 foundPrintedProductionToString(
			        seekingProcedureByAttributes(TypeOfPrintedProduction.MAGAZINE,
			        		new DateOfIssueOfPrintedProduction("0/0/0")));
		         if(searchingResult.length() == 0){
		        	 System.out.println();
		        	 Menu.showAfterSearchingMenu();
		        	 afterSearchClosingController();
		         }else{
		        	 System.out.println(searchingResult);
		        	 showAfterSearchingController();				        	 
		         }		         				   
		          break;			        	
		          }
		  case 2: { 
			         String searchingResult = msiObject.
		        		 foundPrintedProductionToString(
			        seekingProcedureByAttributes(TypeOfPrintedProduction.MAGAZINE,
			        		new NumberOfIssueOfMassMedia(0)));
		         if(searchingResult.length() == 0){
		        	 System.out.println();
		        	 Menu.showAfterSearchingMenu();
		        	 afterSearchClosingController();
		         }else{
		        	 System.out.println(searchingResult);
		        	 showAfterSearchingController();				        	 
		         }		         				   
		          break;			        	
	              }
		  case 3: {
			         String searchingResult = msiObject.
		        		 foundPrintedProductionToString(
			        seekingProcedureByAttributes(TypeOfPrintedProduction.MAGAZINE,
			        		new LanguageOfPrintedProduction("")));
		         if(searchingResult.length() == 0){
		        	 System.out.println();
		        	 Menu.showAfterSearchingMenu();
		        	 afterSearchClosingController();
		         }else{
		        	 System.out.println(searchingResult);
		        	 showAfterSearchingController();				        	 
		         }		         				   
		          break;		            	
	              }
		  case 4:
		          {
		        	 Menu.showSeekingMenu();
				     seekingController();
				     break;
		          }
		  case 5: {
			         start();
		             break;
		          }
			  
		  case 6: {
			         System.out.println("Library is closed. Good bye!");
		             System.exit(0);
		          }
		  }
        }
        
        sc.close();
    }
	
	public static Set<PrintedProduction> seekingProcedureByAttributes(
			               TypeOfPrintedProduction type, Attribute attribute){
		Set<PrintedProduction> foundPP = new LinkedHashSet<>();
		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);
		if(type.name() == "BOOK"){
			if (attribute.getClass().getName().contains(NameOfPrintedProduction.
					class.getName()) ||  NameOfPrintedProduction.class.getName().
					contains(attribute.getClass().getName())){
				System.out.print("Please, enter a name of a book: ");
				String tempName;
				while(true){
					if(sc.hasNextLine()){
						tempName = sc.nextLine();
						break;
					}
					else System.out.print("\nYou entered wrong data. Try again: ");
				}
				System.out.println("\nSearching results:\n");
			 foundPP = new BookServiceImpl().findPrintedProductionByAttributes(
					                                      attribute, tempName);			 
			}
			if (attribute.getClass().getName().contains(AuthorOfBook.
					class.getName()) ||  AuthorOfBook.class.getName().
					contains(attribute.getClass().getName())){
				System.out.print("Please, enter an author of a book: ");
				String tempAuthor;
				while(true){
					if(sc.hasNextLine()){
						tempAuthor = sc.nextLine();
						break;
					}
					else System.out.print("\nYou entered wrong data. Try again: ");
				}
				System.out.println("\nSearching results:\n");
			 foundPP = new BookServiceImpl().findPrintedProductionByAttributes(
					                                      attribute, tempAuthor);			 
			}
			if (attribute.getClass().getName().contains(GenreOfBook.
					class.getName()) ||  GenreOfBook.class.getName().
					contains(attribute.getClass().getName())){
				System.out.print("Please, enter a genre of a book: ");
				String tempGenre;
				while(true){
					if(sc.hasNextLine()){
						tempGenre = sc.nextLine();
						break;
					}
					else System.out.print("\nYou entered wrong data. Try again: ");
				}
				System.out.println("\nSearching results:\n");
			 foundPP = new BookServiceImpl().findPrintedProductionByAttributes(
					                                      attribute, tempGenre);			 
			}
			if (attribute.getClass().getName().contains(PublishingOfficeOfBook.
					class.getName()) ||  PublishingOfficeOfBook.class.getName().
					contains(attribute.getClass().getName())){
				System.out.print("Please, enter a publishing office of a book: ");
				String tempPublOffice;
				while(true){
					if(sc.hasNextLine()){
						tempPublOffice = sc.nextLine();
						break;
					}
					else System.out.print("\nYou entered wrong data. Try again: ");
				}
				System.out.println("\nSearching results:\n");
			 foundPP = new BookServiceImpl().findPrintedProductionByAttributes(
					                                 attribute, tempPublOffice);			 
			}
			if (attribute.getClass().getName().contains(LanguageOfPrintedProduction.
					class.getName()) ||  LanguageOfPrintedProduction.class.getName().
					contains(attribute.getClass().getName())){
				System.out.print("Please, enter a language of a book: ");
				String tempLanguage;
				while(true){
					if(sc.hasNextLine()){
						tempLanguage = sc.nextLine();
						break;
					}
					else System.out.print("\nYou entered wrong data. Try again: ");
				}
				System.out.println("\nSearching results:\n");
			 foundPP = new BookServiceImpl().findPrintedProductionByAttributes(
					                                 attribute, tempLanguage);			 
			}
			
		}
		
		if(type.name() == "NEWSPAPER"){
			if (attribute.getClass().getName().contains(NameOfPrintedProduction.
					class.getName()) ||  NameOfPrintedProduction.class.getName().
					contains(attribute.getClass().getName())){
				System.out.print("Please, enter a name of a newspaper: ");
				String tempName;
				while(true){
					if(sc.hasNextLine()){
						tempName = sc.nextLine();
						break;
					}
					else System.out.print("\nYou entered wrong data. Try again: ");
				}
				System.out.println("\nSearching results:\n");
			 foundPP = new NewspaperServiceImpl().findPrintedProductionByAttributes(
					                                      attribute, tempName);			 
			}
			if (attribute.getClass().getName().contains(DateOfIssueOfPrintedProduction.
					class.getName()) ||  DateOfIssueOfPrintedProduction.class.getName().
					contains(attribute.getClass().getName())){
				System.out.print("Please, enter a date of issue of a newspaper: ");
				String tempDateOfIssue;
				while(true){
					if(sc.hasNextLine()){
						tempDateOfIssue = sc.nextLine();
						break;
					}
					else System.out.print("\nYou entered wrong data. Try again: ");
				}
				System.out.println("\nSearching results:\n");
			 foundPP = new NewspaperServiceImpl().findPrintedProductionByAttributes(
					                                      attribute, tempDateOfIssue);			 
			}
			if (attribute.getClass().getName().contains(NumberOfIssueOfMassMedia.
					class.getName()) ||  NumberOfIssueOfMassMedia.class.getName().
					contains(attribute.getClass().getName())){
				System.out.print("Please, enter a number of issue of a newspaper: ");
				String tempNumOfIssue;
				while(true){
					if(sc.hasNextLine()){
						tempNumOfIssue = sc.nextLine();
						break;
					}
					else System.out.print("\nYou entered wrong data. Try again: ");
				}
				System.out.println("\nSearching results:\n");
			 foundPP = new NewspaperServiceImpl().findPrintedProductionByAttributes(
					                                      attribute, tempNumOfIssue);			 
			}
			if (attribute.getClass().getName().contains(LanguageOfPrintedProduction.
					class.getName()) ||  LanguageOfPrintedProduction.class.getName().
					contains(attribute.getClass().getName())){
				System.out.print("Please, enter a language of a newspaper: ");
				String tempLanguage;
				while(true){
					if(sc.hasNextLine()){
						tempLanguage = sc.nextLine();
						break;
					}
					else System.out.print("\nYou entered wrong data. Try again: ");
				}
				System.out.println("\nSearching results:\n");
			 foundPP = new NewspaperServiceImpl().findPrintedProductionByAttributes(
					                                 attribute, tempLanguage);			 
			}
			
		}
		
		if(type.name() == "MAGAZINE"){
			if (attribute.getClass().getName().contains(NameOfPrintedProduction.
					class.getName()) ||  NameOfPrintedProduction.class.getName().
					contains(attribute.getClass().getName())){
				System.out.print("Please, enter a name of a magazine: ");
				String tempName;
				while(true){
					if(sc.hasNextLine()){
						tempName = sc.nextLine();
						break;
					}
					else System.out.print("\nYou entered wrong data. Try again: ");
				}
				System.out.println("\nSearching results:\n");
			 foundPP = new MagazineServiceImpl().findPrintedProductionByAttributes(
					                                      attribute, tempName);			 
			}
			if (attribute.getClass().getName().contains(DateOfIssueOfPrintedProduction.
					class.getName()) ||  DateOfIssueOfPrintedProduction.class.getName().
					contains(attribute.getClass().getName())){
				System.out.print("Please, enter a date of issue of a magazine: ");
				String tempDateOfIssue;
				while(true){
					if(sc.hasNextLine()){
						tempDateOfIssue = sc.nextLine();
						break;
					}
					else System.out.print("\nYou entered wrong data. Try again: ");
				}
				System.out.println("\nSearching results:\n");
			 foundPP = new MagazineServiceImpl().findPrintedProductionByAttributes(
					                                      attribute, tempDateOfIssue);			 
			}
			if (attribute.getClass().getName().contains(NumberOfIssueOfMassMedia.
					class.getName()) ||  NumberOfIssueOfMassMedia.class.getName().
					contains(attribute.getClass().getName())){
				System.out.print("Please, enter a number of issue of a magazine: ");
				String tempNumOfIssue;
				while(true){
					if(sc.hasNextLine()){
						tempNumOfIssue = sc.nextLine();
						break;
					}
					else System.out.print("\nYou entered wrong data. Try again: ");
				}
				System.out.println("\nSearching results:\n");
			 foundPP = new MagazineServiceImpl().findPrintedProductionByAttributes(
					                                      attribute, tempNumOfIssue);			 
			}
			if (attribute.getClass().getName().contains(LanguageOfPrintedProduction.
					class.getName()) ||  LanguageOfPrintedProduction.class.getName().
					contains(attribute.getClass().getName())){
				System.out.print("Please, enter a language of a magazine: ");
				String tempLanguage;
				while(true){
					if(sc.hasNextLine()){
						tempLanguage = sc.nextLine();
						break;
					}
					else System.out.print("\nYou entered wrong data. Try again: ");
				}
				System.out.println("\nSearching results:\n");
			 foundPP = new MagazineServiceImpl().findPrintedProductionByAttributes(
					                                 attribute, tempLanguage);			 
			}
			
		}
		if(foundPP.size() == 0)
			System.out.println("Nothing is found. Try again");
		return foundPP;
	}
	
	public static void readByNumberController(){
		System.out.print("Please, enter a number of printed production in "
				+ "library for reading: ");
		int numberOfPrintedProductionForReading = -1;
		Scanner sc = new Scanner(System.in);
		while(true){
			if(sc.hasNextInt())
			numberOfPrintedProductionForReading = sc.nextInt();
			if(numberOfPrintedProductionForReading >= 1 && 
			 numberOfPrintedProductionForReading <= Storage.getStorage().size())
				break;
			else System.out.print("\nYou entered wrong data. Try again: ");
		}
		System.out.println();
		List<PrintedProduction> tempList = new ArrayList<>(Storage.getStorage());
		if(tempList.get(numberOfPrintedProductionForReading - 1).getClass().
                                                   getName().contains("Book")){
            BookServiceImpl bsiObject = new BookServiceImpl();
            bsiObject.readPrintedProduction(tempList.
            get(numberOfPrintedProductionForReading - 1));
		}
		if(tempList.get(numberOfPrintedProductionForReading - 1).getClass().
				                              getName().contains("Newspaper")){
			NewspaperServiceImpl nsiObject = new NewspaperServiceImpl();
			nsiObject.readPrintedProduction(tempList.
					             get(numberOfPrintedProductionForReading - 1));
		}
		if(tempList.get(numberOfPrintedProductionForReading - 1).getClass().
                                               getName().contains("Magazine")){
            MagazineServiceImpl msiObject = new MagazineServiceImpl();
            msiObject.readPrintedProduction(tempList.
            get(numberOfPrintedProductionForReading - 1));
		}
		System.out.println();
		Menu.showClosingMenu();
		int chooseValue = -1;
		System.out.print("Please, choose your option: ");
		while(true){
			if(sc.hasNextInt())
			chooseValue = sc.nextInt();
			if(chooseValue >= 0 && chooseValue <= 1) break;
			else System.out.print("\nYou entered wrong data. Try again: ");
		}
		System.out.println();
		switch(chooseValue){
		  case 0: {
			         start();
			         break;
		          }
		  case 1: {
			         System.out.println("Library is closed. Good bye!");
		             System.exit(0);
		          }
		 }
		sc.close();
	}
	
	public static void afterSearchClosingController(){
		int chooseValue = -1;
		Scanner sc = new Scanner(System.in);
		System.out.print("Please, choose your option: ");
		while(true){
			if(sc.hasNextInt())
			chooseValue = sc.nextInt();
			if(chooseValue >= 0 && chooseValue <= 2) break;
			else System.out.print("\nYou entered wrong data. Try again: ");
		}
		System.out.println();
		switch(chooseValue){
		  case 0: {
			         Menu.showSeekingMenu();
			         seekingController();
			         break;		
		          }
		  case 1: {
			         start();
			         break;
		          }
		  case 2: {
			         System.out.println("Library is closed. Good bye!");
		             System.exit(0);
		          }
		 }
		sc.close();
	}
	
	public static void removeByNumberController(){
		System.out.print("Please, enter a number of printed production in "
				+ "library for removing: ");
		int numberOfPrintedProductionForRemoving = -1;
		Scanner sc = new Scanner(System.in);
		while(true){
			if(sc.hasNextInt())
				numberOfPrintedProductionForRemoving = sc.nextInt();
			if(numberOfPrintedProductionForRemoving >= 1 && 
			 numberOfPrintedProductionForRemoving <= 
			             Storage.getStorage().size()) break;
			else System.out.print("\nYou entered wrong data. Try again: ");
		}
		System.out.println();
		List<PrintedProduction> tempList = new ArrayList<>(Storage.getStorage());
		if(tempList.get(numberOfPrintedProductionForRemoving - 1).getClass().
                                                   getName().contains("Book")){
            BookServiceImpl bsiObject = new BookServiceImpl();
            bsiObject.removePrintedProductionFromLibrary(tempList.
            get(numberOfPrintedProductionForRemoving - 1));
		}
		if(tempList.get(numberOfPrintedProductionForRemoving - 1).getClass().
				                              getName().contains("Newspaper")){
			NewspaperServiceImpl nsiObject = new NewspaperServiceImpl();
			nsiObject.removePrintedProductionFromLibrary(tempList.
					             get(numberOfPrintedProductionForRemoving - 1));
		}
		if(tempList.get(numberOfPrintedProductionForRemoving - 1).getClass().
                                               getName().contains("Magazine")){
            MagazineServiceImpl msiObject = new MagazineServiceImpl();
            msiObject.removePrintedProductionFromLibrary(tempList.
            get(numberOfPrintedProductionForRemoving - 1));
		}
		System.out.println();
		System.out.println("Operation complete successfully!\n");		
		Menu.showClosingMenu();
		int chooseValue = -1;
		System.out.print("Please, choose your option: ");
		while(true){
			if(sc.hasNextInt())
			chooseValue = sc.nextInt();
			if(chooseValue >= 0 && chooseValue <= 1) break;
			else System.out.print("\nYou entered wrong data. Try again: ");
		}
		System.out.println();
		switch(chooseValue){
		 case 0: {
			         start();
			         break;
		          }
		  case 1: {
			         System.out.println("Library is closed. Good bye!");
		             System.exit(0);
		          }
		 }
		sc.close();
	}
	
	public static void showPrintedProductionController(TypeOfPrintedProduction 
			                                                             type){
		if(type.name() == "BOOK"){
			System.out.println(Storage.toPrint(Storage.getAllBooksFromLibrary()));
			Menu.showDisplayingOptionsForBooks();
			int chooseValue = -1;
			System.out.print("Please, choose your option: ");
			Scanner sc = new Scanner(System.in);
			while(true){
				if(sc.hasNextInt())
				chooseValue = sc.nextInt();
				if(chooseValue >= 0 && chooseValue <= 7) break;
				else System.out.print("\nYou entered wrong data. Try again: ");
			}
			System.out.println(); 
			switch(chooseValue){
			  case 0: {
				         System.out.println(Storage.toPrint(BookServiceImpl.
				                 sortPrintedProductionByAttributes(
				        			Storage.getAllBooksFromLibrary(),
				        		   new NameOfPrintedProduction(""))));
	                     break;	
	                  }
			  case 1: {
				         System.out.println(Storage.toPrint(BookServiceImpl.
			                 sortPrintedProductionByAttributes(
			        			Storage.getAllBooksFromLibrary(),
			        		         new AuthorOfBook(""))));
                         break;
	                  }
			  case 2: {
				         System.out.println(Storage.toPrint(BookServiceImpl.
			                 sortPrintedProductionByAttributes(
			        			Storage.getAllBooksFromLibrary(),
			        		         new GenreOfBook(""))));
                         break;	
			          }
			  case 3: {
				         System.out.println(Storage.toPrint(BookServiceImpl.
			                 sortPrintedProductionByAttributes(
			        			Storage.getAllBooksFromLibrary(),
			        		       new PublishingOfficeOfBook(""))));
                         break;
			          }
			  case 4: {
				         System.out.println(Storage.toPrint(BookServiceImpl.
			                 sortPrintedProductionByAttributes(
			        			Storage.getAllBooksFromLibrary(),
			        		   new LanguageOfPrintedProduction(""))));
                         break;
		              }
			  case 5: {
				         Menu.showMenuToSeeAllPrintedProduction();
                         displayingController();
			             break;
		              }
			  case 6: {
			             start();
		                 break;
	                  }
			  case 7: {
				         System.out.println("Library is closed. Good bye!");
			             System.exit(0);
		              }
			 }
			showAllPrintedProductionController();
			sc.close();
		}
		
		if(type.name() == "NEWSPAPER"){
			System.out.println(Storage.toPrint(
					                   Storage.getAllNewspapersFromLibrary()));
			Menu.showDisplayingOptionsForMassMedia();
			int chooseValue = -1;
			System.out.print("Please, choose your option: ");
			Scanner sc = new Scanner(System.in);
			while(true){
				if(sc.hasNextInt())
				chooseValue = sc.nextInt();
				if(chooseValue >= 0 && chooseValue <= 6) break;
				else System.out.print("\nYou entered wrong data. Try again: ");
			}
			System.out.println();
			switch(chooseValue){
			  case 0: {
				          System.out.println(Storage.toPrint(NewspaperServiceImpl.
			                 sortPrintedProductionByAttributes(
			        			Storage.getAllNewspapersFromLibrary(),
			        		       new NameOfPrintedProduction(""))));
                          break;		
	                  }
			  case 1: {
				          System.out.println(Storage.toPrint(NewspaperServiceImpl.
			                 sortPrintedProductionByAttributes(
			        			Storage.getAllNewspapersFromLibrary(),
			        		new DateOfIssueOfPrintedProduction("0/0/0"))));
                          break;			
	                  }
			  case 2: {
				          System.out.println(Storage.toPrint(NewspaperServiceImpl.
			                 sortPrintedProductionByAttributes(
			        			Storage.getAllNewspapersFromLibrary(),
			        		      new NumberOfIssueOfMassMedia(0))));
                          break;	
			          }
			  case 3: {
				          System.out.println(Storage.toPrint(NewspaperServiceImpl.
			                 sortPrintedProductionByAttributes(
			        			Storage.getAllNewspapersFromLibrary(),
			        		   new LanguageOfPrintedProduction(""))));
                          break;	
		              }
			  case 4: {
				         Menu.showMenuToSeeAllPrintedProduction();
                         displayingController();
			             break;
		              }
			  case 5: {
			             start();
		                 break;
	                  }
			  case 6: {
				         System.out.println("Library is closed. Good bye!");
			             System.exit(0);
		              }
			 }
			showAllPrintedProductionController();
			sc.close();
		}
		
		if(type.name() == "MAGAZINE"){
			System.out.println(Storage.toPrint(
					                    Storage.getAllMagazinesFromLibrary()));
			Menu.showDisplayingOptionsForMassMedia();
			int chooseValue = -1;
			System.out.print("Please, choose your option: ");
			Scanner sc = new Scanner(System.in);
			while(true){
				if(sc.hasNextInt())
				chooseValue = sc.nextInt();
				if(chooseValue >= 0 && chooseValue <= 6) break;
				else System.out.print("\nYou entered wrong data. Try again: ");
			}
			System.out.println();
			switch(chooseValue){
			  case 0: {
				         System.out.println(Storage.toPrint(MagazineServiceImpl.
			                 sortPrintedProductionByAttributes(
			        			Storage.getAllMagazinesFromLibrary(),
			        		       new NameOfPrintedProduction(""))));
                         break;			
	                  }
			  case 1: {
				         System.out.println(Storage.toPrint(MagazineServiceImpl.
			                 sortPrintedProductionByAttributes(
			        			Storage.getAllMagazinesFromLibrary(),
			        		new DateOfIssueOfPrintedProduction("0/0/0"))));
                         break;		
	                  }
			  case 2: {
				         System.out.println(Storage.toPrint(MagazineServiceImpl.
			                 sortPrintedProductionByAttributes(
			        			Storage.getAllMagazinesFromLibrary(),
			        		       new NumberOfIssueOfMassMedia(0))));
                         break;		
			          }
			  case 3: {
				         System.out.println(Storage.toPrint(MagazineServiceImpl.
			                 sortPrintedProductionByAttributes(
			        			Storage.getAllMagazinesFromLibrary(),
			        		   new LanguageOfPrintedProduction(""))));
                         break;	
		              }
			  case 4: {
				         Menu.showMenuToSeeAllPrintedProduction();
                         displayingController();
			             break;
		              }
			  case 5: {
			             start();
		                 break;
	                  }
			  case 6: {
				         System.out.println("Library is closed. Good bye!");
			             System.exit(0);
		              }
			 }
			showAllPrintedProductionController();
			sc.close();
		}
		
	}
	
}
