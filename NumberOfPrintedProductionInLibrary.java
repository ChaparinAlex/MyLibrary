package com.mylibrary.attributes;

public class NumberOfPrintedProductionInLibrary implements Attribute{
	
	private int numberInLibrary;	
	
	public NumberOfPrintedProductionInLibrary(int numberInLibrary) {
		this.numberInLibrary = numberInLibrary;
	}

	public int getNumberInLibrary() {
		return numberInLibrary;
	}

	public void setNumberInLibrary(int numberInLibrary) {
		this.numberInLibrary = numberInLibrary;
	}

	@Override
	public String toString() {
		return "" + numberInLibrary;
	}	

}
