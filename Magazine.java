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

public class Magazine extends MassMedia{
	
	{
		type = TypeOfPrintedProduction.MAGAZINE;
		numberOfPrintedProductionInLibrary = 
				new NumberOfPrintedProductionInLibrary(
						++Storage.quantityOfPrintedProductionInLibrary);
	}
	
	public Magazine(NameOfPrintedProduction nameOfMagazine, 
			DateOfIssueOfPrintedProduction dateOfIssueOfMagazine,
			NumberOfIssueOfMassMedia numberOfIssueOfMagazine,
			LanguageOfPrintedProduction languageOfMagazine,
			GeneralIssueOfMassMedia generalIssueOfMagazine,
			AnnotationToPrintedProduction annotationToMagazine, 
			TextOfPrintedProduction textOfMagazine) {
		nameOfPrintedProduction = nameOfMagazine;
		dateOfIssueOfPrintedProduction = dateOfIssueOfMagazine;
		numberOfIssueOfMassMedia = numberOfIssueOfMagazine;
		languageOfPrintedProduction = languageOfMagazine;
		generalIssueOfMassMedia = generalIssueOfMagazine;
		annotationToPrintedProduction = annotationToMagazine;
		textOfPrintedProduction = textOfMagazine;
	}
	
	@Override
	public String toString() {
		return "Number in library: " + numberOfPrintedProductionInLibrary + "\n"
	            + type + ":\nName: " + nameOfPrintedProduction + 
				"\nDate of issue: " + dateOfIssueOfPrintedProduction + 
				"\nNumber of issue: " + numberOfIssueOfMassMedia + "\nLanguage: "
				+ languageOfPrintedProduction + "\nGeneral issue: " + 
				generalIssueOfMassMedia +  "\nAnnotation to magazine: " + 
			    annotationToPrintedProduction + "\n\n";
	}	

}
