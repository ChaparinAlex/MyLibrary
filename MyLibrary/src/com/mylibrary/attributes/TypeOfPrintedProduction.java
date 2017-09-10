package com.mylibrary.attributes;

public enum TypeOfPrintedProduction implements Attribute{
	
	BOOK{
			@Override
			public String toString(){
				return "Book";
			}
		},
	NEWSPAPER{
			@Override
			public String toString(){
				return "Newspaper";
			}
		},
	MAGAZINE{
			@Override
			public String toString(){
				return "Magazine";
			}
		};
		
}
	

