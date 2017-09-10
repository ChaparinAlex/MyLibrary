package com.mylibrary.attributes;

public class NameOfPrintedProduction implements Attribute{
	
	private String nameOfPrintedProduction;
	
	public NameOfPrintedProduction(String nameOfPrintedProduction) {
		this.nameOfPrintedProduction = nameOfPrintedProduction;
	}
	
	public String getNameOfPrintedProduction() {
		return nameOfPrintedProduction;
	}

	public void setNameOfPrintedProduction(String nameOfPrintedProduction) {
		this.nameOfPrintedProduction = nameOfPrintedProduction;
	}

	@Override
	public String toString() {
		return "" + nameOfPrintedProduction;
	}	

}
