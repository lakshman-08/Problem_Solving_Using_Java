package com.dsa.arrays;

public class frequencyOfArray {

	public static void main(String[] args) {
		String str="Hello World";
		int[] freq = new int[26]; // Array to store frequency of a-z

	    // Count frequency of each character
	    for (int i = 0; i < str.length(); i++) {
	      freq[str.charAt(i) - 'a']++;
	    }

	    // Print characters with non-zero frequency
	    for (int i = 0; i < 26; i++) {
	      if (freq[i] != 0) {
	        System.out.print((char)(i + 'a') + "" + freq[i] + " ");
	      }
	    }

	}

}
