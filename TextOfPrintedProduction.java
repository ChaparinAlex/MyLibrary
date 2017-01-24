package com.mylibrary.attributes;

public class TextOfPrintedProduction {
	
	private String textOfPrintedProduction;

	public TextOfPrintedProduction(String textOfPrintedProduction) {
		this.textOfPrintedProduction = textOfPrintedProduction;
	}

	public String getTextOfPrintedProduction() {
		return textOfPrintedProduction;
	}

	public void setTextOfPrintedProduction(String textOfPrintedProduction) {
		this.textOfPrintedProduction = textOfPrintedProduction;
	}

	@Override
	public String toString() {
		return "" + textOfPrintedProduction;
	}

}
