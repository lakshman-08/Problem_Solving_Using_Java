package com.dsa.virtusapratice;
/* - [ ]  **Reverse each word in a sentence**
    
    **Problem:** Given a sentence, reverse each word individually without changing their order.
    
    **Example:** "Hello World" → "olleH dlroW"*/
public class reverseString_01 {

	public static void main(String[] args) {	
     String str="Hello World";
     String[] words=str.split(" ");
     StringBuilder reverseSentence=new StringBuilder();
     
     for(String w:words)
     {
    	 StringBuilder reverseWords=new StringBuilder(w);
    	 reverseWords.reverse();
    	 reverseSentence.append(reverseWords).append(" ");
    	 
    	 reverseSentence.toString().trim();
     }
     
     System.out.println(reverseSentence);
     
     
	}
}
