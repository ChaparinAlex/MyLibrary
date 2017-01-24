package com.mylibrary.attributes;

public class NumberOfIssueOfMassMedia implements Attribute{
	
	private int numberOfIssueOfMassMedia;

	public NumberOfIssueOfMassMedia(int numberOfIssueOfMassMedia) {
		this.numberOfIssueOfMassMedia = numberOfIssueOfMassMedia;
	}
	

	public int getNumberOfIssueOfMassMedia() {
		return numberOfIssueOfMassMedia;
	}


	public void setNumberOfIssueOfMassMedia(int numberOfIssueOfMassMedia) {
		this.numberOfIssueOfMassMedia = numberOfIssueOfMassMedia;
	}


	@Override
	public String toString() {
		return "" + numberOfIssueOfMassMedia;
	}	

}
