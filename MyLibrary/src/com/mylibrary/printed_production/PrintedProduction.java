package com.mylibrary.printed_production;

import com.mylibrary.attributes.AnnotationToPrintedProduction;
import com.mylibrary.attributes.DateOfIssueOfPrintedProduction;
import com.mylibrary.attributes.LanguageOfPrintedProduction;
import com.mylibrary.attributes.NameOfPrintedProduction;
import com.mylibrary.attributes.NumberOfPrintedProductionInLibrary;
import com.mylibrary.attributes.TextOfPrintedProduction;
import com.mylibrary.attributes.TypeOfPrintedProduction;

public abstract class PrintedProduction {
	
	protected TypeOfPrintedProduction type;
	protected NameOfPrintedProduction nameOfPrintedProduction;
	protected DateOfIssueOfPrintedProduction dateOfIssueOfPrintedProduction;
	protected LanguageOfPrintedProduction languageOfPrintedProduction;
	protected AnnotationToPrintedProduction annotationToPrintedProduction;
	protected TextOfPrintedProduction textOfPrintedProduction;
	protected NumberOfPrintedProductionInLibrary 
	                                  numberOfPrintedProductionInLibrary;
	
	public NumberOfPrintedProductionInLibrary getNumberOfPrintedProductionInLibrary() {
		return numberOfPrintedProductionInLibrary;
	}
	public void setNumberOfPrintedProductionInLibrary(
			NumberOfPrintedProductionInLibrary numberOfPrintedProductionInLibrary) {
		this.numberOfPrintedProductionInLibrary = numberOfPrintedProductionInLibrary;
	}
	public TypeOfPrintedProduction getType() {
		return type;
	}
	public void setType(TypeOfPrintedProduction type) {
		this.type = type;
	}
	public NameOfPrintedProduction getNameOfPrintedProduction() {
		return nameOfPrintedProduction;
	}
	public void setNameOfPrintedProduction(NameOfPrintedProduction nameOfPrintedProduction) {
		this.nameOfPrintedProduction = nameOfPrintedProduction;
	}
	public DateOfIssueOfPrintedProduction getDateOfIssueOfPrintedProduction() {
		return dateOfIssueOfPrintedProduction;
	}
	public void setDateOfIssueOfPrintedProduction(DateOfIssueOfPrintedProduction dateOfIssueOfPrintedProduction) {
		this.dateOfIssueOfPrintedProduction = dateOfIssueOfPrintedProduction;
	}
	public LanguageOfPrintedProduction getLanguageOfPrintedProduction() {
		return languageOfPrintedProduction;
	}
	public void setLanguageOfPrintedProduction(LanguageOfPrintedProduction languageOfPrintedProduction) {
		this.languageOfPrintedProduction = languageOfPrintedProduction;
	}
	public AnnotationToPrintedProduction getAnnotationToPrintedProduction() {
		return annotationToPrintedProduction;
	}
	public void setAnnotationToPrintedProduction(AnnotationToPrintedProduction annotationToPrintedProduction) {
		this.annotationToPrintedProduction = annotationToPrintedProduction;
	}
	public TextOfPrintedProduction getTextOfPrintedProduction() {
		return textOfPrintedProduction;
	}
	public void setTextOfPrintedProduction(TextOfPrintedProduction textOfPrintedProduction) {
		this.textOfPrintedProduction = textOfPrintedProduction;
	}
	
	public abstract void toRead();
		
	
}
