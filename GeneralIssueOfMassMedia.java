package com.mylibrary.attributes;

public class GeneralIssueOfMassMedia {
	
	private int generalIssueOfMassMedia;

	public GeneralIssueOfMassMedia(int generalIssueOfMassMedia) {
		this.generalIssueOfMassMedia = generalIssueOfMassMedia;
	}

	public int getGeneralIssueOfMassMedia() {
		return generalIssueOfMassMedia;
	}

	public void setGeneralIssueOfMassMedia(int generalIssueOfMassMedia) {
		this.generalIssueOfMassMedia = generalIssueOfMassMedia;
	}
	
	@Override
	public String toString() {
		return "" + generalIssueOfMassMedia;
	}	
	

}
