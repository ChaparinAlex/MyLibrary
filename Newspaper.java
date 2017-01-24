package com.mylibrary.printed_production;

import com.mylibrary.attributes.AnnotationToPrintedProduction;
import com.mylibrary.attributes.DateOfIssueOfPrintedProduction;
import com.mylibrary.attributes.GeneralIssueOfMassMedia;
import com.mylibrary.attributes.LanguageOfPrintedProduction;
import com.mylibrary.attributes.NameOfPrintedProduction;
import com.mylibrary.attributes.NumberOfIssueOfMassMedia;
import com.mylibrary.attributes.NumberOfPrintedProductionInLibrary;
import com.mylibrary.attributes.TextOfPrintedProduction;
import com.mylibrary.attributes.TypeOfPrintedProduction;
import com.mylibrary.storage.Storage;

public class Newspaper extends MassMedia{
	
	{
		type = TypeOfPrintedProduction.NEWSPAPER;
		numberOfPrintedProductionInLibrary = 
				new NumberOfPrintedProductionInLibrary(
						++Storage.quantityOfPrintedProductionInLibrary);
	}
	
	public Newspaper(NameOfPrintedProduction nameOfNewspaper, 
			DateOfIssueOfPrintedProduction dateOfIssueOfNewspaper,
			NumberOfIssueOfMassMedia numberOfIssueOfNewspaper,
			LanguageOfPrintedProduction languageOfNewspaper,
			GeneralIssueOfMassMedia generalIssueOfNewspaper, 
			AnnotationToPrintedProduction annotationToNewspaper, 
			TextOfPrintedProduction textOfNewspaper) {
		nameOfPrintedProduction = nameOfNewspaper;
		dateOfIssueOfPrintedProduction = dateOfIssueOfNewspaper;
		numberOfIssueOfMassMedia = numberOfIssueOfNewspaper;
		languageOfPrintedProduction = languageOfNewspaper;
		generalIssueOfMassMedia = generalIssueOfNewspaper;
		annotationToPrintedProduction = annotationToNewspaper;
		textOfPrintedProduction = textOfNewspaper;
	}
	
	@Override
	public String toString() {
		return "Number in library: " + numberOfPrintedProductionInLibrary + "\n"
	            + type + ":\nName: " + nameOfPrintedProduction + 
				"\nDate of issue: " + dateOfIssueOfPrintedProduction + 
				"\nNumber of issue: " + numberOfIssueOfMassMedia + 
				"\nLanguage: " + languageOfPrintedProduction 
			   + "\nGeneral issue: " + generalIssueOfMassMedia + 
			   "\nAnnotation to newspaper: " + 
	            annotationToPrintedProduction + "\n\n";
	}	

}
