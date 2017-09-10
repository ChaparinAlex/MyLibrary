package com.mylibrary.service;

import java.util.Collection;
import java.util.Set;

import com.mylibrary.attributes.Attribute;
import com.mylibrary.printed_production.PrintedProduction;

public interface PrintedProductionService {
    
	void addPrintedProductionToLibrary();
	void removePrintedProductionFromLibrary(PrintedProduction printedProduction);
	void readPrintedProduction(PrintedProduction printedProduction);
	Set<PrintedProduction> findPrintedProductionByAttributes(Attribute 
			attribute, String attributeValue);
	String foundPrintedProductionToString(Collection<PrintedProduction> collection);
	
}
