package com.dsa.strings;
import java.util.*;

/*A string is good if there are no repeated characters.

Given a string s​​​​​, return the number of good substrings of length three in s​​​​​​.

Note that if there are multiple occurrences of the same substring, every occurrence should be counted.

A substring is a contiguous sequence of characters in a string.

 

Example 1:

Input: s = "xyzzaz"
Output: 1
Explanation: There are 4 substrings of size 3: "xyz", "yzz", "zza", and "zaz". 
The only good substring of length 3 is "xyz".
Example 2:

Input: s = "aababcabc"
Output: 4
Explanation: There are 7 substrings of size 3: "aab", "aba", "bab", "abc", "bca", "cab", and "abc".
The good substrings are "abc", "bca", "cab", and "abc".
 */
public class CountOfsubStringsWithSize {

	public int countGoodSubstrings(String s) {
        int l=0;
        int ans=0;
        int k=3;
        Map<Character,Integer> hm=new HashMap<>();
        for(int r=0;r<s.length();r++)
        {
            char ch=s.charAt(r);
            hm.put(ch,hm.getOrDefault(ch,0)+1);

            if(r-l==k)
            {
                char tch=s.charAt(l);
                hm.put(tch,hm.get(tch)-1);
                if(hm.get(tch)==0)
                {
                    hm.remove(tch);
                }
                l++;
            }

            if(hm.size()==k)
            {
                ans+=1;
            }
        }

        return ans;
    }
}
