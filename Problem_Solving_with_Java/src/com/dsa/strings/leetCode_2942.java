package com.dsa.strings;
import java.util.*;
/* 
 ProblemNo-2942
 You are given a 0-indexed array of strings words and a character x.
Return an array of indices representing the words that contain the character x.
Note that the returned array may be in any order.

 
Example 1:
Input: words = ["leet","code"], x = "e"
Output: [0,1]
Explanation: "e" occurs in both words: "leet", and "code". Hence, we return indices 0 and 1.

Example 2:
Input: words = ["abc","bcd","aaaa","cbc"], x = "a"
Output: [0,2]
Explanation: "a" occurs in "abc", and "aaaa". Hence, we return indices 0 and 2.

Example 3:
Input: words = ["abc","bcd","aaaa","cbc"], x = "z"
Output: []
Explanation: "z" does not occur in any of the words. Hence, we return an empty array.
 */
public class leetCode_2942 {
	
	public List<Integer> findWordsContaining(String[] words, char x) {
        List<Integer> charList=new ArrayList<>();
        int n=words.length;
        for(int i=0;i<n;i++)
        {
            int strlen=words[i].length();
            for(int j=0;j<strlen;j++)
            {
                if(words[i].charAt(j)==x)
                {
                    charList.add(i);
                    break;
                }
            }
        }
        return charList;
    }

}
