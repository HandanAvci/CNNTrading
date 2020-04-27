package com.regression;

public enum AllMyPageTitle {
	
	MARKETS("Stock Market Data - Dow Jones, Nasdaq, S&P 500 - CNNMoney"),
	TECH("Tech News - Latest Technology Headlines and Trends on CNN Business - CNN"),
   MEDIA("Media News - Latest Headlines on CNN Business - CNN"),
    SUCCSESS("Careers - News for Entrepreneurs and Leaders on CNN Business - CNN"),
	PERSPECTIVES("Analysis – CNN Business - CNN"),
	VIDEOS("Videos - CNN Business - CNN");
	private String title;
	
	public String getTitle() { //can go out
		return title;
	}

	private AllMyPageTitle(String title) { //can not go out
		this.title=title;
	
		
	}
	

}

//enum is special class that represents a group of unchangeable variables, 
//like final variables.
//For creat an enum ,use the enum keyword(instead of class or interface)
//and separate the constants with a comma,
//also that they should be in uppercase letters.




