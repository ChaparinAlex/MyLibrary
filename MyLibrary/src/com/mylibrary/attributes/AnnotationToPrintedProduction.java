package com.mylibrary.attributes;

public class AnnotationToPrintedProduction {
	
	private String annotationToPrintedProduction;

	public AnnotationToPrintedProduction(String annotationToPrintedProduction) {
		this.annotationToPrintedProduction = annotationToPrintedProduction;
	}

	public String getAnnotationToPrintedProduction() {
		return annotationToPrintedProduction;
	}

	public void setAnnotationToPrintedProduction(String annotationToPrintedProduction) {
		this.annotationToPrintedProduction = annotationToPrintedProduction;
	}

	@Override
	public String toString() {
		return "" + annotationToPrintedProduction;
	}	
	
}
