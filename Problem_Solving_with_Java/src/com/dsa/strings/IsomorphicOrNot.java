package com.dsa.strings;
import java.util.*;

/*  
 * Two strings s and t are isomorphic if the characters in s can be replaced to get t.
All occurrences of a character must be replaced with another character while preserving the order of characters. No two characters may map to the same character, but a character may map to itself. 

Example 1:
Input: s = "egg", t = "add"

Output: true

Explanation:
The strings s and t can be made identical by:

Mapping 'e' to 'a'.
Mapping 'g' to 'd'.
Example 2:

Input: s = "foo", t = "bar"

Output: false

Explanation:

The strings s and t can not be made identical as 'o' needs to be mapped to both 'a' and 'r'.

Example 3:
Input: s = "paper", t = "title"

Output: true
 * 
 * 
 * */

public class IsomorphicOrNot {
	public boolean isIsomorphic(String s, String t) {
        HashMap<Character,Character> hm=new HashMap<Character,Character>();
        for(int i=0;i<s.length();i++)
        {
            if(hm.containsKey(s.charAt(i)))
            {
                if(!hm.get(s.charAt(i)).equals(t.charAt(i)))
                {
                    return false;
                }
            }
            else{
                if(hm.containsValue(t.charAt(i)))
                {
                    return false;
                }
                hm.put(s.charAt(i),t.charAt(i));
            }
        }
        return true;
        
    }
}
