package com.string;

public class CountSpaces {
	
	public static void main(String[] args) {
		
		String sentence = "I am learning at The Kiran Academy";
		int space=countSpaces(sentence);
		
		System.out.println("spaces "+ space);
		
		
		//remove space
		String noSpace= removeSpaces(sentence);
		System.out.println(""+noSpace);
		
	}
	
	// spaceCount 
	 public static int countSpaces(String sentence) {
	      int count = 0;
	      for (int i = 0; i < sentence.length(); i++) {
	           if (sentence.charAt(i) == ' ') 
	           {
	                count++;
	           }
	        }
	        return count;
	    }
	 
	 public static String removeSpaces(String sentence) {
		 return sentence.replace(" ", "");
	    }
	 
	 
}
