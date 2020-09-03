package com.zeraki.technologies;

public class ReverseStrings {

	public static void main(String[] args) {

 System.out.println(reverseEm("Lorem at"));		
 System.out.println(trial("Tempor ip"));		

	}
	
	//method 1
	public static String reverseEm(String moni) {
		 String ExtractedString = moni.substring(0, 4);
		 String ExtractedString2 = moni.substring(4, 8);
		 
		 StringBuilder  moni1 = new StringBuilder();
		 moni1.append(ExtractedString).reverse();
		 
		 StringBuilder  moni2 = new StringBuilder();
		 moni2.append(ExtractedString2).reverse();
		
		return   moni1 + String.join( moni1, moni2);
	}
//	method 2
	public static String trial(String word) {
		 String ExtractedString = word.substring(0, 3);
		 String ExtractedString2 = word.substring(3,7);
		 String ExtractedString3 = word.substring(7, word.length());
		 StringBuilder  ke = new StringBuilder();
		 ke.append(ExtractedString).reverse();
		 StringBuilder  ke2 = new StringBuilder();
		 ke2.append(ExtractedString2).reverse();
		 StringBuilder  ke3 = new StringBuilder();
		 ke3.append(ExtractedString3).reverse(); 
		 
		 String conc = String.join(  ke2, ke, ke3).toString();
		return  conc;
	}
}
