package com.mylibrary.attributes;

public class DateOfIssueOfPrintedProduction implements Attribute{
	
	private int day;
	private int month;
	private int year;
	private String dateOfIssueOfPrintedProduction;
	
	public DateOfIssueOfPrintedProduction(String dateOfIssueOfPrintedProduction){
		this.dateOfIssueOfPrintedProduction = 
				                         dateOfIssueOfPrintedProduction.trim();
		String[] dateElements = new String[3];
		dateElements = this.dateOfIssueOfPrintedProduction.split("/");
		this.day = Integer.parseInt(dateElements[0]);
		this.month = Integer.parseInt(dateElements[1]);
		this.year = Integer.parseInt(dateElements[2]);		
	}

	public String getDateOfIssueOfPrintedProduction() {
		return dateOfIssueOfPrintedProduction;
	}

	public void setDateOfIssueOfPrintedProduction(String dateOfIssueOfPrintedProduction) {
		this.dateOfIssueOfPrintedProduction = dateOfIssueOfPrintedProduction;
	}

	public int getDay() {
		return day;
	}

	public void setDay(int day) {
		this.day = day;
	}

	public int getMonth() {
		return month;
	}

	public void setMonth(int month) {
		this.month = month;
	}

	public int getYear() {
		return year;
	}

	public void setYear(int year) {
		this.year = year;
	}

	@Override
	public String toString() {
		return "" + dateOfIssueOfPrintedProduction;
	}	

}
