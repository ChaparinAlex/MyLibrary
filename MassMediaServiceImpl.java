package com.mylibrary.service;

import java.util.Collection;
import com.mylibrary.printed_production.PrintedProduction;
import com.mylibrary.storage.Storage;

public abstract class MassMediaServiceImpl implements PrintedProductionService{
	
	@Override
	public void removePrintedProductionFromLibrary(PrintedProduction 
			                                             printedProduction) {
		if(Storage.getStorage().contains(printedProduction)){
			Storage.getStorage().remove(printedProduction);
		}
		Storage.quantityOfPrintedProductionInLibrary--;
		int newNumberInLibrary = 1; 
		for(PrintedProduction pp:Storage.getStorage()){
			pp.getNumberOfPrintedProductionInLibrary().
			                        setNumberInLibrary(newNumberInLibrary++);
		}
	}

	@Override
	public void readPrintedProduction(PrintedProduction printedProduction) {
		printedProduction.toRead();
		
	}	
	
	@Override
	public String foundPrintedProductionToString(
			                       Collection<PrintedProduction> collection) {
		String temp = "";
	    for(PrintedProduction pp:collection){
	    temp += pp.toString();
		}
				
	    return temp;			
    }


}
