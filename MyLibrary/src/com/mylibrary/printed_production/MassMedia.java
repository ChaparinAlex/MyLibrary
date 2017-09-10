package com.mylibrary.printed_production;

import com.mylibrary.attributes.GeneralIssueOfMassMedia;
import com.mylibrary.attributes.NumberOfIssueOfMassMedia;

public abstract class MassMedia extends PrintedProduction{
	
	protected NumberOfIssueOfMassMedia numberOfIssueOfMassMedia;
	protected GeneralIssueOfMassMedia generalIssueOfMassMedia;
	
	public NumberOfIssueOfMassMedia getNumberOfIssueOfMassMedia() {
		return numberOfIssueOfMassMedia;
	}
	public void setNumberOfIssueOfMassMedia(NumberOfIssueOfMassMedia numberOfIssueOfMassMedia) {
		this.numberOfIssueOfMassMedia = numberOfIssueOfMassMedia;
	}
	public GeneralIssueOfMassMedia getGeneralIssueOfMassMedia() {
		return generalIssueOfMassMedia;
	}
	public void setGeneralIssueOfMassMedia(GeneralIssueOfMassMedia generalIssueOfMassMedia) {
		this.generalIssueOfMassMedia = generalIssueOfMassMedia;
	}
	
	@Override
	public void toRead() {
		System.out.println("Number in library: " + 
	                            this.getNumberOfPrintedProductionInLibrary());
		System.out.println(this.getNameOfPrintedProduction());
		System.out.println("Number of issue: " + 
		         this.getNumberOfIssueOfMassMedia() + " from " + 
		                     this.getDateOfIssueOfPrintedProduction());
		System.out.println();
		System.out.println(this.getTextOfPrintedProduction());
		System.out.println();
	}	
	
}
