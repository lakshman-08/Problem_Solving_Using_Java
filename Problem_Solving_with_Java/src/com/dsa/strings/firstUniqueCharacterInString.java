package com.dsa.strings;

/*Given a string s, find the first non-repeating character in it and return its index. If it does not exist, return -1.

Example 1:
Input: s = "leetcode"

Output: 0

Explanation:
The character 'l' at index 0 is the first character that does not occur at any other index.

Example 2:
Input: s = "loveleetcode"

Output: 2

Example 3:
Input: s = "aabb"

Output: -1*/
public class firstUniqueCharacterInString {
	 public int firstUniqChar(String s) {
	        
	        int[] freq=new int[26];
	        char[] chars=s.toCharArray();
	        for(char ch:chars)
	        {
	            freq[ch-'a']++;
	        }
	        
	        for(int i=0;i<chars.length;i++)
	        {
	            if(freq[chars[i]-'a']==1)
	            {
	                return i;
	            }
	        }
	        return -1;
	        
	    }
}
