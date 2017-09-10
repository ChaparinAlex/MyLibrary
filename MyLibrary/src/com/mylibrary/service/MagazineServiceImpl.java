package com.mylibrary.service;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Scanner;
import java.util.Set;
import com.mylibrary.attributes.AnnotationToPrintedProduction;
import com.mylibrary.attributes.Attribute;
import com.mylibrary.attributes.DateOfIssueOfPrintedProduction;
import com.mylibrary.attributes.GeneralIssueOfMassMedia;
import com.mylibrary.attributes.LanguageOfPrintedProduction;
import com.mylibrary.attributes.NameOfPrintedProduction;
import com.mylibrary.attributes.NumberOfIssueOfMassMedia;
import com.mylibrary.attributes.NumberOfPrintedProductionInLibrary;
import com.mylibrary.attributes.TextOfPrintedProduction;
import com.mylibrary.attributes.TypeOfPrintedProduction;
import com.mylibrary.printed_production.Magazine;
import com.mylibrary.printed_production.PrintedProduction;
import com.mylibrary.storage.Storage;

public class MagazineServiceImpl extends MassMediaServiceImpl{

	@Override
	public void addPrintedProductionToLibrary() {
		String tempName, tempDateOfIssue, tempLanguage, tempAnnotation, 
		       tempText;
		int tempGeneralIssue, tempNumberOfIssue;
		
		@SuppressWarnings("resource")
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("Please, input name of magazine: ");
		tempName = scanner.nextLine();
		System.out.println();
		System.out.print("Please, input date of issue of magazine (dd/mm/yyyy): ");
		tempDateOfIssue = scanner.nextLine();
		System.out.println();
		System.out.print("Please, input number of issue of magazine: ");
		tempNumberOfIssue = scanner.nextInt();
		scanner.nextLine();
		System.out.println();
		System.out.print("Please, input language of magazine: ");
		tempLanguage = scanner.nextLine();
		System.out.println();
		System.out.print("Please, input general issue of magazine: ");
		tempGeneralIssue = scanner.nextInt();
		scanner.nextLine();
		System.out.println();		
		System.out.print("Please, input annotation to magazine: ");
		tempAnnotation = scanner.nextLine();
		System.out.println();
		System.out.print("Please, input text of magazine: ");
		tempText = scanner.nextLine();
		System.out.println();
		Storage.getStorage().add(
			   new Magazine(new NameOfPrintedProduction(tempName), 
						new DateOfIssueOfPrintedProduction(tempDateOfIssue),
				        new NumberOfIssueOfMassMedia(tempNumberOfIssue), 
				        new LanguageOfPrintedProduction(tempLanguage),
				        new GeneralIssueOfMassMedia(tempGeneralIssue), 
				        new AnnotationToPrintedProduction(tempAnnotation), 
				        new TextOfPrintedProduction(tempText)
				        ));
		
	}
	
	public static Set<Magazine> sortPrintedProductionByAttributes(
			Set<Magazine> printedProduction, Attribute attribute) {
		List<Magazine> sortedListOfMagazines = new ArrayList<>(
                Storage.getAllMagazinesFromLibrary());
		Collections.sort(sortedListOfMagazines, new Comparator<Magazine>(){
	             public int compare(Magazine o1, Magazine o2){
	            	 
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
	            		   DateOfIssueOfPrintedProduction.class.getName()) ||  
	            		   DateOfIssueOfPrintedProduction.class.getName().
	       				contains(attribute.getClass().getName())){
	         		    return o1.getDateOfIssueOfPrintedProduction().
	         		    	toString().compareTo(o2.
	         		    		getDateOfIssueOfPrintedProduction().toString());
	         	   }
	         		
	         		if (attribute.getClass().getName().contains(
		            		   NumberOfIssueOfMassMedia.class.getName()) ||  
		            		   NumberOfIssueOfMassMedia.class.getName().
		       				contains(attribute.getClass().getName())){
	         			return o1.getNumberOfIssueOfMassMedia().
	         		               toString().compareTo(o2.
	         		            getNumberOfIssueOfMassMedia().toString());		
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
		return new LinkedHashSet<Magazine>(sortedListOfMagazines);
		
	}
	
	@Override
	public Set<PrintedProduction> findPrintedProductionByAttributes(Attribute 
			attribute, String attributeValue) {
		Set<PrintedProduction> magazines = new LinkedHashSet<>();
		
		if (attribute.getClass().getName().contains(
				NumberOfPrintedProductionInLibrary.class.getName()) ||  
				NumberOfPrintedProductionInLibrary.class.getName().
				contains(attribute.getClass().getName())){
			for(Magazine magazine:Storage.getAllMagazinesFromLibrary()){
			  if(magazine.getNumberOfPrintedProductionInLibrary().toString().
					                                    equals(attributeValue)){
				  magazines.add(magazine);					
			  }
			}			
		}
		
		if (attribute.getClass().getName().contains(TypeOfPrintedProduction.
				class.getName()) ||  TypeOfPrintedProduction.class.getName().
				contains(attribute.getClass().getName())){
			for(Magazine magazine:Storage.getAllMagazinesFromLibrary()){
			  if(magazine.getType().toString().equalsIgnoreCase(attributeValue)){
				  magazines.add(magazine);					
			  }
			}			
		}
		
		if (attribute.getClass().getName().contains(NameOfPrintedProduction.
				class.getName()) ||  NameOfPrintedProduction.class.getName().
				contains(attribute.getClass().getName())){
			for(Magazine magazine:Storage.getAllMagazinesFromLibrary()){
			  if(magazine.getNameOfPrintedProduction().toString().toLowerCase().
					                   contains(attributeValue.toLowerCase())){
				  magazines.add(magazine);					
			  }
			}			
		}
		
		if (attribute.getClass().getName().contains(
				DateOfIssueOfPrintedProduction.class.getName()) ||  
				DateOfIssueOfPrintedProduction.class.getName().
				contains(attribute.getClass().getName())){
			for(Magazine magazine:Storage.getAllMagazinesFromLibrary()){
			  if(magazine.getDateOfIssueOfPrintedProduction().toString().
					                                   equals(attributeValue)){
				  magazines.add(magazine);					
			  }
			}			
		}
		
		if (attribute.getClass().getName().contains(NumberOfIssueOfMassMedia.
				class.getName()) ||  NumberOfIssueOfMassMedia.class.getName().
				contains(attribute.getClass().getName())){
			for(Magazine magazine:Storage.getAllMagazinesFromLibrary()){
			  if(magazine.getNumberOfIssueOfMassMedia().toString().
					                                   equals(attributeValue)){
				  magazines.add(magazine);					
			  }
			}			
		}
		
		if (attribute.getClass().getName().contains(LanguageOfPrintedProduction.
				class.getName()) ||  LanguageOfPrintedProduction.class.getName().
				contains(attribute.getClass().getName())){
			for(Magazine magazine:Storage.getAllMagazinesFromLibrary()){
			  if(magazine.getLanguageOfPrintedProduction().toString().
					      toLowerCase().contains(attributeValue.toLowerCase())){
				  magazines.add(magazine);					
			  }
			}			
		}
		
		return magazines;
	}	

}
