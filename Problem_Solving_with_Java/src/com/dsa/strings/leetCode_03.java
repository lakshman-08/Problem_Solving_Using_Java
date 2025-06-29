package com.dsa.strings;
import java.util.*;
/*
 Problem-03 =Given a string s, find the length of the longest substring without duplicate characters.

Example 1:
Input: s = "abcabcbb"
Output: 3
Explanation: The answer is "abc", with the length of 3.

Example 2:
Input: s = "bbbbb"
Output: 1
Explanation: The answer is "b", with the length of 1.

Example 3:
Input: s = "pwwkew"
Output: 3
Explanation: The answer is "wke", with the length of 3.
Notice that the answer must be a substring, "pwke" is a subsequence and not a substring. 
 */
public class leetCode_03 {
	 public int lengthOfLongestSubstring(String s) {
	        int l=0;
	        int ans=0;
	        int n=s.length();
	        Set<Character> hs=new HashSet<>();
	        for(int r=0;r<n;r++)
	        {
	            char ch=s.charAt(r);
	            if(!hs.contains(ch))
	            {
	                hs.add(ch);
	            }
	            else{
	                while(hs.contains(ch))
	                {
	                    hs.remove(s.charAt(l));
	                    l++;
	                }
	                hs.add(ch);
	            }

	            ans=Math.max(r-l+1,ans);
	        }

	        return ans;
	    }
}
