package com.mylibrary.attributes;

public class LanguageOfPrintedProduction implements Attribute{
	
	private String languageOfPrintedProduction;

	public LanguageOfPrintedProduction(String languageOfPrintedProduction) {
		this.languageOfPrintedProduction = languageOfPrintedProduction;
	}

	public String getLanguageOfPrintedProduction() {
		return languageOfPrintedProduction;
	}

	public void setLanguageOfPrintedProduction(String languageOfPrintedProduction) {
		this.languageOfPrintedProduction = languageOfPrintedProduction;
	}

	@Override
	public String toString() {
		return "" + languageOfPrintedProduction;
	}

}
