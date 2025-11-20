package com.dsa.virtusapratice;

import java.util.LinkedHashSet;
import java.util.Set;

/*- [ ]  **Remove duplicate characters while preserving first occurrences**
    
    **Problem:** Input: "CsharpstarZ" Output: "CsharptZ" */
public class removeDuplicatespreservingFirst_02 {

	public static void main(String[] args) {
		String str="CsharpstarZ";
		
		Set<Character> removeDuplicates=new LinkedHashSet<>();
		
		for(int i=0;i<str.length();i++)
		{
			removeDuplicates.add(str.charAt(i));
		}
		
		StringBuilder finalResult=new StringBuilder();
		for(Character ch:removeDuplicates)
		{
			finalResult.append(ch);
		}
		
		System.out.println(finalResult.toString());

	}

}
